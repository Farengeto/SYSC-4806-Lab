package SwingGui;

import App.Launcher;

import java.awt.*;


import javax.swing.*;

public class MenuFrame extends JFrame {

    public MenuFrame() {
        super("Address Book");
    }

    public void init() {
        setSize(500, 500);
        setVisible(true);
        setState(Frame.NORMAL);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.launch();
    }
}