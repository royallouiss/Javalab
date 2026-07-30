import java.util.Scanner;
class calculator {

    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }



}

class DemoCalculator{
public static void main(String[]args){
    calcualtor calc =new calculator();
    scanner sc=new scanner(system.in);
    system.out.println("enter the first number");
    double num1=sc.nextdouble();
    system.out.println("enter the second number");
    double num2=sc.nextdouble();
    system.out.println("addition of two num is "+calc.add(num1,num2));
    system.out.println("subtraction of two number is"+calc.substract(num1,num2));
    system.out.println("division of two number is"+calc.divide(num1,num2));
}
}