/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise5;

/**
 *
 * @author Haziq Mikail
 */

public class AverageCalculator {   
    public float calculateAverage(float[] marks) {// Method to calculate the average of marks
        float sum = 0;
        for (float mark : marks) {
            sum += mark;
        }
        return sum / marks.length;  // Calculate average
    }
}
