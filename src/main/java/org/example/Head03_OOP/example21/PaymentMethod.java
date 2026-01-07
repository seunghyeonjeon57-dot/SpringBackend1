package org.example.Head03_OOP.example21;

public enum PaymentMethod {
    CREDIT_CARD("123"),
    ACCOUNT_TRANSFER("456"),
    MOBILE_PAYMENT("789");

    private final String displayName;

    PaymentMethod(String displayName){
        this.displayName = displayName;

    }
    public String getDisplayName(){
        return displayName;
    }




}



