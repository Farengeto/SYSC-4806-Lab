package SwingGui;

import App.AddressBook;
import App.BuddyInfo;

import javax.swing.table.AbstractTableModel;


public class ItemTableModel extends AbstractTableModel {
    AddressBook addressBook;

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public int getColumnCount() {
        return 1;
    }

    public String getColumnName(int column) {
        return "Items";
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public int getRowCount() {
        return addressBook.getAddresses().size();
    }

    public void setValueAt(Object value,
                           int rowIndex, int columnIndex) {
        if(value instanceof BuddyInfo){
            BuddyInfo buddy = (BuddyInfo)value;
            addressBook.setAddress(rowIndex,buddy);
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return addressBook.getAddress(rowIndex);
    }
}