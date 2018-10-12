package BL;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class SenderTableModel extends AbstractTableModel {

    private ArrayList<Sender> sender = new ArrayList<>();
    private String[] colNames = {"Sender", "Frequenz", "Band"};

    public void addSender(Sender s) {
        sender.add(s);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
