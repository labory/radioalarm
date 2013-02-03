package com.carcasser.radioalarm;

import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.TrayIcon;

/**
 * Main class.
 */
public class Alarm {

    public static void main(String[] args) {
        try {
            SystemTray.getSystemTray().add(
                    new TrayIcon(((ImageIcon) UIManager.getIcon("FileView.computerIcon")).getImage(),
                            "invisible application"));
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
