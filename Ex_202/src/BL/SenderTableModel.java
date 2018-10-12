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

    public void updateNumCols(int numCols) {
        colNames = new String[numCols];
        for (int i = 0; i < numCols; i++) {
            colNames[i] = "Col " + i;
        }

        fireTableStructureChanged();
    }

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }

    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return sender.get(row).getColValue(col);
    }
}
