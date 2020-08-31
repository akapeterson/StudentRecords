import java.util.Scanner;

public class StudentRecordsSystem {

    public static void main(String[] args) {
        System.out.print("How many new students would you like to enroll?: ");
        Scanner in = new Scanner(System.in);
        int NumberOfStudents = in.nextInt(); //User inputs number of new students for the array
        StudentInformation[] Students = new StudentInformation[NumberOfStudents]; //Makes an array of objects from Student Information Class

        for (int n = 0; n < NumberOfStudents; n++){ //this loop is here so that the number of new enrolled can be accomplished. Loop will loop accourding to the number of new student added
            //StudentInformation NewStudent = new StudentInformation();//Calling new student method
            Students[n] = new StudentInformation();
            Students[n].EnrollStudent(); //Calling enroll method for enrolling student
            Students[n].CourseFeePayment();//Calls payment method from Student information Class
        }

        for (int n = 0; n < NumberOfStudents; n++){ //this loop is here so that the number of new enrolled can be accomplished. Loop will loop accourding to the number of new student added
            System.out.println(Students[n].toString());
        }
    }
}
