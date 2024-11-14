/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise3;

/**
 *
 * @author HP
 */
public class GradeCounter {
    public int[] countGrades(char[] grades) {
        int[] counts = new int[5];

        for (char grade : grades) {
            switch (grade) {
                case 'A':
                    counts[0]++; //add one to grade A
                    break;
                case 'B':
                    counts[1]++; //add one to grade B
                    break;
                case 'C':
                    counts[2]++; //add one to grade C
                    break;
                case 'D':
                    counts[3]++; //add one to grade D
                    break;
                case 'E':
                    counts[4]++; //add one to grade E
                    break;
            }
        }
        return counts;
    }
}
