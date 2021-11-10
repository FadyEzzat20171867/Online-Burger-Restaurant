package burger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Register extends JFrame implements ActionListener{
   JPanel mainPanel;
    JPanel CenteredPanel;
    JPanel p1,p2;
    JButton register,clear;
    JLabel name,password,cancelMessage;
    JLabel confirmPassword;
    JTextField mail;
    JPasswordField pass,confirmPass;
    Font font1 = new Font("SansSerif", Font.BOLD, 30);
    public Register()
    {
        //Frame
        this.setTitle("Register");
        this.setSize(1500,1000);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Components
        mainPanel=new JPanel();
        mainPanel.setBackground(Color.DARK_GRAY);
        CenteredPanel=new JPanel();
        cancelMessage=new JLabel();
        CenteredPanel.setLayout(new GridLayout(2,0));
        p1=new JPanel();
        p2=new JPanel();
        name=new JLabel("Name : ");
        name.setFont(font1);
        password=new JLabel("Password : ");
        password.setFont(font1);
        confirmPassword=new JLabel("Confirm Password : ");
        confirmPassword.setFont(font1);
        confirmPass=new JPasswordField();
        confirmPass.setFont(font1);
        mail=new JTextField();
        mail.setFont(font1);
        mail.setColumns(20);
        pass = new JPasswordField();
        pass.setFont(font1);
        pass.setColumns(20);
        register=new JButton("Register");
        register.setFont(font1);
        register.addActionListener(this);
        register.setBackground(Color.CYAN);
        clear=new JButton("Cancel");
        clear.addActionListener(this);
        clear.setFont(font1);
        clear.setBackground(Color.CYAN);
        p2.setPreferredSize(new Dimension(300,200));
        p2.setBackground(Color.DARK_GRAY);
        p2.add(cancelMessage);
        CenteredPanel.add(p2);
        p1.setLayout(new GridLayout(4,2,10,10));
        p1.setBackground(Color.WHITE);
        p1.add(name);
        p1.add(mail);
        p1.add(password);
        p1.add(pass);
        p1.add(confirmPassword);
        p1.add(confirmPass);
        p1.add(register);
        p1.add(clear);
        CenteredPanel.add(p1);
        mainPanel.add(CenteredPanel,BorderLayout.CENTER);
        this.add(mainPanel);
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==register)
        {
            String pass1=pass.getText().toString();
            String pass2=confirmPass.getText().toString();
            String name1=mail.getText().toString();
            if(pass1.equals("admin")&&pass2.equals("admin")&&name1.equals("admin"))
            {
            Login l1 = new Login();
            l1.setVisible(true);
            l1.setSize(1500,1000);
            l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
            }
            else
            {
                Component frame = null;
                JOptionPane.showMessageDialog(frame,"Invalid username or password");
            }
        }
        if(ae.getSource()==clear)
        {
            confirmPass.setText(null);
            pass.setText(null);
            mail.setText(null);
            cancelMessage.setText("Your Registiration has been canceled , Thank you !");
            cancelMessage.setFont(font1);
            cancelMessage.setForeground(Color.RED);
        }
    }
}
