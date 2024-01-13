import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Frame extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
int[] secondsHolder = { 0 };
Frame(){
    super("puzzle game");

    getContentPane().setBackground(Color.lightGray);
    
    JLabel timerLabel = new JLabel("Time: 0 seconds");

    b1=new JButton("1");
    b2=new JButton(" ");
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("2");
    next=new JButton("next");

    

    b1.setBounds(10,30,100,90);
    b2.setBounds(110,30,100,90);
    b3.setBounds(210,30,100,90);
    b4.setBounds(10,120,100,90);
    b5.setBounds(110,120,100,90);
    b6.setBounds(210,120,100,90);
    b7.setBounds(10,210,100,90);
    b8.setBounds(110,210,100,90);
    b9.setBounds(210,210,100,90);
    ///////////////////////////////////////////////////
    next.setBounds(350,30,100,40);
    //////////////////////////////////////////////////////
    
    timerLabel.setBounds(350, 80, 100, 30);
        
    ///////////////////////////////////////////////////////



    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9); add(next);add(timerLabel);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    next.addActionListener(this);

    

    next.setBackground(Color.black);
    next.setForeground(Color.green);
    b1.setBackground(Color.cyan);
    b2.setBackground(Color.cyan);
    b3.setBackground(Color.cyan);
    b4.setBackground(Color.cyan);
    b5.setBackground(Color.cyan);
    b6.setBackground(Color.cyan);
    b7.setBackground(Color.cyan);
    b8.setBackground(Color.cyan);
    b9.setBackground(Color.cyan);

    setSize(250,300);
    setLayout(null);
    // setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    /////////////////////////////////////////////////////////////////
    
    Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            secondsHolder[0]++; // Mengupdate nilai seconds dari array
            timerLabel.setText("Time: " + secondsHolder[0] + " seconds"); 
        }
    });
    timer.start(); // Memulai timer
    
////////////////////////////////////////
JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        /////////////////////////////////////////////////////////////
        Dimension buttonSize = new Dimension(100, 90);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);
        b3.setPreferredSize(buttonSize);
        b4.setPreferredSize(buttonSize);
        b5.setPreferredSize(buttonSize);
        b6.setPreferredSize(buttonSize);
        b7.setPreferredSize(buttonSize);
        b8.setPreferredSize(buttonSize);
        b9.setPreferredSize(buttonSize);
    

        // Menambahkan tombol-tombol ke panel dengan constraints untuk menengahkan
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(b1, gbc);

        gbc.gridx = 1;
        buttonPanel.add(b2, gbc);

        gbc.gridx = 2;
        buttonPanel.add(b3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(b4, gbc);

        gbc.gridx = 1;
        buttonPanel.add(b5, gbc);

        gbc.gridx = 2;
        buttonPanel.add(b6, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        buttonPanel.add(b7, gbc);

        gbc.gridx = 1;
        buttonPanel.add(b8, gbc);

        gbc.gridx = 2;
        buttonPanel.add(b9, gbc);

        // Menambahkan panel tombol dan komponen lainnya ke frame
        add(buttonPanel);
        add(next);
        add(timerLabel);

        // Menyesuaikan ukuran dan konfigurasi frame
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
//end of constuctor

public void actionPerformed(ActionEvent e){
    if(e.getSource()==next){
    String s=b4.getLabel();
    b4.setLabel(b9.getLabel());
    b9.setLabel(s);
    s=b1.getLabel();
    b1.setLabel(b5.getLabel());
    b5.setLabel(s);
    s=b2.getLabel();
    b2.setLabel(b7.getLabel());
    b7.setLabel(s);
    }
    if(e.getSource()==b1){
    String s=b1.getLabel();
    if(b2.getLabel().equals(" ")){ b2.setLabel(s); b1.setLabel(" ");}
    else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b1.setLabel(" ");}
    }//end of if

    if(e.getSource()==b3){
    String s=b3.getLabel();
    if(b2.getLabel().equals(" ")){ b2.setLabel(s); b3.setLabel(" ");}
    else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b3.setLabel(" ");}
    }//end of if

    if(e.getSource()==b2){
    String s=b2.getLabel();
    if(b1.getLabel().equals(" ")){ b1.setLabel(s); b2.setLabel(" ");}
    else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b2.setLabel(" ");}
    else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b2.setLabel(" ");}
    }//end of if

    if(e.getSource()==b4){
    String s=b4.getLabel();
    if(b1.getLabel().equals(" ")){ b1.setLabel(s); b4.setLabel(" ");}
    else if(b7.getLabel().equals(" ")){ b7.setLabel(s); b4.setLabel(" ");}
    else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b4.setLabel(" ");}
    }//end of if

    if(e.getSource()==b5){
    String s=b5.getLabel();
    if(b2.getLabel().equals(" ")){ b2.setLabel(s); b5.setLabel(" ");}
    else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b5.setLabel(" ");}
    else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b5.setLabel(" ");}
    else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b5.setLabel(" ");}
    }//end of if

    if(e.getSource()==b6){

    String s=b6.getLabel();
    if(b9.getLabel().equals(" ")){ b9.setLabel(s); b6.setLabel(" ");}
    else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b6.setLabel(" ");}
    else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b6.setLabel(" ");}

    }//end of if

    if(e.getSource()==b7){
    String s=b7.getLabel();
    if(b4.getLabel().equals(" ")){ b4.setLabel(s); b7.setLabel(" ");}
    else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b7.setLabel(" ");}

    }//end of if

    if(e.getSource()==b8){
    String s=b8.getLabel();
    if(b7.getLabel().equals(" ")){ b7.setLabel(s); b8.setLabel(" ");}
    else if(b9.getLabel().equals(" ")){ b9.setLabel(s); b8.setLabel(" ");}
    else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b8.setLabel(" ");}

    }//end of if

    if(e.getSource()==b9){
    String s=b9.getLabel();
    if(b6.getLabel().equals(" ")){ b6.setLabel(s); b9.setLabel(" ");}
    else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b9.setLabel(" ");}
    if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals(" ")){ 
    JOptionPane.showMessageDialog(Frame.this,"!!!you won!!!");
    }
    }//end of if

}//end of actionPerformed
 

// public static void main(String[] args){
// new puzzle();
// }//end of main

}//end of class