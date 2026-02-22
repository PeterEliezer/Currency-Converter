import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterUI extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private JComboBox<String> currencyBox;

    public CurrencyConverterUI() {
        setTitle("USD ↔ FRW Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        inputField = new JTextField();
        currencyBox = new JComboBox<>(new String[]{"USD → FRW", "FRW → USD"});
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result: ", SwingConstants.CENTER);

        add(new JLabel("Enter amount:", SwingConstants.CENTER));
        add(inputField);
        add(currencyBox);
        add(convertButton);
        add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(inputField.getText());
                    String choice = (String) currencyBox.getSelectedItem();
                    double result;

                    if (choice.equals("USD → FRW")) {
                        result = CurrencyConverter.usdToFrw(amount);
                        resultLabel.setText("Result: " + result + " FRW");
                    } else {
                        result = CurrencyConverter.frwToUsd(amount);
                        resultLabel.setText("Result: " + result + " USD");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CurrencyConverterUI().setVisible(true);
        });
    }
}
