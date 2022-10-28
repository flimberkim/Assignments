package me.day09.practice.practice01;

import javax.naming.NamingEnumeration;

public class NoneMobileElectronic extends Electronic {

    String address;

    public NoneMobileElectronic(String productNo, String modelName, String dateOfMade, companyName companies, authMethod authMethods, String address){
        super(productNo, modelName, dateOfMade, companies, authMethods);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
