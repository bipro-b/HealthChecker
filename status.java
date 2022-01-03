import javax.swing.*;
import java.awt.*;

class status extends JFrame {

    status() {

        final  String strUrl ="https://www.coderanch.com/t/340009/java/add-hyperlink";



        Font font  = new Font(Font.DIALOG,  Font.BOLD, 15);
        Font font1  = new Font(Font.DIALOG,  Font.BOLD, 20);


        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.GRAY);

        JLabel lb1 = new JLabel("You have successfully Registered");
        lb1.setFont(font1);
        lb1.setForeground(Color.ORANGE);
        lb1.setBounds(30, 60, 350, 40);
        f.add(lb1);

        JLabel lb = new JLabel("AS your shedule join throw bellow link");
        lb.setFont(font);
        lb.setForeground(Color.green);
        lb.setBounds(30,100,350,40);
        f.add(lb);

        JLabel lb2 = new JLabel(strUrl);
        lb2.setForeground(Color.blue);

        lb2.setBounds(50, 140, 350, 40);
        f.add(lb2);

        JLabel link = new JLabel("https://www.coderanch.com/t/340009/java/add-hyperlink");
        link.setForeground(Color.blue);

        link.setBounds(50,180,360,40);
        f.add(link);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }


}