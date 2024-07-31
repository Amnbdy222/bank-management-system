package bank.management.system;

/**
 *
 * @author aarav
 */

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{
        
        
        JTextField panTextField, aadharTextField;
        JButton next;
        JRadioButton syes, sno, eyes, eno;
        JComboBox select_religion, select_category, select_occupation, select_education, select_income;
        String formno;
    
    SignupTwo(String formno) {
        
        this.formno = formno;
        
        setLayout(null);
     
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        select_religion = new JComboBox(valReligion);
        select_religion.setBounds(300, 140, 400, 30);
        select_religion.setBackground(Color.WHITE);
        add(select_religion);
        
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        select_category = new JComboBox(valCategory);
        select_category.setBounds(300, 190, 400, 30);
        select_category.setBackground(Color.WHITE);
        add(select_category);
        
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String incomeCategory[] = {"Null", "< 1,50,000", "<2,50,000", "< 5,00,000", "Upto 10,00,000", "> 10,00,000"};
        select_income = new JComboBox(incomeCategory);
        select_income.setBounds(300, 240, 400, 30);
        select_income.setBackground(Color.WHITE);
        add(select_income);
        
       
        JLabel educational = new JLabel("Educational:");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String educationValues[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        select_education = new JComboBox(educationValues);
        select_education.setBounds(300, 315, 400, 30);
        select_education.setBackground(Color.WHITE);
        add(select_education);
        
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Student","Retired", "Other"};
        select_occupation = new JComboBox(occupationValues);
        select_occupation.setBounds(300, 390, 400, 30);
        select_occupation.setBackground(Color.WHITE);
        add(select_occupation);
        
        JLabel pan = new JLabel("Pan No:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        
        JLabel aadhar = new JLabel("Aadhar No:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        
        
        JLabel senior_citizen = new JLabel("Senior Citizen:");
        senior_citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        senior_citizen.setBounds(100, 540, 200, 30);
        add(senior_citizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);
        
        
        JLabel existing_account = new JLabel("Existing Account:");
        existing_account.setFont(new Font("Raleway", Font.BOLD, 20));
        existing_account.setBounds(100, 590, 200, 30);
        add(existing_account);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String valReligion = (String) select_religion.getSelectedItem();
        String valCategory = (String) select_category.getSelectedItem(); 
        String incomeCategory = (String) select_income.getSelectedItem();
        String educationValues = (String) select_education.getSelectedItem();
        String occupationValues = (String) select_occupation.getSelectedItem();
        String senior_citizen = "";
        if (syes.isSelected())
        {
            senior_citizen = "Yes";
        }
        else if (sno.isSelected())
        {
            senior_citizen = "No";
        }
        String existing_account = "";
        if(eyes.isSelected())
        {
            existing_account = "Yes";
        }
        else if (eno.isSelected())
        {
            existing_account = "No";
        }
        
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        
        try {
            if (pan.equals("")){
                JOptionPane.showMessageDialog(null, "Pan is required");
            }
            if (aadhar.equals("")){
                JOptionPane.showMessageDialog(null, "Aadhar is required");
            }
            if (senior_citizen.equals("")){
                JOptionPane.showMessageDialog(null, "Senior Category cannot be null");
            }
            if (existing_account.equals("")){
                JOptionPane.showMessageDialog(null, "Existing Account Status is mandatory");
            }
            
            else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+valReligion+"', '"+valCategory+"', '"+incomeCategory+"', "
                                                        + "'"+educationValues+"', '"+occupationValues+"', '"+pan+"', "
                                                        + "'"+aadhar+"', '"+senior_citizen+"', '"+existing_account+"')";
                c.s.executeUpdate(query);
                
                //SignUpThree Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
}
