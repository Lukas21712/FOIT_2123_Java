package projekt;

import javax.swing.*;

public class TicTacToeGui extends JFrame {
    private JPanel mainPanel;
    private JButton kasten1;
    private JButton kasten2;
    private JButton kasten3;
    private JButton kasten4;
    private JButton kasten5;
    private JButton kasten6;
    private JButton kasten7;
    private JButton kasten8;
    private JButton kasten9;
    private JLabel message;

    public TicTacToeGui() {
        setContentPane(mainPanel);
        setTitle("TicTacToe");
        setSize(235,330);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        kasten1.setBounds(10, 10, 60, 60);
        kasten2.setBounds(80, 10, 60, 60);
        kasten3.setBounds(150, 10, 60, 60);
        kasten4.setBounds(10, 80, 60, 60);
        kasten5.setBounds(80, 80, 60, 60);
        kasten6.setBounds(150, 80, 60, 60);
        kasten7.setBounds(10, 150, 60, 60);
        kasten8.setBounds(80, 150, 60, 60);
        kasten9.setBounds(150, 150, 60, 60);
        message.setBounds(220, 10, 220, 60);
        message.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public static void main(String[] args) {
        TicTacToeGui myFrame = new TicTacToeGui();
    }
}
