package GUI;

import BL.Sender;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class MyTableCellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Sender s = (Sender) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        if (s.getBand().equals("AM")) {
            label.setBackground(Color.blue);
        } else {
            label.setBackground(Color.red);
        }
        if (isSelected) {
            label.setBackground(Color.black);
            label.setForeground(Color.black);
        }
        switch (column) {
            case 0:
                label.setText(s.getName());
                break;
            case 1:
                label.setText(String.format("%.2f", s.getFrequency()));
                break;
            case 2:
                label.setText(s.getBand());
                break;
            default:
                label.setText("???");
        }
        return label;
    }
}
