import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.*;

    public static void main(String[] args) {
        Frame frame = new Frame("Add Numbers");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(5, 2));
 

        Te xtField num1Field = new TextField(10);

        Label num2Label = new Label("number 2: "

        Button addButton = new Button("Add");
        Label resultLabel = new Label("Result");

        Button subButton = new Button("Subtract");


        
        TextField resultField = new TextField(10);
        resultField.setEditable(false);

        // Add components to the panel

        panel.add(num2Label);
        panel.add(num2Field);

        pa nel.add(multiButton);
        panel.add(divButton);
        panel.add(resultLabel);
        panel.add(resultField);

        // Add panel to the frame
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Add action listener 

             public void actionPerformed(ActionEvent e) {
                try {
                    double  num1 = Double.parseDouble(num1Field.getText());
                    double num2

                 } catch (NumberFormatException ex) {
                    System.out.println(ex);
                }
            }
        }); 

        subButton.addActionListener(new ActionListener() {
            @Override  
            public void actionPerformed(ActionEvent e) {
                t     d ouble num1 = Double.parseD ouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 - num2;
                    resultField.setText(String.valueOf(result));
           

            }
        });

        multiButton .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {  
                    double num1 = Double.parseDouble(num1Field.getText());
                      d ouble result = num1 * num2 ;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
           

        
        divButton.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double . parseDouble(num2Field.getText());
                    double result = num1 / num2;
                  } cat ch (NumberFormatException  ex) {
                    System.out.println(ex);
                }
            }
        });

                frame.dispose();
                System.exit(0);
            }
        }); 

    }
}
