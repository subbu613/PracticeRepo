package com.jvm.applet.classfile;

/********************************************************************

Copyright (c) 1996 Artima Software Company. All Rights Reserved.

PROJECT:	JavaWorld
MODULE:		Under The Hood
FILE:		FlyingClassFiles.java

AUTHOR:		Bill Venners, June 1996

DESCRIPTION:

This applet is a simple button that plays an audio clip when pushed.

*********************************************************************/


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.applet.AudioClip;
import java.awt.Event;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;

public class FlyingClassFiles extends java.applet.Applet implements Runnable {

    URL theURL;
    private AudioClip yeehaa;
    private Thread runner;
    private boolean startClip = false;
    private boolean urlExceptionWasThrown = false;

    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void stop() {
        if (runner != null) {
            if (yeehaa != null) {
                yeehaa.stop();
            }
            runner.stop();
            runner = null;
        }
    }

    public void init() {
        super.init();

        String url = getParameter("clipURL");
        try {
            theURL = new URL(url);
        }
        catch (MalformedURLException e) {
            urlExceptionWasThrown = true;
        }

        if (!urlExceptionWasThrown) {
            yeehaa = getAudioClip(theURL);
            setLayout(new BorderLayout());
            add("Center", new Button("Flying Class Files"));
        }
        else {
            setLayout(new BorderLayout());
            add("Center", new Label("Sorry, No Audio"));
        }
    }

    public void run() {

        while (runner != null) {

            if (startClip && yeehaa != null) {
                startClip = false;
                yeehaa.play();
            }

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
            }
        }
    }

    public boolean action(Event evt, Object arg) {
        if (evt.target instanceof Button) {
            String bname = (String) arg;
            if (bname.equals("Flying Class Files")) {
                startClip = true;
            }
        }
        return true;
    }
}
