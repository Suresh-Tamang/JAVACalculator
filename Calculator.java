import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame frame = new Frame("Add Numbers");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(5, 2));

        // Create components
        Label num1Label = new Label("number 1: ");
        TextField num1Field = new TextField(10);

        Label num2Label = new Label("number 2: ");
        TextField num2Field = new TextField(20);

        Button addButton = new Button("Add");
        Label resultLabel = new Label("Result");

        // creating buttons
        Button subButton = new Button("Subtract");

        Button multiButton = new Button("Multiply");

        Button divButton = new Button("Divide");

        TextField resultField = new TextField(10);
        resultField.setEditable(false);

        // Add components to the panel
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(multiButton);
        panel.add(divButton);
        panel.add(resultLabel);
        panel.add(resultField);

        // Add panel to the frame
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Add action listener to the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 + num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                }
            }
        });
        // for subtraction//
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 - num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                }
            }
        });
        // for Multiplication//
        multiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 * num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                }
            }
        });
        // for division//
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                }
            }
        });
        // close the application when the frame is closed
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}
