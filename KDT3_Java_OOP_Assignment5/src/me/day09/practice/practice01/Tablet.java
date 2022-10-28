package me.day09.practice.practice01;

public class Tablet extends MobileElectronic{

    boolean hasPencil;

    public Tablet(String productNo, String modelName, String dateOfMade, companyName companies, authMethod authMethods, communicationMethod commumethods, String weight, boolean hasPencil){
        super(productNo, modelName, dateOfMade, companies, authMethods, commumethods, weight);
        this.hasPencil = hasPencil;
    }

    public boolean isHasPencil() {
        return hasPencil;
    }

    public void setHasPencil(boolean hasPencil) {
        this.hasPencil = hasPencil;
    }
}
