/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5exercise3;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class Chapter5exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[10], counts;
        char[] grades;

        System.out.println("Enter 10 marks:");//user input 10 data
        for (int i = 0; i < 10; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        GradeIdentifier gradeIdentifier = new GradeIdentifier(); // Create gradeIdentifier object
        grades = gradeIdentifier.identifyGrades(marks); // Call gradeIdentifier method

        GradeCounter gradeCounter = new GradeCounter(); // Create gradeCounter object
        counts = gradeCounter.countGrades(grades);// Call gradeCounter method

        System.out.println("Out of 10:");//print result
        System.out.println("Grade A: " + counts[0]);
        System.out.println("Grade B: " + counts[1]);
        System.out.println("Grade C: " + counts[2]);
        System.out.println("Grade D: " + counts[3]);
        System.out.println("Grade E: " + counts[4]);

        input.close();
    }
}