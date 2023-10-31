import function.utils.*;
import functionl.math.*;
import javType.type.*;
import displayDetial.*;
import javaProblem.*;
import OOP.*;

public class Main {
    public static void main(String[] args) {
        testMathFunction();
        testUtils();
        testType();
        testDisplay();
        testProblem();
    }

    public static void testMathFunction() {
        System.out.println("This is Math function package.");
        System.out.println("Add function: " + MathFuncion091.add(1,2));
        System.out.println("Subtract function: " + MathFuncion091.subtract(5,4,3,2));
        System.out.println("Multiply function: " + MathFuncion091.multiply(1,2,3));
        System.out.println("Divide function: " + MathFuncion091.divide(2,1));
        System.out.println("");
    }
    public static void testUtils() {
        System.out.println("This is Utils package.");
        System.out.println("Check null: " + Utils091.checkString(null));
        System.out.println("Check empty/blank: " + Utils091.checkString(""));
        System.out.println("Check String: " + Utils091.checkString("Hello"));
        System.out.println("Check int negative: " + Utils091.checkInt(0));
        System.out.println("Check int: positive " + Utils091.checkInt(1));
        System.out.println("");
    }
    public static void testType() {
        System.out.println("This is Type package.");
        System.out.println("Int type: " + Type091.intType(1));
        System.out.println("Long type: " + Type091.longType(1234567890));
        System.out.println("Double type: " + Type091.doubleType(1.00));
        System.out.println("Boolean type: " + Type091.booleanType(false));
        System.out.println("Char type: " + Type091.charType('A'));
        System.out.println("String type: " + Type091.stringType("Hello world."));
        System.out.println("");
    }

    public static void testDisplay(){
        System.out.println("This is Display package");
        System.out.println("Display name: " + Display091.nameDisplay("Tom"));
        System.out.println("Display age: " + Display091.ageDisplay(18));
        System.out.println("Display blood type: " + Display091.groupBloodDisplay('A'));
        System.out.println("Display blood type AB by adding 2 char: " + Display091.groupBloodDisplay('A')  + Display091.groupBloodDisplay('B'));
        System.out.println("Display all value: " + Display091.allValue("Tom" , 18 , 'A'));
        System.out.println("");
    }

    public static void testProblem() {
        System.out.println("This is Problem package");
        System.out.println("Compute circle area: " + Problems091.circleArea(5));
        System.out.println("Compute triangle area: " + Problems091.triangleArea(2,5));
        System.out.println("Compute rectangle area: " + Problems091.rectangleArea(2,3));
        System.out.println("Compute square area: " + Problems091.squareArea(2));
        System.out.println("Compute sphere area: " + Problems091.sphereArea(5));
        System.out.println("Celsius to Kelvin: " + Problems091.celsiusToKelvin(10));
        System.out.println("Kelvin to Celsius: " + Problems091.kelvinToCelsius(283.15));
        System.out.println("Celsius to Fahrenheit: " + Problems091.celsiusToFahrenheit(10));
        System.out.println("Check grade 0-49: " + Problems091.checkGrade(49));
        System.out.println("Check grade 50-59: " + Problems091.checkGrade(59));
        System.out.println("Check grade 60-69: " + Problems091.checkGrade(69));
        System.out.println("Check grade 70-79: " + Problems091.checkGrade(79));
        System.out.println("Check grade 80-100: " + Problems091.checkGrade(80));
        System.out.println("Check grade invalid score(lower than 0): " + Problems091.checkGrade(-1));
        System.out.println("Check grade invalid score(higher than 100): " + Problems091.checkGrade(101));

        System.out.println("Calculate BMI: : " + Problems091.calculateBMI(65,1.74));
        System.out.println("Check BMI: " + Problems091.checkBMI(65,1.74));
        System.out.println("Check name case-sensitive(welovekk): " + Problems091.checkName("welovekk"));
        System.out.println("Check name case-sensitive(WeLoveKK): " + Problems091.checkName("WeLoveKK"));
        System.out.println("Check odd or even(Odd = true): " + Problems091.checkOddOrEven(1));
        System.out.println("Check odd or even(Even = false): " + Problems091.checkOddOrEven(2));
        System.out.println("Check leap year(Not leap year = false): " + Problems091.checkLeapYear(1900));
        System.out.println("Check leap year(Leap year = true): " + Problems091.checkLeapYear(2000));
        System.out.println("");
    }


    //functinn withpoit return 1 parameter string .. if input hello world --> hello (next line) world
}