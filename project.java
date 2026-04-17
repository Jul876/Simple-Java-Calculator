package project;
import java.util.Scanner;
public class project {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Please enter the first number:");
	        int num1 = scanner.nextInt();

	        System.out.println("Please enter the second number:");
	        int num2 = scanner.nextInt();
            
	        System.out.println("Please select one of the following operations by typing a, b, or c");
	        System.out.println("----------------------------------------------------------------");
	        System.out.println("a- Add the two numbers");
	        System.out.println("b- Multiply the two numbers");
	        System.out.println("c- Find the average of the two numbers");
	        System.out.println("----------------------------------------------------------------");

	        char choice =  scanner.next().charAt(0);
	        switch (choice) {
	            case 'a':
	            	System.out.println(num1+" + "+num2+"= "+add(num1,  num2));
	                break;
	            case 'b':
	            	System.out.println(num1+" * "+ num2+"= "+multiply(num1, num2));
	                break;
	            case 'c':
	                System.out.println("The average of "+num1+" and "+num2+" is "+findAverage(num1, num2));
	                break;
	            default:
	                System.out.println("Wrong choice try again");
	        }
	    }
	    public static int add(int num1, int num2) {
	    	 return num1+ num2;
	    }
	    public static int multiply(int num1, int num2) {
	        return num1 * num2;
	    }
	    public static int findAverage(int num1, int num2) {
	        return (num1 + num2) / 2;
	    }
	}