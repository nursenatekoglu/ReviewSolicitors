package com.reviewSolicitors.utility;

public class BrowserUtils {


//This method will accept int (int seconds) and execute Thread.sleep for given duration

    public static void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {

        }
    }








}
