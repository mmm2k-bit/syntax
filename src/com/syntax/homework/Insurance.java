package com.syntax.homework;

public abstract class Insurance {
    private String insuranceName;

    public abstract void getQuote();
    public abstract void cancelInsurance();

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
}
