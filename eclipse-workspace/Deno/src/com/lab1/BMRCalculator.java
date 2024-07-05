package com.lab1;

import java.util.Scanner;

public class BMRCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to BMI and BMR Calculator");

       
        System.out.print("Enter your gender (M/F): ");
        String gender = scanner.nextLine();

      
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        
        System.out.print("Enter your age in years: ");
        int age = scanner.nextInt();


        double bmr = calculateBMR(gender, weight, heightCm, age);
        System.out.printf("Your Basal Metabolic Rate (BMR) is: %.2f calories/day\n", bmr);


        double heightMeters = heightCm / 100.0;

        double bmi = calculateBMI(weight, heightMeters);
        System.out.printf("Your Body Mass Index (BMI) is: %.2f\n", bmi);

    
        String bmiCategory = getBMICategory(bmi);
        System.out.println("BMI Category: " + bmiCategory);

        scanner.close();
    }

  
    public static double calculateBMR(String gender, double weight, double heightCm, int age) {
        double heightMeters = heightCm / 100.0;
        if (gender.equalsIgnoreCase("M")) {
            
            return 88.362 + (13.397 * weight) + (4.799 * heightMeters * 100) - (5.677 * age);
        } else {
         
            return 447.593 + (9.247 * weight) + (3.098 * heightMeters * 100) - (4.330 * age);
        }
    }

  
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

   
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Healthy";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

}
