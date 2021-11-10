package burger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Contact extends JFrame implements ActionListener{
     JPanel mainPanel;
     JPanel panelThree;
     JRadioButton r1,r2;
     JButton submit,clear;
     JPanel p1,p2,p3;
     JLabel l1,l2;
     JTextArea t1;
    ButtonGroup group;
    Font font1 = new Font("SansSerif", Font.BOLD, 30);
    public Contact()
    {
        //Frame
        this.setTitle("Contact Us");
        this.setSize(1500,1000);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //components;
        mainPanel=new JPanel();
        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setLayout(new GridLayout(4,0));
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,0));
        p1.setBackground(Color.DARK_GRAY);
        l1=new JLabel("Enter your complain or recommendation in this Text Area , Then Submit.");
        l1.setFont(font1);
        l1.setForeground(Color.WHITE);
        p1.add(l1);
        mainPanel.add(p1);
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,0));
        t1=new JTextArea();
        t1.setFont(font1);
        p2.add(t1);
        mainPanel.add(p2);
        p3=new JPanel();
        r1= new JRadioButton("Complain");
        r2=new JRadioButton("Recommendation");
        p3.setLayout(new GridLayout(2,2));
        r1.setFont(font1);
        r1.addActionListener(this);
        r2.setFont(font1);
        r2.addActionListener(this);
        group=new ButtonGroup();
        group.add(r1);
        group.add(r2);
        p3.add(r1);
        p3.add(r2);
        submit=new JButton("Submit");
        submit.setFont(font1);
        submit.addActionListener(this);
        submit.setBackground(Color.CYAN);
        clear=new JButton("Clear");
        clear.addActionListener(this);
        clear.setBackground(Color.CYAN);
        clear.setFont(font1);
        panelThree=new JPanel();
        panelThree.setBackground(Color.DARK_GRAY);
        p3.setBackground(Color.DARK_GRAY);
        panelThree.add(submit);
        panelThree.add(clear);
        p3.add(panelThree);
        mainPanel.add(p3);
        this.add(mainPanel);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==r1)
        {
            
                Component frame = null;
                JOptionPane.showMessageDialog(frame,"Be sure that we will follow this complain and inform you soon ");
        }
        if(ae.getSource()==r2)
        {
            
                Component frame = null;
                JOptionPane.showMessageDialog(frame,"Thank you for recommending us !!");
        }
        if(ae.getSource()==submit)
        {
          String s = t1.getText().toString();
          if(s.length()>=1 )
          {
                Component frame = null;
                JOptionPane.showMessageDialog(frame,"Your opinion has been sent successfully");  
                t1.setText(null);
                Menuu m1 = new Menuu();
                m1.setVisible(true);
                m1.setSize(1500,1000);
                m1.setResizable(false);
                this.setVisible(false);
                m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
          }
          else
          {
               Component frame = null;
                JOptionPane.showMessageDialog(frame,"Please write your opinion to submit it");  
          }
        }
        if(ae.getSource()==clear)
        {
            t1.setText(null);
            Component frame = null;
             JOptionPane.showMessageDialog(frame,"Your opinion is now canceled , Inform us to get better !");  
        }
    }
}
