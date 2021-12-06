/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABEANS;

import Utilities.Constants;
import Utilities.WSPoster;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.json.JSONObject;

/**
 *
 * @author neptune
 */
/*Register with JSF to support UI Components*/
@ManagedBean(name = "loginBean")

/*Bean lives as long as the HTTP session lives. 
It gets created upon the first HTTP request involving this bean 
in the session and gets destroyed when the HTTP session is invalidated*/
@SessionScoped
public class loginBean {

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    private String username = "";
    private String password = "";

    /*Login method called by Login Button in html; 
    validates input and call WS for authentications*/
    public String login() {
        String title = "Notfication", msg = "", nextpage = "";
        Severity severity = FacesMessage.SEVERITY_INFO;
        if (getUsername().trim().equals("")) {
            msg = "Username is Empty";
        } else {
            if (getPassword().trim().equals("")) {
                msg = "Password is Empty";
            } else {
                /* Issue WS Call */
                JSONObject jsonRequest = new JSONObject();
                jsonRequest.put(Constants.OPERATION, Constants.AUTHENTICATE_USER)
                        .put(Constants.USERNAME, username)
                        .put(Constants.PASSWORD, password);

                JSONObject jsonResponse = WSPoster.sendPost(jsonRequest);
                if (jsonResponse.optString(Constants.RESPONSE_CODE).equals(Constants.APPROVED)) {
                    nextpage = "palladiumPortal?faces-redirect=true";
//                    nextpage = "palladiumPortal";
                } else {
                    severity = FacesMessage.SEVERITY_ERROR;
                    msg = jsonResponse.optString(Constants.RESPONSE_MSG);
                }
            }
        }

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, title, msg));
        return nextpage;
    }

    public String logout() {
//        return "/login?faces-redirect=true";
        return "/login";
    }
}
