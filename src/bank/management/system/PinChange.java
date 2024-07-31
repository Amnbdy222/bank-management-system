/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

/**
 *
 * @author aarav
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JButton change, back;
    JPasswordField pin, repin;
    
    String pinnumber;
    
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;  
    
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250, 280, 500, 35);
        image.add(text);
        
        JLabel pinText = new JLabel("New PIN:");
        pinText.setForeground(Color.WHITE);
        pinText.setFont(new Font("System", Font.BOLD, 16));
        pinText.setBounds(165, 320, 180, 25);
        image.add(pinText);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 16));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);
        
        JLabel repinText = new JLabel("Re-Enter New PIN:");
        repinText.setForeground(Color.WHITE);
        repinText.setFont(new Font("System", Font.BOLD, 16));
        repinText.setBounds(165, 360, 180, 25);
        image.add(repinText);
        
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 16));
        repin.setBounds(330, 360, 180, 25);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == change) {
            try {
                String npin = pin.getText();
                String rpin = repin.getText();
            
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter new PIN");
                    return;
                }
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                    return;
                }
                
                Conn conn = new Conn();
                String query1 = "update bank set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";
                String query2 = "update login set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";
                String query3 = "update signupthree set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";
                
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            }
            catch(Exception e){
            System.out.println(e);
            }
        }else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new PinChange("").setVisible(true);
    }
}
