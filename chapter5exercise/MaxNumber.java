/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise;

/**
 *
 * @author HP
 */
public class MaxNumber {
    public static int calcMaxNum(int[] numbers) 
    {
        return Math.max(Math.max(numbers[0], numbers[1]), numbers[2]);
    }
}



