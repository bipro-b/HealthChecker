
import javax.swing.*;
import java.awt.*;


public class Main extends javax.swing.JFrame{
    Main() {
        JFrame frame = new JFrame();

        frame.getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font  = new Font(Font.DIALOG,  Font.BOLD, 30);
        Font font1  = new Font(Font.DIALOG,  Font.BOLD, 15);


        getRootPane().setBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
        setVisible(true);

        JLabel lb = new JLabel("Please Log in");
        lb.setFont(font);
        lb.setForeground(Color.ORANGE);
        lb.setBounds(120,10,200,40);
        frame.add(lb);

        JLabel lb1 = new JLabel("User name:");
        lb1.setFont(font1);
        lb1.setBounds(20, 60, 100, 40);
        frame.add(lb1);
        JLabel lb2 = new JLabel("Password: ");
        lb2.setFont(font1);
        lb2.setBounds(20, 100, 100, 40);
        frame.add(lb2);

        JButton submit = new JButton("Log in");
        submit.setFont(font);
        submit.setBounds(120, 160, 200, 40);
        submit.setBackground(Color.GREEN);
        frame.add(submit);

        JTextField user = new JTextField("");
        user.setBounds(120, 60, 200, 40);
        frame.add(user);

        JPasswordField pin = new JPasswordField("");
        pin.setBounds(120, 100, 200, 40);
        frame.add(pin);


        submit.addActionListener(e->{
            String userName = user.getText();
            String pass = pin.getText();
            if (userName.trim().equals("admin") && pass.trim().equals("admin")) {
                fitnessChecker page = new fitnessChecker();


                page.setVisible(true);
                frame.dispose();
            } else {
                System.out.println("Enter valid information");
            }
        });


        frame.setSize(450, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
