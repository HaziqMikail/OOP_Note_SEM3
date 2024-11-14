/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise;

/**
 *
 * @author HP
 */
import java.awt.*;
import javax.swing.*;

public class Exercise extends JFrame {



    public Exercise() {
        super("Exercise"); 
        Container container = getContentPane(); 
        container.setLayout(new FlowLayout());

        // Initialize and add label1
        label1 = new JLabel("Sila LOGIN",SwingConstants.CENTER);
        add(label1); 
        
        
    }

    public static void main(String[] args) {

    }
}
