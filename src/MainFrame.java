import javax.swing.*;

public class MainFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton button1;

    private JPanel panel;

    public MainFrame() {
        setTitle("First");
        setContentPane(panel);
        setBounds(100, 100, 200, 200);
        setVisible(true);

        button1.addActionListener((event) -> {
            new SECLIST(getX(), getY(), getWidth(), getHeight());
            dispose();
        });

        setBounds(100, 100, 500, 400);
        setVisible(true);

        comboBox1.addItem("Мужской");
        comboBox1.addItem("Женский");

        }
    }
