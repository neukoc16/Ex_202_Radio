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
        switch (column) {
            case 0:
                label.setText(s.getName());
                break;
            case 1:
                label.setText(s.getFrequency() + "");
                break;
            case 2:
                label.setText(s.getBand());
                break;
            default:
                label.setText("???");
        }
        if (column == 3) {
            if (s.getBand().equals("AM")) {
                label.setBackground(Color.BLUE);
            } else if (s.getBand().equals("FM")) {
                label.setBackground(Color.RED);
            }
        }
        return label;
    }
}
