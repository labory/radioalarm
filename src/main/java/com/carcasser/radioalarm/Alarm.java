package com.carcasser.radioalarm;

import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.AWTException;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main class.
 */
public class Alarm {

    public static void main(String[] args) {
        PopupMenu menu = new PopupMenu();
        MenuItem exitItem = new MenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        try {
            SystemTray.getSystemTray().add(
                    new TrayIcon(((ImageIcon) UIManager.getIcon("FileView.computerIcon")).getImage(),
                            "invisible application", menu));
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
