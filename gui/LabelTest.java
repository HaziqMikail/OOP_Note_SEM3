/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;



/**
 *
 * @author HP
 */

import java.awt.*;
import javax.swing.*;

public class LabelTest extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton plainbutton;
    private JButton fancyButton;
    private JButton  button1, button2;
    private JTextArea Textbox1;
    private JRadioButton b1, b2, b3;
    private JCheckBox cb1, cb2 ;
    private JComboBox Combobox;



    public LabelTest() {
        super("Chapter 7 - GUI"); // Calls the constructor of the superclass
        Container container = getContentPane(); // Retrieves the content pane of the JFrame
//        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.setLayout(new FlowLayout());

        // Initialize and add label1
        label1 = new JLabel("This is label");
        add(label1); // Add label1 to the content pane
        
        // Initialize and add label2 with an image and text
        Icon creeper = new ImageIcon("images.jpeg");
        label2 = new JLabel("Label with text and icon", creeper, SwingConstants.CENTER);
        label2.setToolTipText("This is Creeper"); 
        add(label2); 

        setSize(575, 500);
        setVisible(true);      
        
        
        //---------TEXTFIELD----------------------
        textField1 = new JTextField("Key in  here"); //panjang kotak
        textField1.setSize(100,20);
        textField1.setLocation(20,20);
        textField1.setBackground(Color.darkGray);
        textField1.setForeground(Color.GREEN);
        textField1.setFont(new Font("Courier",Font.BOLD,25));
        add(textField1);
        
        
        //--------BUTTON-------------------------
        plainbutton = new JButton("Plain Button");
        plainbutton.setBackground(Color.magenta);
        plainbutton.setForeground(Color.YELLOW);
        add(plainbutton);
        
        Icon bug1 = new ImageIcon("image2.png");
        fancyButton = new JButton("\nFancy button", bug1);
        fancyButton.setSize(100,100);
        add(fancyButton);
        
        Icon drink1 = new ImageIcon("milo.gif");
        button1 = new JButton("Milo Ice", drink1);
        button2 = new JButton("Nescafe");
        button1.setSize(224,225); //set size 
        button2.setSize(50,20); //set size
        button1.setLocation(20,30); // x,y
        button2.setLocation(20,80); 
        add(button1); 
        add(button2);
        
        //--------JTextArea (can multiple line)------------
        Textbox1 = new JTextArea ("Multiple line");
        Textbox1.setSize(100,200);
        Textbox1.setLocation(20,20);
        Textbox1.setBackground(Color.CYAN);
        Textbox1.setForeground(Color.DARK_GRAY);
        Textbox1.setFont(new
        Font("Bookman",Font.BOLD,20));
        add(Textbox1);
        
        //------JRadioButton-----------------
        b1 = new JRadioButton("Hagen Dazz");
        b2 = new JRadioButton("Basken Robin");
        b3 = new JRadioButton("Walls");
        b1.setBounds(20,20,200,50); // (x,y,width,height)
        b2.setBounds(20,70,200,50);
        b3.setBounds(20,110,200,50);
        add(b1);
        add(b2);
        add(b3);
        
        //--------JCHECKBOX------------
        cb1 = new JCheckBox("C");
        cb2 = new JCheckBox("JAVA");        
        cb1.setBounds(20,20,200,50);
        cb2.setBounds(20,70,200,50);
        add(cb1);
        add(cb2);

        //---------JComboBox---------------
        String names[]= {"tiger","tapir","capybara"};
        Combobox = new JComboBox(names);
        Combobox.setMaximumRowCount(3);
        Combobox.setBounds(50,50,100,20);
        add(Combobox);


    }

    public static void main(String[] args) {
        LabelTest application = new LabelTest(); // Corrected to LabelTest instance
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

