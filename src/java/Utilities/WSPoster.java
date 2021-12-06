/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author neptune
 */
/*Class to Handle Posting to and Reading/Decoding Response from WEB SERVICE*/
public class WSPoster {

    public static JSONObject sendPost(JSONObject postBody) {
        StringBuilder wsCall = new StringBuilder();
        int responseCode = 0;
        JSONObject jsonResponse = new JSONObject();

        try {
            String url = "http://localhost:9090/palladiumWS";

            String postBodyStr = postBody.toString(Constants.JSON_INDENT_FACTOR);

            wsCall.append("\n<wsCall>\n"
                    + "\t<url>").append(url).append("</url>\n"
                    + "<jsonRequest>\n").append("\t").append(postBodyStr).append("\n<jsonRequest>\n");

            // Send post request
            String type = "application/json";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            //add request header
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Length", Integer.toString(postBodyStr.length()));
            con.setRequestProperty("Content-Type", type);
            con.setRequestProperty("charset", "UTF-8");

            con.setDoOutput(true);

            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                wr.writeBytes(postBodyStr);
                wr.flush();
            }
            responseCode = con.getResponseCode();
            wsCall.append("<responseCode>").append(responseCode).append("</responseCode>\n");

            StringBuilder response;
            if (responseCode >= 400) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getErrorStream()))) {
                    String inputLine;
                    response = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                }
            } else {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                    String inputLine;
                    response = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                }
            }
            String responseStr = response.toString();
            wsCall.append("<rawResponse>\n").append("\t").append(responseStr).append("\n</rawResponse>\n");

            jsonResponse = new JSONObject(responseStr);
            wsCall.append("<jsonResponse>\n")
                    .append("\t").append(jsonResponse.toString(Constants.JSON_INDENT_FACTOR))
                    .append("\n<jsonResponse>\n")
                    .append("</wsCall>\n");

        } catch (Exception ex) {
            ex.printStackTrace();
            jsonResponse.put(Constants.RESPONSE_CODE, "ERR_999")
                    .put(Constants.RESPONSE_MSG, "Could Not Send Request [" + ex.getMessage() + "] ");
        }
        Logger.doPrint("WSCall Flow", wsCall.toString());
        return jsonResponse;
    }
}
