package me.day09.practice.practice01;

public class SmartPhone extends MobileElectronic{

    int numOfCameras;
    int numOfSensors;

    public SmartPhone(String productNo, String modelName, String dateOfMade, companyName companies, authMethod authMethods, communicationMethod commumethods, String weight, int numOfCameras, int numOfSensors){
        super(productNo, modelName, dateOfMade, companies, authMethods, commumethods, weight);
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public int getNumOfCameras() {
        return numOfCameras;
    }

    public void setNumOfCameras(int numOfCameras) {
        this.numOfCameras = numOfCameras;
    }

    public int getNumOfSensors() {
        return numOfSensors;
    }

    public void setNumOfSensors(int numOfSensors) {
        this.numOfSensors = numOfSensors;
    }
}
