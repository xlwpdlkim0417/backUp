package test_01.submit.assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class CheckboxExample {
    private JFrame frame;
    private ArrayList<String> selectedColors;

    public CheckboxExample() {
        selectedColors = new ArrayList<>();
        frame = new JFrame("Checkbox Example");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox redCheckbox = new JCheckBox("적");
        JCheckBox greenCheckbox = new JCheckBox("녹");
        JCheckBox blueCheckbox = new JCheckBox("청");

        redCheckbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateSelectedColors("red", e.getStateChange() == ItemEvent.SELECTED);
            }
        });

        greenCheckbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateSelectedColors("green", e.getStateChange() == ItemEvent.SELECTED);
            }
        });

        blueCheckbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateSelectedColors("blue", e.getStateChange() == ItemEvent.SELECTED);
            }
        });

        frame.add(redCheckbox);
        frame.add(greenCheckbox);
        frame.add(blueCheckbox);
        frame.setVisible(true);
    }

    private void updateSelectedColors(String color, boolean isSelected) {
        if (isSelected) {
            selectedColors.add(color);
        } else {
            selectedColors.remove(color);
        }
        System.out.println("선택한 색은 " + selectedColors);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}
