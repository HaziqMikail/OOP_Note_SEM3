/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise5;

/**
 *
 * @author Haziq Mikail
 */
public class HighestAverageCalculator {
    // calculate the highest average of all student
    public float calculateHighestAverage(float avg1, float avg2, float avg3) {
        return Math.max(avg1, Math.max(avg2, avg3));  // Find highest average
    }
}

