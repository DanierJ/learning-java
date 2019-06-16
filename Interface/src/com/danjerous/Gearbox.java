package com.danjerous;

public class Gearbox {
    private boolean clutchIsIn;
    private ITelephone phone;

    public void operateClutch (String inOrOut) {
        clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }

    public Gearbox(boolean clutchIsIn, ITelephone phone) {
        this.clutchIsIn = clutchIsIn;
        this.phone = phone;
    }
}
