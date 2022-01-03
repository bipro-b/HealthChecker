import javax.swing.*;
import java.awt.*;


public class fitnessChecker extends javax.swing.JFrame {
    fitnessChecker(){
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.GRAY);

        // Font style
        Font font  = new Font(Font.DIALOG,  Font.BOLD, 23);
        Font font1  = new Font(Font.DIALOG,  Font.BOLD, 15);


        // Text field

        JLabel lb = new JLabel("Check Your Health");
        lb.setFont(font);
        lb.setForeground(Color.ORANGE);
        lb.setBounds(150,20,250,40);
        f.add(lb);

        JLabel lb1 = new JLabel("Height(Meter):");
        lb1.setBounds(20, 60, 100, 40);
        f.add(lb1);

        JLabel lb2 = new JLabel("Weight(KG):");
        lb2.setBounds(20, 100, 100, 40);
        f.add(lb2);

        JLabel lb3 = new JLabel("Temperature(F):");
        lb3.setBounds(20, 140, 100, 40);
        f.add(lb3);

        JLabel lb4 = new JLabel("BP (Low) :");
        lb4.setBounds(230, 180, 100, 40);
        f.add(lb4);
        JLabel lb5 = new JLabel("BP (High) :");
        lb5.setBounds(20, 180, 100, 40);
        f.add(lb5);
        JLabel lb6 = new JLabel("Overall Fitness Condition ");
        lb6.setFont(font);
        lb6.setForeground(Color.ORANGE);
        lb6.setFont(font1);
        lb6.setBounds(120, 260, 300, 40);
        f.add(lb6);
        JButton btn = new JButton("Check your health ");
        btn.setBounds(200, 230, 150, 40);
        btn.setBackground(Color.ORANGE);
        f.add(btn);
        JLabel lbResult = new JLabel("BMI Condition: ");
        lbResult.setForeground(Color.blue);
        lbResult.setFont(font1);
        lbResult.setBounds(20, 320, 300, 40);
        f.add(lbResult);

        JLabel tbResult = new JLabel("Body Temperature Condition: ");
        tbResult.setForeground(Color.ORANGE);
        tbResult.setFont(font1);
        tbResult.setBounds(20, 360, 300, 40);
        f.add(tbResult);

        JLabel bpResult = new JLabel("Blood Pressure Condition: ");
        bpResult.setFont(font1);
        bpResult.setForeground(Color.cyan);
        bpResult.setBounds(20, 400, 400, 40);
        f.add(bpResult);


        // Text Input field

        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 60, 200, 40);
        f.add(txtHeight);

        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 100, 200, 40);
        f.add(txtWeight);

        JTextField temperature = new JTextField("");
        temperature.setBounds(120, 140, 200, 40);
        f.add(temperature);

        JTextField low = new JTextField("");
        low.setBounds(300, 180, 100, 40);
        f.add(low);

        JTextField high = new JTextField("");
        high.setBounds(120, 180, 100, 40);
        f.add(high);

        JLabel lb8 = new JLabel("If your report is bad you can see Doctor");
        lb8.setFont(font1);
        lb8.setForeground(Color.red);
        lb8.setBounds(60,500,300,40);
        f.add(lb8);

        JButton btn1 = new JButton("Visit Doctor");
        btn1.setBounds(120,560,200,40);
        btn1.setBackground(Color.ORANGE);
        f.add(btn1);



        // Event handling

        btn.addActionListener(e -> {
            double t=Double.parseDouble(temperature.getText());
            double weight=Double.parseDouble(txtWeight.getText());
            double height=Double.parseDouble(txtHeight.getText());
            int    l = Integer.parseInt(low.getText());
            int    h = Integer.parseInt(high.getText());

            if((l<70 || l>90) ||(h<110 || h>130)){
                bpResult.setText("Emergency bp Condition.Please a visit Doctor");
            }
            else{
                bpResult.setText(("BP is Good"));
            }

            if(t>99.0){
                tbResult.setText("Fever : " +t );
            }
            else {
                tbResult.setText("Normal - Temperature : "+t);
            }

            double bmi = weight / Math.pow(height, 2) ;

            if (bmi < 18.5) {
                lbResult.setText("underweight - BMI : "+bmi);
            } else if (bmi < 25) {
                lbResult.setText("Normal - BMI : "+bmi);
            } else if (bmi < 30) {
                lbResult.setText("overweight - BMI : "+bmi);
            } else {
                lbResult.setText("Obese - BMI : "+bmi);
            }
        });
        btn1.addActionListener(e->{


            new doctor();
            f.dispose();

        });


        f.setSize(500, 750);
        f.setLayout(null);
        f.setVisible(true);

    }
}
