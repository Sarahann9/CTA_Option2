import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_BankInfo
{
    private static int balance;
    private static int withdrawal;
    private static int deposit;

    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true); // Decorate frame
        JFrame myFrame = new JFrame();
        final int F_WIDTH = 300;
        final int F_HEIGHT = 250;
        myFrame.setSize(F_WIDTH, F_HEIGHT);
        myFrame.setTitle("Bank Account Balance"); //Set title name
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(); //Set panel
        myFrame.add(panel); //Add panel to frame

        JLabel label1 = new JLabel("Enter Current Balance:");
        JTextField textBox1 = new JTextField(16);
        JButton button1 = new JButton("Enter");
        panel.add(label1); //Add label
        panel.add(textBox1); //Add text box
        panel.add(button1); //Add button to panel
        //Add Action Listener to return user value inputted into the text box
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int balance;
                balance = Integer.parseInt(textBox1.getText());
                textBox1.setText("Your current balance is: " + balance );
            }
        });
        JLabel label2 = new JLabel("Enter The Amount You Would Like To Withdrawal:");
        JTextField textBox2 = new JTextField(16);
        JButton button2 = new JButton("Enter");
        panel.add(label2); //Add label
        panel.add(textBox2); //Add text box
        panel.add(button2); //Add button to panel
        //Add Action Listener to return user user balance minus withdrawal amount
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int updatedBalance;
                //Convert User String into Integer for math
                withdrawal = Integer.parseInt(textBox2.getText());
                updatedBalance = balance - withdrawal;
                textBox2.setText("Your new balance is: " + updatedBalance );
            }
        });

        JLabel label3 = new JLabel("Enter The Amount You Would Like To Deposit:");
        JTextField textBox3 = new JTextField(16);
        JButton button3 = new JButton("Enter");
        panel.add(label3); //Add label
        panel.add(textBox3); //Add text box
        panel.add(button3); //Add button to panel
        //Add Action Listener to return user user balance plus deposit amount
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int updatedBalance;
                //Convert User String into Integer for math
                deposit = Integer.parseInt(textBox3.getText());
                updatedBalance = balance + deposit;
                textBox3.setText("Your new balance is: " + updatedBalance );
            }
        });
        myFrame.setVisible(true);
    }

}




