package me.day09.practice.practice01;

public class User extends Member{

    String electronicDevice;
    String paymentPolicy;

    public User(String serialNo, String memberID, String memberPassword, String memberPhoneNumber, String memberEmail, String memberBirthDate, String electronicDevice, String paymentPolicy){
        super(serialNo, memberID, memberPassword, memberPhoneNumber, memberEmail, memberBirthDate);
        this.electronicDevice = electronicDevice;
        this.paymentPolicy = paymentPolicy;
    }

    public String getElectronicDevice() {
        return electronicDevice;
    }

    public void setElectronicDevice(String electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }

    public void showUserInfo(){
        System.out.println(serialNo);
        System.out.println(memberID);
        System.out.println(memberPassword);
        System.out.println(memberPhoneNumber);
        System.out.println(memberEmail);
        System.out.println(memberBirthDate);
    }

}
