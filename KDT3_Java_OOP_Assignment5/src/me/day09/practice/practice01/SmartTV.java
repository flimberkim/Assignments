package me.day09.practice.practice01;

public class SmartTV extends NoneMobileElectronic{
    int inch;

    public SmartTV(String productNo, String modelName, String dateOfMade, companyName companies, authMethod authMethods, String address, int inch){
        super(productNo, modelName, dateOfMade, companies, authMethods, address);
        this.inch = inch;
    }

    public int getInch(){
        return inch;
    }

    public void setInch(int inch){
        this.inch = inch;
    }
}
