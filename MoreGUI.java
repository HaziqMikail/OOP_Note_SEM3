/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moregui;

/**
 *
 * @author HP
 */

import java.awt.*;
import javax.swing.*;

public class MoreGUI extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

//        g.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
//        g.drawString("Always be happy guys", 10, 20);
//        g.setColor(Color.BLUE); // line bawah
//        g.drawLine(5, 30, 280, 30);
//        g.setColor(Color.yellow); //warna bentuk
//        g.fillArc(90, 120, 200, 200, 180, 360);//(int x, int y, int width, int height, int startAngle, int arcAngle): 
//    
//        g.setColor(Color.black); 
//        g.fillArc(130, 170, 40, 40, 180, 360);
//        g.setColor(Color.black); 
//        g.fillArc(210, 170, 40, 40, 180, 360);
//        g.setColor(Color.black); 
//        g.fillArc(155, 200, 70, 70, 180, 180);
//        g.setColor(Color.white); 
//        g.fillArc(170, 215, 40, 40, 180, 180);

        g.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        g.drawString("Always be happy guys", 10, 20);
        g.setColor(Color.BLUE); // line bawah
        g.drawLine(5, 30, 280, 30);
        
        g.setColor(Color.BLACK); 
        g.fillArc(195, 35, 140, 140, 220, 40);
        g.setColor(Color.BLACK); 
        g.fillArc(45, 35, 140, 140, 280, 40);
        g.setColor(Color.RED); //warna bentuk
        g.fillArc(90, 120, 200, 200, 180, 360);//(int x, int y, int width, int height, int startAngle, int arcAngle): 
    

        g.setColor(Color.black); 
        g.fillArc(130, 190, 40, 40, 0, 180);
        g.setColor(Color.black); 
        g.fillArc(210, 190, 40, 40, 0, 180);
        g.setColor(Color.black); 
        g.fillArc(155, 200, 70, 70, 180, 180);
        g.setColor(Color.white); 
        g.fillArc(170, 215, 40, 40, 180, 180);


    
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI exercise");
        MoreGUI panel = new MoreGUI();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


