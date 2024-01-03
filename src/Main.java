
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//class to run the project
public class Main {
    // Method for the project to run the calculation
    public static void main(String[] args) {
        // Print the number of course to input for the user
        System.out.println("How many course are taking this semester");
        // Instantiate the scanner class which is a build in class for user to input data
        Scanner scan = new Scanner(System.in);
        //create the variable for storge thescanner class
        int semesterCourses = scan.nextInt();
        double [] num_courses = new double[semesterCourses];
        double sum = 0;
        for (int i = 0; i < num_courses.length; i++){
            System.out.println("Enter your average for the course " + (i+1) + ":");
            num_courses[i] =  scan.nextDouble();

        }
        for (double numCours : num_courses) {
            sum = sum + numCours;
        }
        double average = sum/num_courses.length;
        System.out.println(" your average for the course " + average );
        if (average > 90){
            System.out.println(" You have A : excellent result keep it up ");
        }
        else if (average <= 90 && average > 80 ) {
            System.out.println("You have B : very good  result keep it up");

        } else if (average <= 80 && average > 70) {
            System.out.println("You have C : good result keep it up");


        } else if (average <= 70 && average > 50 ) {
            System.out.println("You have D : Pass result");

        }
        else{
            System.out.println("You failed");
        }


//        String [] Data = new String[7];
//        Data[0] = "red";
//        Data[1] = "blue";
//        Data[2] = "orange";
//        Data[3] = "purple";
//        Data[4] = "orange";
//        Data[5] = "pink";
//        Data[6] = "white";
//
//        for (int i=0; i < Data.length; i++){
//            if(Data[i].equals("orange")){
//                System.out.println("car number " +i+ " is orange");
//
//            }
//            else{
//                System.out.println(" car number " +i+ " is not orange" );
//            }

        }
//        System.out.println("Do you like a car ");
//        Scanner scan = new Scanner(System.in);
//        String ans1 = scan.next();
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//
//        if (ans1.equalsIgnoreCase("Yes")) {
//            System.out.println("Which color do you like red or blue");
//            String ans2 = scan.next();
//            System.out.println("The color of the car is " );
//            if (ans2.equalsIgnoreCase("red")) {
//                System.out.println("I like red car color");
//
//            }
//            else {
//                System.out.println("I  like blue car color");
//            }
//        }
//        else {
//            System.out.println("I dont like a car");
//
//        }

//         for (double i = 1; i <= 11; i +=5) {
//             //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//             // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//
//             System.out.println("i = " + i);
//         }

}