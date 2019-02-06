package SwingGui;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class AddNewButtonActionListener extends
        ListTableActionListener {

    public void actionPerformed(ActionEvent e) {
        String n = JOptionPane.showInputDialog(table, "Input Buddy name:", "Add Buddy", JOptionPane.PLAIN_MESSAGE);
        String p = JOptionPane.showInputDialog(table, "Input Buddy phone number:", "Add Buddy", JOptionPane.PLAIN_MESSAGE);
        addressBook.addAddress(n,p);
        table.revalidate();
    }
}