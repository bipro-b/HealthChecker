import javax.swing.*;
import java.awt.*;

public class doctor extends JFrame{

    doctor() {

        Font font  = new Font(Font.DIALOG,  Font.BOLD, 30);
        Font font1  = new Font(Font.DIALOG,  Font.BOLD, 20);

        setDefaultCloseOperation(javax.swing.
                WindowConstants.DISPOSE_ON_CLOSE);
        JFrame f1 = new JFrame();
        f1.getContentPane().setBackground(Color.GRAY);

        f1.setCursor(Cursor.getDefaultCursor());
        JLabel jl = new JLabel();
        jl.setIcon(new ImageIcon("doctor.png"));
        jl.setBounds(120,10,360,420);
        f1.add(jl);

        JLabel lb = new JLabel("Name: Dr. Kuin Ranse, Specialis on Medicine");
        lb.setForeground(Color.ORANGE);
        lb.setBounds(125,390,250,40);
        f1.add(lb);


        JLabel lb1 = new JLabel("Now register here");
        lb1.setFont(font1);
        lb1.setForeground(Color.magenta);

        lb1.setBounds(200, 430, 200, 40);
        f1.add(lb1);

        JLabel lb2 = new JLabel("Enter your  name:");
        lb2.setBounds(80, 470, 100, 40);
        f1.add(lb2);

        JLabel lb3 = new JLabel("Address:");
        lb3.setBounds(80, 510, 100, 40);
        f1.add(lb3);

        JLabel lb4 = new JLabel("Phone number:");
        lb4.setBounds(80, 550, 100, 40);
        f1.add(lb4);

        JLabel lb5 = new JLabel("Your Age :");
        lb5.setBounds(80, 590, 100, 40);
        f1.add(lb5);

        JLabel lb7 = new JLabel("Gender:");
        lb7.setBounds(80,630,100,40);
        f1.add(lb7);
        String gender[]={"Male","Female"};
        JComboBox g=new JComboBox(gender);
        g.setBounds(200, 630,130,40);
        f1.add(g);

        JLabel lb6 = new JLabel("Choose Shedule :");
        lb6.setBounds(80, 670, 100, 40);
        f1.add(lb6);
        String time[]={"8:00AM - 11:00AM","11:30AM - 1:30PM ","3:00PM-5:00PM","6:00-8:00PM"};
        JComboBox t=new JComboBox(time);
        t.setBounds(200, 670,130,40);
        f1.add(t);

        JButton btn = new JButton("Register");
        btn.setBounds(200,740,100,40);
        btn.setBackground(Color.ORANGE);
        f1.add(btn);



        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(200, 470, 200, 40);
        f1.add(txtHeight);

        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(200, 510, 200, 40);
        f1.add(txtWeight);

        JTextField temperature = new JTextField("");
        temperature.setBounds(200, 550, 200, 40);
        f1.add(temperature); //adding component in JFrame

        JTextField low = new JTextField("");
        low.setBounds(200, 590, 200, 40);
        f1.add(low);


        btn.addActionListener(e->{


            new status();
            f1.dispose();

        });

        f1.setSize(600,1000);
        f1.setLayout(null);
        f1.setVisible(true);

    }
}