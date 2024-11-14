/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise4;

/**
 *
 * @author Haziq Mikail
 */

public class Converter {

    // Convert Celsius to Fahrenheit
    public float convertCelsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public float convertFahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Kilograms to Grams
    public float convertKilogramsToGrams(float kilograms) {
        return kilograms * 1000;
    }

    // Convert Grams to Kilograms
    public float convertGramsToKilograms(float grams) {
        return grams / 1000;
    }

    // Convert Meters to Centimeters
    public float convertMetersToCentimeters(float meters) {
        return meters * 100;
    }

    // Convert Centimeters to Meters
    public float convertCentimetersToMeters(float centimeters) {
        return centimeters / 100;
    }
}


