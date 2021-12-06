/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABEANS;

/**
 *
 * @author neptune
 */
/*Patient Object to help hold patient data for processing*/
public class Patient {

    /**
     * @return the triageData
     */
    public TriageData getTriageData() {
        return triageData;
    }

    /**
     * @param triageData the triageData to set
     */
    public void setTriageData(TriageData triageData) {
        this.triageData = triageData;
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
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    private String patientId;
    private String firstName;
    private String lastName;
    private String phoneNo = "";
    private String idNo = "";
    private String address;
    private String dob;
    private TriageData triageData = new TriageData();
}
