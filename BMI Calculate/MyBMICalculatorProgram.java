import javax.swing.*;
import java.util.Scanner; //for Scanner
import java.text.*; //for DecimalFormat
class MyBMICalculatorProgram {
    public static void main (String[] args) {
        System.out.println("********* BMI Calculator *********");
        //Input Data
        Scanner KeyboardInput = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String MyFirstname = KeyboardInput.nextLine();
        System.out.print("Enter Last Name : ");
        String MyLastname = KeyboardInput.nextLine();
        System.out.print("Enter your weight (kg.) : ");
        double MyWeight = KeyboardInput.nextDouble();
        System.out.print("Enter you height (cm.) : ");
        double MyHeight = KeyboardInput.nextDouble();
        System.out.println("************* Result *************");
        //Calculate
        double meters = MyHeight / 100 ; //Change Centimeters to Meters
        double MyBMI = MyWeight / (meters * meters) ; //Calculate BMI
        String MyFullname = MyFirstname + " " + MyLastname ; //Combine Firstname and Lastname
        DecimalFormat newformat = new DecimalFormat("0.00") ; //Change format
        //BMI Output
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