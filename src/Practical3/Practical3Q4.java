import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Practical3Q4 extends JFrame {
    public static void main(String[] args) {
        new Practical3Q4();
    }

    private Practical3Q4() {
        setLayout(new GridLayout(2, 1));

        JPanel jpnCalc = new JpnCalc();
        JPanel jpnBttn = new JPanel();

        add(jpnCalc);
        add(jpnBttn);

        JButton jbtAdd = new JButton("Add");
        JButton jbtSub = new JButton("Subtract");
        JButton jbtMul = new JButton("Multiply");
        JButton jbtDiv = new JButton("Divide");

        jpnBttn.setLayout(new FlowLayout(FlowLayout.RIGHT));

        jpnBttn.add(jbtAdd);
        jpnBttn.add(jbtSub);
        jpnBttn.add(jbtMul);
        jpnBttn.add(jbtDiv);

        jbtAdd.setMnemonic(KeyEvent.VK_A);
        jbtSub.setMnemonic(KeyEvent.VK_S);
        jbtMul.setMnemonic(KeyEvent.VK_M);
        jbtDiv.setMnemonic(KeyEvent.VK_D);

        jbtAdd.addActionListener(e -> JpnCalc.Add());
        jbtSub.addActionListener(e -> JpnCalc.Sub());
        jbtMul.addActionListener(e -> JpnCalc.Mul());
        jbtDiv.addActionListener(e -> JpnCalc.Di v());

        pack();
        super.setTitle("Login");
        //super.setSize(400,200);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}


class JpnCalc extends JPanel {
    private static JTextField first = new JTextField(10);
    private static JTextField second = new JTextField();
    private static JTextField result = new JTextField();

    JpnCalc() {
        super.setLayout(new GridLayout(3, 2));
        add(new JLabel("First Number"));
        add(first);
        add(new JLabel("Second Number"));
        add(second);
        add(new JLabel("Result"));
        add(result);
        result.setEditable(false);
    }

    private static double getFirst() {
        return Double.parseDouble(first.getText());
    }

    private static double getSecond() {
        return Double.parseDouble(second.getText());
    }

    static void Add() {
        result.setText(String.format("%.2f",getFirst()+getSecond()));
    }

    static void Sub() {
        result.setText(String.format("%.2f",getFirst()-getSecond()));
    }

    static void Mul() {
        result.setText(String.format("%.2f",getFirst()*getSecond()));
    }

    static void Di v() {
        result.setText(String.format("%.2f",getFirst()/getSecond()));
    }
}