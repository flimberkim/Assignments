package me.day09.practice.practice01;

enum communicationMethod {FIVE_G, FOUR_G, THREE_G}

public class MobileElectronic extends Electronic {

    communicationMethod commumethods;
    String weight;

    public MobileElectronic(String productNo, String modelName, String dateOfMade, companyName companies, authMethod authMethods, communicationMethod commumethods, String weight){
        super(productNo, modelName, dateOfMade, companies, authMethods);
        this.commumethods = commumethods;
        this.weight = weight;

    }


    public communicationMethod getMethods() {
        return commumethods;
    }

    public void setMethods(communicationMethod commumethods) {
        this.commumethods = commumethods;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
