package imic.pactice.swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculation {
    private JPanel jp1;
    private JTextField no1;
    private JTextField no2;
    private JComboBox option;
    private JButton calculateButton;
    private JLabel no1Label;
    private JLabel no2Label;
    private JLabel ouputLabel;
    private JTable table1;

    private double result;
    private int count;


    public Calculation() {
        String[] columns = new String[] {"Count", "Number 1", "Number 2", "Calculation", "Result"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        table1.setModel(model);
        calculateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double number1 = Double.parseDouble(no1.getText());
                    Double number2 = Double.parseDouble(no2.getText());

                    if(number2 ==0 && option.getSelectedItem().toString()=="Division"){
                        JOptionPane.showMessageDialog(null, "Can not divide 0");
                    }else {
                        switch (option.getSelectedItem().toString()){
                            case "Addition":
                                setResult(number1 + number2);
                                break;
                            case "Subtraction":
                                setResult(number1-number2);
                                break;
                            case "Multiplication":
                                setResult(number1 * number2);
                                break;
                            case "Division":
                                setResult(number1/number2);
                                break;
                                default: break;
                        }

                        setCount(getCount()+1);
                        model.addRow(new Object[] {getCount(), number1, number2, option.getSelectedItem().toString(), getResult()});
                    }
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Input is not available");
                }
            }
        });
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculation");
        frame.setContentPane(new Calculation().jp1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBackground(Color.white);
    }
}
