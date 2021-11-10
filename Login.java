package burger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame implements ActionListener{
    JPanel mainPanel;
    JPanel CenteredPanel;
    JPanel p1,p2;
    JButton login,clear;
    JLabel email,password,cancelMessage;
    JTextField mail;
    JPasswordField pass;
    Font font1 = new Font("SansSerif", Font.BOLD, 30);
    public Login()
    {
        //Frame
        this.setTitle("Login");
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
        email=new JLabel("Name : ");
        email.setFont(font1);
        password=new JLabel("Password : ");
        password.setFont(font1);
        mail=new JTextField();
        mail.setFont(font1);
        mail.setColumns(20);
        pass = new JPasswordField();
        pass.setFont(font1);
        pass.setColumns(20);
        login=new JButton("Login");
        login.setFont(font1);
        login.addActionListener(this);
        login.setBackground(Color.CYAN);
        clear=new JButton("Cancel");
        clear.setFont(font1);
        clear.setBackground(Color.CYAN);
        p2.setPreferredSize(new Dimension(300,200));
        p2.setBackground(Color.DARK_GRAY);
        p2.add(cancelMessage);
        CenteredPanel.add(p2);
        p1.setLayout(new GridLayout(3,2,10,50));
        p1.setBackground(Color.WHITE);
        p1.add(email);
        p1.add(mail);
        p1.add(password);
        p1.add(pass);
        p1.add(login);
        p1.add(clear);
        CenteredPanel.add(p1);
        mainPanel.add(CenteredPanel,BorderLayout.CENTER);
        this.add(mainPanel);
        clear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==clear)
        {
            pass.setText(null);
            mail.setText(null);
            cancelMessage.setText("You have canceled the Login , Thank you!");
            cancelMessage.setFont(font1);
            cancelMessage.setForeground(Color.RED);
        }
        if(ae.getSource()==login)
        {
            String name=mail.getText().toString();
            String password = pass.getText().toString();
            if(name.equals("admin") && name.equals("admin"))
            {
                Menuu m1=new Menuu();
                m1.setVisible(true);
                m1.setSize(1500,1000);
                m1.setResizable(false);
                this.setVisible(false);
                m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else
            {
                Component frame = null;
                JOptionPane.showMessageDialog(frame,"Invalid username or password");
            }
        }
    }
    
}
