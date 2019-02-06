package SwingGui;

import App.AddressBook;

import java.awt.event.ActionListener;
import javax.swing.JTable;


public abstract class ListTableActionListener
        implements ActionListener {
    protected JTable table;
    protected AddressBook addressBook;

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void setTable(JTable itemTable) {
        this.table = itemTable;
    }
}