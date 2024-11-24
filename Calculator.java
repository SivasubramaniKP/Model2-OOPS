import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton numberButtons[] = new JButton[10];
    JButton functiButton[] = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, clearButton, deleteButton, eqButton;
    JPanel panel;

    Font myfont = new Font("Inter",Font.BOLD,30);
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator () {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        
        frame.setLayout(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(10, 20, 350, 50);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        eqButton = new JButton("=");
        deleteButton = new JButton("Del");
        clearButton = new JButton("Clear");
        functiButton[0] = addButton;
        functiButton[1] = subButton;
        functiButton[2] = mulButton;
        functiButton[3] = divButton;
        functiButton[4] = decButton;
        functiButton[5] = eqButton;
        functiButton[6] = deleteButton;
        functiButton[7] = clearButton;

        for ( int i = 0; i < 8; i++ ) {
            functiButton[i].addActionListener(this);
            functiButton[i].setFont(myfont);

        }
        for ( int i = 0; i < 10; i++ ) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }
        deleteButton.setBounds(20, 400, 150, 50);
        clearButton.setBounds(180, 400, 150, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4,10,10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(deleteButton);
        frame.add(clearButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for ( int i = 0; i < 10; i++ ) {
            if ( e.getSource() == numberButtons[i] ) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if ( e.getSource() == addButton ) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if ( e.getSource() == subButton ) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if ( e.getSource() == mulButton ) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if ( e.getSource() == divButton ) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if ( e.getSource() == eqButton ) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                default:
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if ( e.getSource() == clearButton ) {
            num1 = 0;
            num2 = 0;
            textField.setText("");
        }
        if ( e.getSource() == deleteButton ) {
            String cur = textField.getText();
            textField.setText("");
            for ( int i = 0; i < cur.length() - 1; i++ ) {
                textField.setText(textField.getText()+cur.charAt(i));
            }

        }
    }
}
