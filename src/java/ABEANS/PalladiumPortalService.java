/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABEANS;

import Utilities.Constants;
import Utilities.Logger;
import Utilities.WSPoster;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author neptune
 */
/*Register with JSF to support UI Components*/
@ManagedBean(name = "PalladiumPortalService")

/*Bean lives as long as the HTTP session lives. 
It gets created upon the first HTTP request involving this bean 
in the session and gets destroyed when the HTTP session is invalidated*/
@SessionScoped

public class PalladiumPortalService {

    /**
     * @return the numPatientsInQueue
     */
    public String getNumPatientsInQueue() {
        return numPatientsInQueue;
    }

    /**
     * @param numPatientsInQueue the numPatientsInQueue to set
     */
    public void setNumPatientsInQueue(String numPatientsInQueue) {
        this.numPatientsInQueue = numPatientsInQueue;
    }

    /**
     * @return the todaysDate
     */
    public Date getTodaysDate() {
        return todaysDate;
    }

    /**
     * @param todaysDate the todaysDate to set
     */
    public void setTodaysDate(Date todaysDate) {
        this.todaysDate = todaysDate;
    }

    /**
     * @return the selectedScreenedPatient
     */
    public Patient getSelectedScreenedPatient() {
        return selectedScreenedPatient;
    }

    /**
     * @param selectedScreenedPatient the selectedScreenedPatient to set
     */
    public void setSelectedScreenedPatient(Patient selectedScreenedPatient) {
        this.selectedScreenedPatient = selectedScreenedPatient;
    }

    /**
     * @return the searchScreenedPatientList
     */
    public List<Patient> getSearchScreenedPatientList() {
        return searchScreenedPatientList;
    }

    /**
     * @param searchScreenedPatientList the searchScreenedPatientList to set
     */
    public void setSearchScreenedPatientList(List<Patient> searchScreenedPatientList) {
        this.searchScreenedPatientList = searchScreenedPatientList;
    }

    /**
     * @return the searchScreenedFilteredPatientList
     */
    public List<Patient> getSearchScreenedFilteredPatientList() {
        return searchScreenedFilteredPatientList;
    }

    /**
     * @param searchScreenedFilteredPatientList the
     * searchScreenedFilteredPatientList to set
     */
    public void setSearchScreenedFilteredPatientList(List<Patient> searchScreenedFilteredPatientList) {
        this.searchScreenedFilteredPatientList = searchScreenedFilteredPatientList;
    }

    /**
     * @return the searchScreenedPatientMode
     */
    public String getSearchScreenedPatientMode() {
        return searchScreenedPatientMode;
    }

    /**
     * @param searchScreenedPatientMode the searchScreenedPatientMode to set
     */
    public void setSearchScreenedPatientMode(String searchScreenedPatientMode) {
        this.searchScreenedPatientMode = searchScreenedPatientMode;
    }

    /**
     * @return the searchScreenedPatientValue
     */
    public String getSearchScreenedPatientValue() {
        return searchScreenedPatientValue;
    }

    /**
     * @param searchScreenedPatientValue the searchScreenedPatientValue to set
     */
    public void setSearchScreenedPatientValue(String searchScreenedPatientValue) {
        this.searchScreenedPatientValue = searchScreenedPatientValue;
    }

    /**
     * @return the triagePatient
     */
    public Patient getTriagePatient() {
        return triagePatient;
    }

    /**
     * @param triagePatient the triagePatient to set
     */
    public void setTriagePatient(Patient triagePatient) {
        this.triagePatient = triagePatient;
    }

    /**
     * @return the searchTriagePatientValue
     */
    public String getSearchTriagePatientValue() {
        return searchTriagePatientValue;
    }

    /**
     * @param searchTriagePatientValue the searchTriagePatientValue to set
     */
    public void setSearchTriagePatientValue(String searchTriagePatientValue) {
        this.searchTriagePatientValue = searchTriagePatientValue;
    }

    /**
     * @return the searchTriagePatientMode
     */
    public String getSearchTriagePatientMode() {
        return searchTriagePatientMode;
    }

    /**
     * @param searchTriagePatientMode the searchTriagePatientMode to set
     */
    public void setSearchTriagePatientMode(String searchTriagePatientMode) {
        this.searchTriagePatientMode = searchTriagePatientMode;
    }

    /**
     * @return the triagePatientsList
     */
    public List<Patient> getTriagePatientsList() {
        return triagePatientsList;
    }

    /**
     * @param triagePatientsList the triagePatientsList to set
     */
    public void setTriagePatientsList(List<Patient> triagePatientsList) {
        this.triagePatientsList = triagePatientsList;
    }

    /**
     * @return the triagePatientsFilteredList
     */
    public List<Patient> getTriagePatientsFilteredList() {
        return triagePatientsFilteredList;
    }

    /**
     * @param triagePatientsFilteredList the triagePatientsFilteredList to set
     */
    public void setTriagePatientsFilteredList(List<Patient> triagePatientsFilteredList) {
        this.triagePatientsFilteredList = triagePatientsFilteredList;
    }

    /**
     * @return the searchAll
     */
    public String getSearchAll() {
        return searchAll;
    }

    /**
     * @param searchAll the searchAll to set
     */
    public void setSearchAll(String searchAll) {
        this.searchAll = searchAll;
    }

    /**
     * @return the filteredPatientsList
     */
    public List<Patient> getFilteredPatientsList() {
        return filteredPatientsList;
    }

    /**
     * @param filteredPatientsList the filteredPatientsList to set
     */
    public void setFilteredPatientsList(List<Patient> filteredPatientsList) {
        this.filteredPatientsList = filteredPatientsList;
    }

    /**
     * @return the selectedPatient
     */
    public Patient getSelectedPatient() {
        return selectedPatient;
    }

    /**
     * @param selectedPatient the selectedPatient to set
     */
    public void setSelectedPatient(Patient selectedPatient) {
        this.selectedPatient = selectedPatient;
    }

    /**
     * @return the searchByPatientPhone
     */
    public String getSearchByPatientPhone() {
        return searchByPatientPhone;
    }

    /**
     * @param searchByPatientPhone the searchByPatientPhone to set
     */
    public void setSearchByPatientPhone(String searchByPatientPhone) {
        this.searchByPatientPhone = searchByPatientPhone;
    }

    /**
     * @return the searchByPatientIDNO
     */
    public String getSearchByPatientIDNO() {
        return searchByPatientIDNO;
    }

    /**
     * @param searchByPatientIDNO the searchByPatientIDNO to set
     */
    public void setSearchByPatientIDNO(String searchByPatientIDNO) {
        this.searchByPatientIDNO = searchByPatientIDNO;
    }

    /**
     * @return the searchPatientList
     */
    public List<Patient> getSearchPatientList() {
        return searchPatientList;
    }

    /**
     * @param searchPatientList the searchPatientList to set
     */
    public void setSearchPatientList(List<Patient> searchPatientList) {
        this.searchPatientList = searchPatientList;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the patientId
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the searchPatientValue
     */
    public String getSearchPatientValue() {
        return searchPatientValue;
    }

    /**
     * @param searchPatientValue the searchPatientValue to set
     */
    public void setSearchPatientValue(String searchPatientValue) {
        this.searchPatientValue = searchPatientValue;
    }

    /**
     * @return the searchPatientMode
     */
    public String getSearchPatientMode() {
        return searchPatientMode;
    }

    /**
     * @param searchPatientMode the searchPatientMode to set
     */
    public void setSearchPatientMode(String searchPatientMode) {
        this.searchPatientMode = searchPatientMode;
    }

    /**
     * @return the idNo
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * @param idNo the idNo to set
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /*Patient Properties*/
    private String patientId;
    private String firstName;
    private String lastName;
    private String phoneNo = "";
    private String idNo = "";
    private String address;
    private Date dob;
    private Date todaysDate = new Date();

    private String searchPatientValue = "";
    private String searchPatientMode = Constants.ALL;
    private String searchAll = Constants.ALL;
    private String searchByPatientPhone = Constants.PHONENO;
    private String searchByPatientIDNO = Constants.IDNO;

    private List<Patient> searchPatientList,
            filteredPatientsList;
    private Patient selectedPatient;

    /*Triage Patients*/
    private String searchTriagePatientMode, searchTriagePatientValue;
    private List<Patient> triagePatientsList,
            triagePatientsFilteredList;
    private Patient triagePatient;
    private String numPatientsInQueue = "0";

    /*Screened Patients*/
    private String searchScreenedPatientMode = "ALL";
    private String searchScreenedPatientValue = "";
    private List<Patient> searchScreenedPatientList,
            searchScreenedFilteredPatientList;
    private Patient selectedScreenedPatient;

    public PalladiumPortalService() {
    }

    /*savePatient method collects input patient data and calls API to save*/
    public void savePatient() {
        FacesMessage.Severity severity = FacesMessage.SEVERITY_INFO;
        String title = "", msg = "";

        /* Issue WS Call */
        JSONObject jsonRequest = new JSONObject();
        jsonRequest.put(Constants.OPERATION, Constants.SAVE_PATIENT)
                .put(Constants.FIRSTNAME, getFirstName())
                .put(Constants.LASTNAME, getLastName())
                .put(Constants.PHONENO, getPhoneNo())
                .put(Constants.IDNO, getIdNo())
                .put(Constants.ADDRESS, getAddress())
                .put(Constants.DOB, new SimpleDateFormat("dd/MM/yyyy").format(getDob()));

        JSONObject jsonResponse = WSPoster.sendPost(jsonRequest);
        msg = jsonResponse.optString(Constants.RESPONSE_MSG);
        if (!jsonResponse.optString(Constants.RESPONSE_CODE).equals(Constants.APPROVED)) {
            msg = jsonResponse.optString(Constants.RESPONSE_MSG);
        } else {
            searchPatient();
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, title, msg));
    }

    public void nullifyPatientData() {
        setPatientId("");
        setFirstName("");
        setLastName("");
        setPhoneNo("");
        setIdNo("");
        setAddress("");
        setDob(new Date());
    }

    /*searchPatient method collects patient search parameters, 
    calls search API, and updates relevant UI components*/
    public void searchPatient() {
        FacesMessage.Severity severity = FacesMessage.SEVERITY_INFO;
        String title = "", msg = "";
        boolean proceed = false;

        if (getSearchPatientMode().equals("")) {
            severity = FacesMessage.SEVERITY_WARN;
            title = "";
            msg = "Please Select A Search Mode.";
        } else if ((!getSearchPatientMode().equals(Constants.ALL)) && (getSearchPatientValue().equals(""))) {
            severity = FacesMessage.SEVERITY_WARN;
            title = "";
            msg = "Please Input A Search Value.";
        } else {
            proceed = true;
        }
        if (proceed) {
            /* Issue WS Call */
            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put(Constants.OPERATION, Constants.SEARCH_PATIENT)
                    .put(Constants.SEARCH_TAG, getSearchPatientMode())
                    .put(Constants.SEARCH_VALUE, getSearchPatientValue());

            JSONObject jsonResponse = WSPoster.sendPost(jsonRequest);
            if (jsonResponse.optString(Constants.RESPONSE_CODE).equals(Constants.APPROVED)) {
//                Logger.doPrint("searchPatient", "1");
                JSONArray patients = jsonResponse.getJSONArray("PATIENTS");
                Logger.doPrint("searchPatient", "2");
                List<Patient> patientList = new LinkedList<>();
                for (int i = 0; i < patients.length(); i++) {
                    Logger.doPrint("searchPatient", "3");
                    JSONObject jsonPatient = patients.getJSONObject(i);
                    Patient patient = new Patient();
                    patient.setPatientId(jsonPatient.optString(Constants.PATIENTID));
                    patient.setFirstName(jsonPatient.optString(Constants.FIRSTNAME));
                    patient.setLastName(jsonPatient.optString(Constants.LASTNAME));
                    patient.setPhoneNo(jsonPatient.optString(Constants.PHONENO));
                    patient.setIdNo(jsonPatient.optString(Constants.IDNO));
                    patient.setAddress(jsonPatient.optString(Constants.ADDRESS));
                    patient.setDob(jsonPatient.optString(Constants.DOB));
                    patientList.add(patient);
                    Logger.doPrint("searchPatient", "4");
                }
                setSearchPatientList(patientList);
                if (getSearchPatientList().isEmpty()) {
                    Logger.doPrint("searchPatient", "5");
                    severity = FacesMessage.SEVERITY_WARN;
                    title = "";
                    msg = "No Patient Found for Search Value [" + getSearchPatientValue() + "]";
                }
            } else {
                severity = FacesMessage.SEVERITY_WARN;
                title = "";
                msg = jsonResponse.optString(Constants.RESPONSE_MSG);
            }
        }
        if (!"".equals(msg)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, title, msg));
        }
    }

    /*To show possibility of modifying existing patient data*/
    public void onPatientAction(String Action) {
        String title = "Notfication", msg = "", nextpage = "";
        FacesMessage.Severity severity = FacesMessage.SEVERITY_INFO;

        if (getSelectedPatient() == null) {
            msg = "Please Select A Patient.";
            severity = FacesMessage.SEVERITY_FATAL;

        } else {
            msg = "Patient " + getSelectedPatient().getFirstName() + " " + getSelectedPatient().getLastName() + " Can Be [" + Action + "] ";
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, title, msg));
    }

    /*searchTriagePatient calls search API to fetch one patient, 
    top of the queue for triage, 
    and updates relevant UI components*/
    public void searchTriagePatient() {
        FacesMessage.Severity severity = FacesMessage.SEVERITY_INFO;
        String title = "", msg = "";

        /* Issue WS Call */
        JSONObject jsonRequest = new JSONObject();
        jsonRequest.put(Constants.OPERATION, Constants.SEARCH_TRIAGE_PATIENT);
        JSONObject jsonResponse = WSPoster.sendPost(jsonRequest);
        Patient patient = new Patient();
        if (jsonResponse.optString(Constants.RESPONSE_CODE).equals(Constants.APPROVED)) {
            JSONObject jsonPatient = jsonResponse.optJSONObject(Constants.PATIENT);
            patient.setPatientId(jsonPatient.optString(Constants.PATIENTID));
            patient.getTriageData().setTriageId(jsonPatient.optString(Constants.TRIAGEID));
            patient.setFirstName(jsonPatient.optString(Constants.FIRSTNAME));
            patient.setLastName(jsonPatient.optString(Constants.LASTNAME));
            patient.setPhoneNo(jsonPatient.optString(Constants.PHONENO));
            patient.setIdNo(jsonPatient.optString(Constants.IDNO));
            patient.setAddress(jsonPatient.optString(Constants.ADDRESS));
            patient.setDob(jsonPatient.optString(Constants.DOB));
            setNumPatientsInQueue(jsonPatient.optString(Constants.TRIAGE_QUEUE_NUM));
        } else {
            severity = FacesMessage.SEVERITY_WARN;
            title = "";
            msg = jsonResponse.optString(Constants.RESPONSE_MSG);
            setNumPatientsInQueue("0");
        }
        setTriagePatient(patient);

        if (!"".equals(msg)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, title, msg));
        }
    }

    /*saveTriageData method collects input patient triage data 
    and calls API to save or suspend*/
    public void saveTriageData(String action) {
        FacesMessage.Severity severity = FacesMessage.SEVERITY_INFO;
        String title = "", msg = "";

        /* Issue WS Call */
        JSONObject jsonRequest = new JSONObject();
        jsonRequest.put(Constants.OPERATION, action.equals("SAVE")
                ? Constants.SAVE_TRIAGE_DATA : Constants.SUSPEND_TRIAGE_DATA)
                .put(Constants.PATIENTID, getTriagePatient().getPatientId())
                .put(Constants.TRIAGEID, getTriagePatient().getTriageData().getTriageId())
                .put(Constants.WEIGHT, getTriagePatient().getTriageData().getWeight())
                .put(Constants.TEMPERATURE, getTriagePatient().getTriageData().getTemperature())
                .put(Constants.FEVER, getTriagePatient().getTriageData().isFever())
                .put(Constants.TIREDNESS, getTriagePatient().getTriageData().isTiredness())
                .put(Constants.LOSS_OF_TASTE, getTriagePatient().getTriageData().isLossOfTaste())
                .put(Constants.LOSS_OF_SMELL, getTriagePatient().getTriageData().isLossOfSmell())
                .put(Constants.SORE_THROAT, getTriagePatient().getTriageData().isSoreThroat())
                .put(Constants.HEADACHE, getTriagePatient().getTriageData().isHeadache())
                .put(Constants.CHEST_PAIN, getTriagePatient().getTriageData().isChestPain())
                .put(Constants.DIFFICULT_BREATHING, getTriagePatient().getTriageData().isDifficultBreathing())
                .put(Constants.BREATH_SHORTNESS, getTriagePatient().getTriageData().isBreathShortness());

        JSONObject jsonResponse = WSPoster.sendPost(jsonRequest);
        msg = jsonResponse.optString(Constants.RESPONSE_MSG);
        if (!jsonResponse.optString(Constants.RESPONSE_CODE).equals(Constants.APPROVED)) {
            msg = jsonResponse.optString(Constants.RESPONSE_MSG);
        } else {
            searchTriagePatient();
            searchScreenedPatients();
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, title, msg));
    }

    /*searchScreenedPatients method collects patient search parameters, 
    calls search API, and updates relevant UI components*/
    public void searchScreenedPatients() {
        FacesMessage.Severity severity = FacesMessage.SEVERITY_INFO;
        String title = "", msg = "";
        boolean proceed = false;
        List<Patient> patientList = new LinkedList<>();
        setSearchScreenedPatientList(patientList);

        if (getSearchScreenedPatientMode().equals("")) {
            severity = FacesMessage.SEVERITY_WARN;
            title = "";
            msg = "Please Select A Search Mode.";
        } else if ((!getSearchScreenedPatientMode().equals(Constants.ALL)) && (getSearchScreenedPatientValue().equals(""))) {
            severity = FacesMessage.SEVERITY_WARN;
            title = "";
            msg = "Please Input A Search Value.";
        } else {
            proceed = true;
        }
        if (proceed) {
            /* Issue WS Call */
            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put(Constants.OPERATION, Constants.SEARCH_SCREENED_PATIENT)
                    .put(Constants.SEARCH_TAG, getSearchScreenedPatientMode())
                    .put(Constants.SEARCH_VALUE, getSearchScreenedPatientValue());

            JSONObject jsonResponse = WSPoster.sendPost(jsonRequest);
            if (jsonResponse.optString(Constants.RESPONSE_CODE).equals(Constants.APPROVED)) {
                JSONArray patients = jsonResponse.getJSONArray("PATIENTS");
                /*{
    "PHONENO": "254711996446",
    "SORE_THROAT": "Y",
    "FIRSTNAME": "fname",
    "LOSS_OF_SMELL": "N",
    "CHEST_PAIN": "N",
    "TEMPERATURE": "36",
    "LASTNAME": "lname",
    "LOSS_OF_TASTE": "N",
    "HEADACHE": "N",
    "DOB": "5/8/9659",
    "DIFFICULT_BREATHING": "N",
    "ADDRESS": "65 kilgoris",
    "TIREDNESS": "N",
    "BREATH_SHORTNESS": "N",
    "WEIGHT": "52",
    "PATIENTID": "04122117175884",
    "IDNO": "96857485",
    "FEVER": "N"
                 */

                for (int i = 0; i < patients.length(); i++) {
                    JSONObject jsonPatient = patients.getJSONObject(i);
                    Patient patient = new Patient();
                    patient.setPatientId(jsonPatient.optString(Constants.PATIENTID));
                    patient.setFirstName(jsonPatient.optString(Constants.FIRSTNAME));
                    patient.setLastName(jsonPatient.optString(Constants.LASTNAME));
                    patient.setPhoneNo(jsonPatient.optString(Constants.PHONENO));
                    patient.setIdNo(jsonPatient.optString(Constants.IDNO));
                    patient.setAddress(jsonPatient.optString(Constants.ADDRESS));
                    patient.setDob(jsonPatient.optString(Constants.DOB));
                    patient.getTriageData().setWeight(jsonPatient.optString(Constants.WEIGHT));
                    patient.getTriageData().setTemperature(jsonPatient.optString(Constants.TEMPERATURE));
                    patient.getTriageData().setFever(jsonPatient.optString(Constants.FEVER).equals("Y"));
                    patient.getTriageData().setTiredness(jsonPatient.optString(Constants.TIREDNESS).equals("Y"));
                    patient.getTriageData().setLossOfTaste(jsonPatient.optString(Constants.LOSS_OF_TASTE).equals("Y"));
                    patient.getTriageData().setLossOfSmell(jsonPatient.optString(Constants.LOSS_OF_SMELL).equals("Y"));
                    patient.getTriageData().setSoreThroat(jsonPatient.optString(Constants.SORE_THROAT).equals("Y"));
                    patient.getTriageData().setHeadache(jsonPatient.optString(Constants.HEADACHE).equals("Y"));
                    patient.getTriageData().setChestPain(jsonPatient.optString(Constants.CHEST_PAIN).equals("Y"));
                    patient.getTriageData().setDifficultBreathing(jsonPatient.optString(Constants.DIFFICULT_BREATHING).equals("Y"));
                    patient.getTriageData().setBreathShortness(jsonPatient.optString(Constants.BREATH_SHORTNESS).equals("Y"));
                    patientList.add(patient);
                }

                setSearchScreenedPatientList(patientList);
                if (getSearchScreenedPatientList().isEmpty()) {
                    severity = FacesMessage.SEVERITY_WARN;
                    title = "";
                    msg = "No Screened Patient Found for Search Value [" + getSearchScreenedPatientValue() + "]";
                }
            } else {
                severity = FacesMessage.SEVERITY_WARN;
                title = "";
                msg = jsonResponse.optString(Constants.RESPONSE_MSG);
            }
        }
        if (!"".equals(msg)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, title, msg));
        }
    }

}
