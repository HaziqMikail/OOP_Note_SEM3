/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise;

/**
 *
 * @author HP
 */
public class MinNumber {
    public int calcMinNum(int[] numbers) {
        return Math.min(Math.min(numbers[0], numbers[1]), numbers[2]);
    }
}

