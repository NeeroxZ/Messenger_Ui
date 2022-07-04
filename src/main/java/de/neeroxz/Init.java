package de.neeroxz;


import de.neeroxz.ui.main.Ui;
import de.neeroxz.user.User;
import de.neeroxz.user.UserHolder;

import javax.swing.*;

public class Init extends JFrame {

    public static void main(String[] args) {
        UserHolder userholder = new UserHolder();
        for(User s : userholder.getUserList()){
            System.out.println(s.getEmail());
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    // Set cross-platform Java L&F (also called "Metal")
                    UIManager.setLookAndFeel(
                            UIManager.getCrossPlatformLookAndFeelClassName());
                }
                catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                }
               new Ui();
            }
        });
    }

}
