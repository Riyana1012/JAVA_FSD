package project1.calculator;
import java.util.Scanner;
public class Arithmetic_calculator {
    public static void main(String[] args) {
    	double n1,n2;
    	char operator;
        double result;
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number n1:");
        n1 = sc.nextDouble();
        System.out.print("Enter second number n2:");
        n2 = sc.nextDouble();
        System.out.print("Enter operation (+,-,*,/):");
        operator = sc.next().charAt(0);
        sc.close();
        
        switch(operator)
        {
            case'+':
            	result=n1+n2;
                break;
            case'-':
            	result=n1-n2;
                break;
            case'*':
            	result=n1*n2;
                break;
            case'/':
            	result=n1/n2;
                break;
            default:
                System.out.printf("Enter Operator");
                return;
        }
        System.out.println("The result is:" +n1+" "+operator+" "+n2+" = "+result);
    }
}



