package mainclass;  //kalau x boleh tekan penukul&penyapu

import javax.swing.JOptionPane;
public class Joptionpane {
    public void displayquestion(){
       
       String nama = JOptionPane.showInputDialog("Enter your name");
       String kelas = JOptionPane.showInputDialog("Enter your class");
      
       String message = "Name: " + nama + "\nClass: " + kelas;
       JOptionPane.showMessageDialog(null, message, "Results", JOptionPane.PLAIN_MESSAGE);
    }
}
