/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author HP
 */
import java.awt.*;
import javax.swing.*;

public class ExerciseGUI extends JFrame {
    private JLabel label1, label2;
    private JTextField textField1;
    private JButton plainButton, fancyButton, button1, button2;
    private JTextArea textBox1;
    private JRadioButton b1, b2, b3;
    private JCheckBox cb1, cb2;
    private JComboBox<String> comboBox;

    public ExerciseGUI() {
        super("Exercise");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // Initialize and add label1
        label1 = new JLabel("Sila LOGIN", SwingConstants.CENTER);
        container.add(label1); 

        // Initialize and add label2 with an image and text
        Icon creeper = new ImageIcon("images.jpeg");
        label2 = new JLabel("Label with text and icon", creeper, SwingConstants.CENTER);
        label2.setToolTipText("This is Creeper");
        container.add(label2);

        // Initialize and add text field
        textField1 = new JTextField("Key in here", 15);
        textField1.setBackground(Color.darkGray);
        textField1.setForeground(Color.GREEN);
        textField1.setFont(new Font("Courier", Font.BOLD, 25));
        container.add(textField1);

        // Initialize and add plain button
        plainButton = new JButton("Plain Button");
        plainButton.setBackground(Color.magenta);
        plainButton.setForeground(Color.YELLOW);
        container.add(plainButton);

        // Initialize and add fancy button with icon
        Icon bug1 = new ImageIcon("image2.png");
        fancyButton = new JButton("Fancy Button", bug1);
        container.add(fancyButton);

        // Initialize and add buttons with icon and without icon
        Icon drink1 = new ImageIcon("milo.gif");
        button1 = new JButton("Milo Ice", drink1);
        button2 = new JButton("Nescafe");
        container.add(button1);
        container.add(button2);

        // Initialize and add text area
        textBox1 = new JTextArea("Multiple line", 5, 20);
        textBox1.setBackground(Color.CYAN);
        textBox1.setForeground(Color.DARK_GRAY);
        textBox1.setFont(new Font("Bookman", Font.BOLD, 20));
        container.add(textBox1);

        // Initialize and add radio buttons
        b1 = new JRadioButton("Häagen-Dazs");
        b2 = new JRadioButton("Baskin-Robbins");
        b3 = new JRadio
