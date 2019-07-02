package com.danjerous;

public class Main {

    public static void main(String[] args) {
	    StringUtilities utils = new StringUtilities();

	    StringBuilder sb = new StringBuilder();
	    while (sb.length() < 10) {
	        sb.length();
	        utils.addChar(sb, 'a');
        }
        System.out.println(sb);
    }
}
