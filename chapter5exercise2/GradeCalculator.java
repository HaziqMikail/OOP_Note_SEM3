/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise2;

/**
 *
 * @author HP
 */

public class GradeCalculator {
    public char calculateGrade(int mark) {
        if (mark >= 80) {//identify grade based on mark entered
            return 'A';
        } else if (mark >= 70) {
            return 'B';
        } else if (mark >= 60) {
            return 'C';
        } else if (mark >= 50) {
            return 'D';
        } else if (mark >= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
