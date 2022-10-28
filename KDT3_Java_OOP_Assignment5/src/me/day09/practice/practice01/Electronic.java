package me.day09.practice.practice01;

enum companyName {SAMSUNG, LG, APPLE}
enum authMethod {지문인증, 패턴인증, 핀인증, 얼굴인증}
public class Electronic {

    protected String productNo;
    protected String modelName;
    protected String dateOfMade;
    protected companyName companies;
    protected authMethod authMethods;

    public Electronic(){}
    public Electronic(String productNo, String modelName, String dateOfMade, companyName companies, authMethod authMethods){
        this.productNo = productNo;
        this.modelName = modelName;
        this.dateOfMade = dateOfMade;
        this.companies = companies;
        this.authMethods = authMethods;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDateOfMade() {
        return dateOfMade;
    }

    public void setDatOfMade(String datOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public companyName getCompanies() {
        return companies;
    }

    public void setCompanies(companyName companies) {
        this.companies = companies;
    }

    public authMethod getAuthMethods() {
        return authMethods;
    }

    public void setAuthMethods(authMethod authMethods) {
        this.authMethods = authMethods;
    }
}
