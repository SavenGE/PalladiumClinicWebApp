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
/*Triage Data Object to help hold triage data for processing*/
public class TriageData {

    /**
     * @return the triageId
     */
    public String getTriageId() {
        return triageId;
    }

    /**
     * @param triageId the triageId to set
     */
    public void setTriageId(String triageId) {
        this.triageId = triageId;
    }

    /**
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return the temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the fever
     */
    public boolean isFever() {
        return fever;
    }

    /**
     * @param fever the fever to set
     */
    public void setFever(boolean fever) {
        this.fever = fever;
    }

    /**
     * @return the tiredness
     */
    public boolean isTiredness() {
        return tiredness;
    }

    /**
     * @param tiredness the tiredness to set
     */
    public void setTiredness(boolean tiredness) {
        this.tiredness = tiredness;
    }

    /**
     * @return the lossOfTaste
     */
    public boolean isLossOfTaste() {
        return lossOfTaste;
    }

    /**
     * @param lossOfTaste the lossOfTaste to set
     */
    public void setLossOfTaste(boolean lossOfTaste) {
        this.lossOfTaste = lossOfTaste;
    }

    /**
     * @return the lossOfSmell
     */
    public boolean isLossOfSmell() {
        return lossOfSmell;
    }

    /**
     * @param lossOfSmell the lossOfSmell to set
     */
    public void setLossOfSmell(boolean lossOfSmell) {
        this.lossOfSmell = lossOfSmell;
    }

    /**
     * @return the soreThroat
     */
    public boolean isSoreThroat() {
        return soreThroat;
    }

    /**
     * @param soreThroat the soreThroat to set
     */
    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    /**
     * @return the headache
     */
    public boolean isHeadache() {
        return headache;
    }

    /**
     * @param headache the headache to set
     */
    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    /**
     * @return the chestPain
     */
    public boolean isChestPain() {
        return chestPain;
    }

    /**
     * @param chestPain the chestPain to set
     */
    public void setChestPain(boolean chestPain) {
        this.chestPain = chestPain;
    }

    /**
     * @return the difficultBreathing
     */
    public boolean isDifficultBreathing() {
        return difficultBreathing;
    }

    /**
     * @param difficultBreathing the difficultBreathing to set
     */
    public void setDifficultBreathing(boolean difficultBreathing) {
        this.difficultBreathing = difficultBreathing;
    }

    /**
     * @return the breathShortness
     */
    public boolean isBreathShortness() {
        return breathShortness;
    }

    /**
     * @param breathShortness the breathShortness to set
     */
    public void setBreathShortness(boolean breathShortness) {
        this.breathShortness = breathShortness;
    }
    private String triageId;
    private String weight;
    private String temperature;
    private boolean fever;
    private boolean tiredness;
    private boolean lossOfTaste;
    private boolean lossOfSmell;
    private boolean soreThroat;
    private boolean headache;
    private boolean chestPain;
    private boolean difficultBreathing;
    private boolean breathShortness;

}
