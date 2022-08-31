import javax.swing.*;
import java.util.Scanner; //for Scanner
import java.text.*; //for DecimalFormat
class MyBMICalculatorProgram {
    public static void main (String[] args) {
        //Assign
        String MyFirstname, MyLastname, MyFullname ;
        double MyWeight, MyHeight, Meters, MyBMI ;
        DecimalFormat newformat = new DecimalFormat("0.00") ; //Change format
        Scanner KeyboardInput = new Scanner(System.in);
        //Input Data
        System.out.println("********* BMI Calculator *********");
        System.out.print("Enter first name : ");
        MyFirstname = KeyboardInput.nextLine();
        System.out.print("Enter Last Name : ");
        MyLastname = KeyboardInput.nextLine();
        System.out.print("Enter your weight (kg.) : ");
        MyWeight = KeyboardInput.nextDouble();
        System.out.print("Enter your height (cm.) : ");
        MyHeight = KeyboardInput.nextDouble();
        //Calculate
        Meters = MyHeight / 100 ; //Change Centimeters to Meters
        MyBMI = MyWeight / (Meters * Meters) ; //Calculate BMI
        MyFullname = MyFirstname + " " + MyLastname ; //Combine Firstname and Lastname
        //BMI Output
        System.out.println("************* Result *************");
        System.out.println(MyFullname + " "+ "BMI is" + " " + newformat.format(MyBMI)) ;
        //Extra (generate BMI to your Health)
        //Condition
        if (MyBMI <= 18.5) {
            System.out.println(MyFirstname + " " +"You are underweight");
        }else if (MyBMI <= 25) {
            System.out.println(MyFirstname + " " + "You are normal");
        }else if (MyBMI <=30) {
            System.out.println(MyFirstname + " " + "You are overweight");
        }else {
            System.out.println(MyFirstname + " " + "you are getting obese");
        }
        System.out.println("**********************************");
    }
}