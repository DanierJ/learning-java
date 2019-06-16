package com.danjerous;

public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    default void hang() {
        System.out.println("Hanging.");
    }

}
