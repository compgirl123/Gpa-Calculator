// ---------------------------------
// © Claudia Feochari April 2016
// Code Written by: Claudia Feochari
// Date : April 21st, 2016
// Project Title : Gpa Calculator
// Project Description :
// This program was designed to mimic a Gpa
// Calculator, in which the user is prompted
// to enter the letter grades they received
// in a semester and the program returns the 
// average gpa received for the student in 
// one semester. 
// ---------------------------------

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class gpa {
	
	public static void main(String[]args)
	{
		System.out.println("-----------------------");
		System.out.println("    GPA Calculator   ");
		System.out.println("-----------------------");
		Scanner keyboard = new Scanner(System.in);
		String [] grades = {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
		double [] gpas = {4.3,4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.3,1.0,0.7,0.0};
		System.out.println("Did you take any classes this semester?-->");
		String answer = keyboard.nextLine();
		String [] arr =null;
		
		
		
		if(answer.equals("yes"))
		{
			System.out.println("How many classes did you take this semester");
			int classes = keyboard.nextInt();
			double [] gpas2 = new double[classes];
			double [] numb_credits = new double[classes];
			double [] sum_gpas_credits=  new double[classes];
			
			String garbage = keyboard.nextLine();
			arr = new String[classes];
			double value_credits = 0.0;

			for(int x=0;x<arr.length;x++)
			{
				System.out.println("Please enter the letter grade for the class");
				String grade = keyboard.nextLine();
			    arr[x]=grade;
			    System.out.println("Please enter the number of credits the class is worth");
			    double credit = keyboard.nextDouble();
			    String junk = keyboard.nextLine();
			    numb_credits[x]=credit;
			    
			    
			    
			}
			for(int y =0;y<arr.length;y++)
			{
				for(int z=0;z<grades.length;z++)
				{
					if(arr[y].equals(grades[z]))
					{
						gpas2[y]=gpas[z];
						sum_gpas_credits[y]=numb_credits[y]*gpas2[y];
	
					}
				}
			}
		   System.out.println(grades_this_semester(arr,sum_gpas_credits,numb_credits));
		   
			
		}
		if(answer.equals("no"))
		{
			System.out.println("Thanks for stopping by!. Please return some other time when you have"
					+ " a gpa to calculate");
			System.exit(0);
		}
		
	}
	
	public static double finalgpa(double [] array,double[]array2)
	{
		double sum = 0.0;
		double final_gpa = 0.0;
		double sum_credits = 0.0;
		for(int x=0;x<array.length;x++)
		{
			sum+=array[x];
		}
		for(int x=0;x<array2.length;x++)
		{
			sum_credits+=array2[x];
		}
		final_gpa = sum*1.0/sum_credits;

		return final_gpa;
	}
	// returning the gpa
	
	public static String grades_this_semester(String[] array1, double [] array,double [] array2)
	{
		String grades= "";
		for(int x=0;x<array1.length;x++)
		{
			grades+=array1[x]+" ";
		}
		return "\n"+"Your Grades this semester "+grades+"\n"+"Your Final Gpa is: "+finalgpa(array,array2)+"\n";// temporary string
	}
	// printing the details of the grades and the gpa received
	
	
}
