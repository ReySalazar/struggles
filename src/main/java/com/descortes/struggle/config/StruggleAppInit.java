package com.descortes.struggle.config;

import com.descortes.struggle.dataentry.EntryOutpout;
import com.descortes.struggle.dataentry.WelcomeScreen;

public class StruggleAppInit {

    WelcomeScreen welcomeScreen;

    public StruggleAppInit() {
        welcomeScreen = new WelcomeScreen();
    }

    public void start() {
        boolean run = true;
        while (run){
            run = welcomeScreen.execute();
        }
        EntryOutpout.showString("Adiós");
    }

}
