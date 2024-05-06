import javax.swing.*;
import java.awt.*;
public class practical_39 extends JFrame {
    public practical_39() {
        setLayout(new FlowLayout());
        JCheckBox option1 = new JCheckBox("Option 1");
        JCheckBox option2 = new JCheckBox("Option 2");
        JCheckBox option3 = new JCheckBox("Option 3");
        add(option1);
        add(option2);
        add(option3);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new practical_39();
    }
}