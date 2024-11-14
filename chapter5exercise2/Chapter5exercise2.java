/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5exercise2;

/**
 *
 * @author HP
 */

import java.util.Scanner;

public class Chapter5exercise2 {
    public static void main(String[] args) {
        int mark;
        char grade;     //declare variable

        Scanner input = new Scanner(System.in);

        System.out.print("Enter mark: ");//user enter mark
        mark = input.nextInt();

        GradeCalculator gradeCalculator = new GradeCalculator();//create object
        grade = gradeCalculator.calculateGrade(mark); //call method in other file

        System.out.println("Your grade is: " + grade);
    }
}

















