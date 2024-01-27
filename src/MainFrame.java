import javax.swing.*;

public class MainFrame extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton продолжитьButton;

    public MainFrame(){
        setContentPane(panel1);
        setBounds(100,100,500,400);
        setVisible(true);

        comboBox1.addItem("Мужской");
        comboBox1.addItem("Женский");

    }
}
