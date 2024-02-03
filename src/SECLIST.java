import javax.swing.*;

public class SECLIST extends JFrame {
    private JButton button1;
    private JButton button2;

    private JPanel panel;

    public SECLIST(int x, int y, int width, int height) {
        setTitle("Second");
        setContentPane(panel);
        setBounds(x, y, width, height);
        setVisible(true);
    }
}
