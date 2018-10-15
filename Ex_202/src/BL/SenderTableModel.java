package BL;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class SenderTableModel extends AbstractTableModel {

    private final LinkedList<Sender> sender = new LinkedList<>();
    private int last = 0;
    private String[] colNames = {"Sender", "Frequenz", "Band"};

    public void add(Sender s) {
        int i;
        for (i = 0; i < sender.size(); i++) {
            if (sender.get(i).getFrequency() > s.getFrequency()) {
                break;
            }
        }
        sender.add(i, s);
        fireTableRowsInserted(i, i);
        //Danke @Matthias
    }

    public void hide() {
        last = 1;
        fireTableStructureChanged();
    }

    public void show() {
        last = 0;
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
        return colNames.length - last;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return sender.get(row);
    }

    public void load(File f) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        try {
            Object o;
            while ((o = ois.readObject()) instanceof Sender) {
                add((Sender) o);
            }
            last = (int) o;
            //Danke @Matthias
            fireTableStructureChanged();
        } catch (EOFException e) {
        }
        ois.close();
    }

    public void save(File f) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Sender sender1 : sender) {
            oos.writeObject(sender1);
        }
        oos.writeObject(last);
    }
}
