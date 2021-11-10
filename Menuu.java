package burger;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
public class Menuu extends JFrame implements ActionListener{
    String msg="";
    int total=0;
    int counter=0;
    JPanel main,p1,p2,p3,pcart,panelButtons;
    JButton menu,contactUs,logout,show;
    JButton cancel,order;
    JPanel item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
    JButton add1,add2,add3,add4,add5,add6,add7,add8,add9,add10;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,labelPrice;
    JTextArea label10;
    JLabel desc1,desc2,desc3,desc4,desc5,desc6,desc7,desc8,desc9,desc10;
    ImageIcon image1,image2,image3,image4,image5,image6,image7,image8,image9,image10;
    Font font1 = new Font("SansSerif", Font.BOLD, 13);
    public Menuu()
    {
        //frame start
        this.setTitle("Burger Menu");
        this.setSize(1500,1000);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame end
        main=new JPanel();
        main.setLayout(new GridLayout(3,1));
        // Navigation Bar start
        p1=new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.DARK_GRAY);
        menu=new JButton("Menu");
        menu.addActionListener(this);
        menu.setBackground(Color.CYAN);
        contactUs=new JButton("Contact Us");
        contactUs.addActionListener(this);
        contactUs.setBackground(Color.CYAN);
        logout=new JButton("Logout");
        logout.addActionListener(this);
        logout.setBackground(Color.CYAN);
        p1.add(menu);
        p1.add(contactUs);
        p1.add(logout);
        main.add(p1);
        //Navigation Bar end
        p2 = new JPanel();
        p2.setLayout(new GridLayout(0,5,20,0));
        p2.setBackground(Color.DARK_GRAY);
        //Items start
        item1=new JPanel();
        item1.setLayout(new GridLayout(3,0));
        image1=new ImageIcon("D:\\ProgProject\\Burger1.jpg");
        label1=new JLabel(image1);
        desc1=new JLabel("Burger Sandwich 35L.E/Piece");
        add1=new JButton("Add To Cart");
        add1.addActionListener(this);
        add1.setBackground(Color.GREEN);
        item1.add(label1);
        item1.add(desc1);
        item1.add(add1);
        p2.add(item1);
        //item2
        item2=new JPanel();
        item2.setLayout(new GridLayout(3,0));
        image2=new ImageIcon("D:\\ProgProject\\Burger3.jpg");
        label2=new JLabel(image2);
        desc2=new JLabel("Cheese Burger with barbaque 45L.E/Piece");
        add2=new JButton("Add To Cart");
        add2.addActionListener(this);
        add2.setBackground(Color.GREEN);
        item2.add(label2);
        item2.add(desc2);
        item2.add(add2);
        p2.add(item2);
        //item 3
        item3=new JPanel();
        item3.setLayout(new GridLayout(3,0));
        image3=new ImageIcon("D:\\ProgProject\\Burger4.jpg");
        label3=new JLabel(image3);
        desc3=new JLabel("Cheese Burger Salad 50L.E/Piece");
        add3=new JButton("Add To Cart");
        add3.setBackground(Color.GREEN);
        add3.addActionListener(this);
        item3.add(label3);
        item3.add(desc3);
        item3.add(add3);
        p2.add(item3);
        //item 4
         item4=new JPanel();
        item4.setLayout(new GridLayout(3,0));
        image4=new ImageIcon("D:\\ProgProject\\Burger5.jpg");
        label4=new JLabel(image4);
        desc4=new JLabel("Cheese Burger Onion 50L.E/Piece");
        add4=new JButton("Add To Cart");
        add4.setBackground(Color.GREEN);
        add4.addActionListener(this);
        item4.add(label4);
        item4.add(desc4);
        item4.add(add4);
        p2.add(item4);
        main.add(p2);
        // item5
        item5=new JPanel();
        item5.setLayout(new GridLayout(3,0));
        image5=new ImageIcon("D:\\ProgProject\\Burger6.jpg");
        label5=new JLabel(image5);
        desc5=new JLabel("Cheese Burger Onion and Salad 50L.E/Piece");
        add5=new JButton("Add To Cart");
        add5.setBackground(Color.GREEN);
        add5.addActionListener(this);
        item5.add(label5);
        item5.add(desc5);
        item5.add(add5);
        p2.add(item5);
        main.add(p2);
        //panel three
        p3=new JPanel();
        p3.setLayout(new GridLayout(0,5,20,0));
        p3.setBackground(Color.DARK_GRAY);
        // item6
        item6=new JPanel();
        item6.setLayout(new GridLayout(3,0));
        image6=new ImageIcon("D:\\ProgProject\\Burger7.jpg");
        label6=new JLabel(image6);
        desc6=new JLabel("Cheese Burger Onion 50L.E/Piece");
        add6=new JButton("Add To Cart");
        add6.setBackground(Color.GREEN);
        add6.addActionListener(this);
        item6.add(label6);
        item6.add(desc6);
        item6.add(add6);
        p3.add(item6);
        main.add(p3);
        //item7
        item7=new JPanel();
        item7.setLayout(new GridLayout(3,0));
        image7=new ImageIcon("D:\\ProgProject\\Burger8.jpg");
        label7=new JLabel(image7);
        desc7=new JLabel("White Sause Burger 50L.E/Piece");
        add7=new JButton("Add To Cart");
        add7.setBackground(Color.GREEN);
        add7.addActionListener(this);
        item7.add(label7);
        item7.add(desc7);
        item7.add(add7);
        p3.add(item7);
        main.add(p3);
        // item8
        item8=new JPanel();
        item8.setLayout(new GridLayout(3,0));
        image8=new ImageIcon("D:\\ProgProject\\Burger9.jpg");
        label8=new JLabel(image8);
        desc8=new JLabel("Burger Spaghetti 60L.E/Piece");
        add8=new JButton("Add To Cart");
        add8.setBackground(Color.GREEN);
        add8.addActionListener(this);
        item8.add(label8);
        item8.add(desc8);
        item8.add(add8);
        p3.add(item8);
        main.add(p3);
        //item 9
        item9=new JPanel();
        item9.setLayout(new GridLayout(3,0));
        image9=new ImageIcon("D:\\ProgProject\\Burger10.jpg");
        label9=new JLabel(image9);
        desc9=new JLabel("Pizza Burger 90L.E/Piece");
        add9=new JButton("Add To Cart");
        add9.setBackground(Color.GREEN);
        add9.addActionListener(this);
        item9.add(label9);
        item9.add(desc9);
        item9.add(add9);
        p3.add(item9);
        main.add(p3);
        //Cart
        label10=new JTextArea();
        label10.setEditable(false);
        label10.setColumns(20);
        label10.setFont(font1);
        labelPrice=new JLabel();
        labelPrice.setFont(font1);
        panelButtons=new JPanel();
        panelButtons.setLayout(new GridLayout(0,3));
        order=new JButton("Order");
        order.setBackground(Color.GREEN);
        order.addActionListener(this);
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.RED);
        cancel.addActionListener(this);
        show=new JButton("Show Cart");
        show.setBackground(Color.GREEN);
        panelButtons.add(cancel);
        panelButtons.add(show);
        panelButtons.add(order);
        item10=new JPanel();
        pcart=new JPanel();
        pcart.setLayout(new GridLayout(2,0));
        item10.setLayout(new GridLayout(2,0));
        item10.setBackground(Color.WHITE);
        
        pcart.add(labelPrice);
        pcart.add(panelButtons);
        item10.add(label10);
        item10.add(pcart);
        show.addActionListener(this);
        p3.add(item10);
        main.add(p3);
        this.add(main);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        ArrayList<String>msg = new ArrayList<String>();
        
        
        
        if(ae.getSource()==add1)
        {  
            total=total+35;
            this.counter=this.counter+1;
            this.msg=this.msg+"\r\n"+"1- Burger Sandwich 35L.E";
            
        }
        if(ae.getSource()==add2)
        {
            total=total+45;
            counter++;
            this.msg=this.msg+"\r\n"+"1- Cheese Burger with Barbaque 45L.E";
        }
        if(ae.getSource()==add3)
        {
            total=total+50;
            counter++;
            this.msg=this.msg+"\r\n"+"1- Cheese Burger Salad 50L.E";
        }
        if(ae.getSource()==add4)
        {
            total=total+50;
            counter++;
            this.msg=this.msg+"\r\n"+"1- Cheese Burger Onion 50L.E";
        }
        if(ae.getSource()==add5)
        {
            total=total+60;
            counter++;
            this.msg=this.msg+"\r\n"+"1- Cheese Burger Onion and Salad 60L.E";
        }
        if(ae.getSource()==add6)
        {
            total=total+55;
            counter++;
            this.msg=this.msg+"\r\n"+"1- Cheese Burger Onion 55L.E";
        }
        if(ae.getSource()==add7)
        {
            total=total+50;
            counter++;
            this.msg=this.msg+"\r\n"+"1- White Sause Burger 50L.E";
        }
        if(ae.getSource()==add8)
        {
            total=total+60;
            counter++;
            this.msg=this.msg+"\r\n"+"1- Burger Spaghetti 60L.E";
        }
        if(ae.getSource()==add9)
        {
            total=total+90;
            counter++;
            this.msg=this.msg+"\r\n"+"1- Pizza Burger 90L.E";
        }
        if(ae.getSource()==show)
        {
            label10.setText(this.msg);
            labelPrice.setText("                  "+this.counter+" meal(s) for "+this.total+"L.E");
            if(counter==0)
            {
            labelPrice.setText("                Nothing is on the cart");
            }
        }
        if(ae.getSource()==cancel&&this.counter>=1)
        {
            label10.setText("Your cart is now clear ,Thank you !");
            this.msg="";
            labelPrice.setText(null);
            this.counter=0;
            this.total=0;
        }
        if(ae.getSource()==order&&this.counter>=1)
        {
            label10.setText(" Your order has been placed successfully" +"\n "+"within 40 minutes will be delivered ");
            labelPrice.setText("                     Thank you !");
        }
        if(ae.getSource()==menu)
        {
            Menuu m1=new Menuu();
            m1.setVisible(true);
            m1.setSize(1500,1000);
            m1.setResizable(false);
            this.setVisible(false);
            m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if(ae.getSource()==logout)
        {
            Login l1 = new Login();
            l1.setVisible(true);
            l1.setSize(1500,1000);
            l1.setResizable(false);
            this.setVisible(false);
            l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if(ae.getSource()==contactUs)
        {
            Contact c1 = new Contact();
            c1.setVisible(true);
            c1.setSize(1500,1000);
            c1.setResizable(false);
            this.setVisible(false);
            c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}

