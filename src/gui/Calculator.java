
package gui;

import java.awt.*;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12,
            b13, b14, b15, b16, b17, b18, b19, b20;
    String fv, sv, op;

    Double fdv, sdv, tot;

    Cal() {
        Frame f = new Frame("Calculator");
        f.addWindowListener(new close());
        f.setBackground(Color.gray);
        f.setResizable(false);
        f.setBounds(500, 300, 350, 500);
        
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Poppins", BOLD, 30);
        Font f2 = new Font("Quicksand", BOLD, 30);
        Font f3 = new Font("Quicksand", BOLD, 40);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi = new MenuItem("Standard");
        m1.add(mi);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);
        
        Menu m3 = new Menu("Help");
        MenuItem mi4 = new MenuItem("About Calculator");
        
        m3.add(mi4);    

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout g = new GridLayout(5, 4, 4, 4);
        p2.setLayout(g);
        p2.setBackground(Color.black);

        tf = new TextField(14);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(Color.black);
        tf.setBackground(Color.white);
        tf.setText("0");

        p1.add(tf);

        b1 = new Button("CE");
        b2 = new Button("√");
        b3 = new Button("%");
        b4 = new Button("/");
        b5 = new Button("7");
        b6 = new Button("8");
        b7 = new Button("9");
        b8 = new Button("*");
        b9 = new Button("4");
        b10 = new Button("5");
        b11 = new Button("6");
        b12 = new Button("-");
        b13 = new Button("1");
        b14 = new Button("2");
        b15 = new Button("3");
        b16 = new Button("+");
        b17 = new Button(".");
        b18 = new Button("0");
        b19 = new Button("X");
        b20 = new Button("=");


        b1.setBackground(Color.red);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.yellow);
        b4.setBackground(Color.yellow);
        
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.yellow);
        
        b9.setBackground(Color.white);
        b10.setBackground(Color.white);
        b11.setBackground(Color.white);
        b12.setBackground(Color.yellow);
        
        b13.setBackground(Color.white);
        b14.setBackground(Color.white);
        b15.setBackground(Color.white);
        b16.setBackground(Color.yellow);
        
        b17.setBackground(Color.white);
        b18.setBackground(Color.white);
        b19.setBackground(Color.red);
        b20.setBackground(Color.gray);
        

        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f2);
        b9.setFont(f1);
        b10.setFont(f1);
        b11.setFont(f1);
        b12.setFont(f2);
        b13.setFont(f1);
        b14.setFont(f1);
        b15.setFont(f1);
        b16.setFont(f2);
        b17.setFont(f2);
        b18.setFont(f1);
        b19.setFont(f2);
        b20.setFont(f2);
   
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
       

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);        
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
               

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);

        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }
        Object o = d.getSource();

        if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)){
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b9)){
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)){
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)){
            tf.setText(tf.getText() + b11.getLabel());        
        } else if (o.equals(b13)){
            tf.setText(tf.getText() + b13.getLabel());    
        } else if (o.equals(b14)){
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b15)){
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b17)){
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b18)){
            tf.setText(tf.getText() + b18.getLabel());

            
        } else if (o.equals(b16)) { //Addition

            fv = tf.getText();
            op = b16.getLabel();
            tf.setText("");

        } else if (o.equals(b12)) { //substraction

            fv = tf.getText();
            op = b12.getLabel();
            tf.setText("");
            
        } else if (o.equals(b8)) { //multiply

            fv = tf.getText();
            op = b8.getLabel();
            tf.setText("");
            
        } else if (o.equals(b4)) { //divide

            fv = tf.getText();
            op = b4.getLabel();
            tf.setText("");
            
        }else if (o.equals(b3)){
            double pertot = Double.parseDouble(tf.getText());
            tf.setText(pertot/100 + "");
            if(fv == null){
                fv = tf.getText();
            }

        }else if (o.equals(b2)){ //square root
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = Math.sqrt(fdv);
            tf.setText(tot + "");
            
        }else if (o.equals(b1)){ // All clear
            tf.setText("0");
            fv = sv = op = null;
            
        }else if (o.equals(b19)){  // clear one by one
            String cT = tf.getText();
                if(cT.length() > 0){
                    tf.setText(cT.substring(0,cT.length()-1));
                }else if (tf.getText().length() == 0){
                    tf.setText("0");
                
                }                                
            
        }else if (o.equals(b20)) { //equal
            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);
            tf.setText("");
            
            if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");
                
            } else if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");
                
            } else if (op.equals("*")) {
                tot = fdv * sdv;
                tf.setText(tot + "");
                
            }else if (op.equals("/")){
                tot = fdv / sdv;
                tf.setText(tot + "");
                
            }
                
        }
    }

}

public class Calculator {
     public static void main(String[] args) {
        new Cal();
    }
    
}
