import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Scanner;

public class StudentInformation {
    private String FirstName;
    private String SurName;
    private String Address;
    private String Nation;
    private int StudentPhone;
    private int EmergencyContact;
    private String StudentID;
    private String SelectedCourse;
    private String Subjects = "";
    private int Year;
    private int CourseFeeBalance = 0;
    private int CoursePrice = 300;
    private static int SubjectID = 00000000;

    public StudentInformation(String firstName, String surName, String address, String nation, int studentPhone, int emergencyContact, String studentID, String selectedCourse, String subjects, int year, int courseFeeBalance, int coursePrice) {
        FirstName = firstName;
        SurName = surName;
        Address = address;
        Nation = nation;
        StudentPhone = studentPhone;
        EmergencyContact = emergencyContact;
        StudentID = studentID;
        SelectedCourse = selectedCourse;
        Subjects = subjects;
        Year = year;
        CourseFeeBalance = courseFeeBalance;
        CoursePrice = coursePrice;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < 3){
            throw new IllegalArgumentException("Wrong First name! Too little characters");
        }
        else {
            this.FirstName = firstName;
        }
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        if(surName.length() > 20){
            throw new IllegalArgumentException("Wrong Surname too many characters");
        }
        else {
            this.SurName = surName;;
        }
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        if(address.length() < 5){
            throw new IllegalArgumentException("Wrong Address too Little characters");
        }
        else {
            this.Address = address;
        }
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        if(nation.length() < 4){
            throw new IllegalArgumentException("Wrong Nationality too Little characters");
        }
        else {
            this.Nation = nation;
        }
    }

    public int getStudentPhone() {
        return StudentPhone;
    }

    public void setStudentPhone(int studentPhone) {
        if(studentPhone < 7){
            throw new IllegalArgumentException("Wrong Number, phone number missing digits");
        }
        else {
            this.StudentPhone = studentPhone;
        }
    }

    public int getEmergencyContact() {
        return EmergencyContact;
    }

    public void setEmergencyContact(int emergencyContact) {
        if(emergencyContact < 7){
            throw new IllegalArgumentException("Wrong Number, phone number missing digits");
        }
        else {
            this.EmergencyContact = emergencyContact;
        }
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getSelectedCourse() {
        return SelectedCourse;
    }

    public void setSelectedCourse(String selectedCourse) {
        if(selectedCourse.length() < 4){
            throw new IllegalArgumentException("Wrong Selected Course too Little characters");
        }
        else {
            this.SelectedCourse = selectedCourse;
        }
    }

    public String getSubjects() {
        return Subjects;
    }

    public void setSubjects(String subjects) {
        if(subjects.length() < 3){
            throw new IllegalArgumentException("Wrong Subject too Little characters");
        }
        else {
            this.Subjects = subjects;
        }
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        if(year < 1){
          throw new IllegalArgumentException("Wrong Year");
        }
        else {
            this.Year = year;
        }
    }

    public int getCourseFeeBalance() {
        return CourseFeeBalance;
    }

    public void setCourseFeeBalance(int courseFeeBalance) {
        CourseFeeBalance = courseFeeBalance;
    }

    public int getCoursePrice() {
        return CoursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        CoursePrice = coursePrice;
    }

    public static int getSubjectID() {
        return SubjectID;
    }

    public static void setSubjectID(int subjectID) {
        SubjectID = subjectID;
    }

    public StudentInformation(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nPlease Enter Student's First Name: ");
        this.FirstName = in.nextLine();

        System.out.print("Please Enter Student's Surname: ");
        this.SurName = in.nextLine();

        System.out.print("Please Enter Student's Nationality: ");
        this.Nation = in.nextLine();

        System.out.print("Please Enter Student's Address: ");
        this.Address = in.nextLine();

        System.out.print("Please Enter Student's Chosen Course Title: ");
        this.SelectedCourse= in.nextLine();

        System.out.print("Please Enter Student's Mobile Phone Number: ");
        this.StudentPhone = in.nextInt();

        System.out.print("Please Enter Student's Emergency Contact: ");
        this.EmergencyContact = in.nextInt();

        System.out.print("\nEnter 1 For First Year\nEnter 2 For Second Year\nEnter 3 For Third Year\nEnter 4 For Final Year\nPlease Enter Student's Course Year: ");
        this.Year = in.nextInt();
        setStudentID();
    }
    //Create Student ID Number
    private void setStudentID() {
        SubjectID++;
        this.StudentID = Year + "" + SubjectID;//Creates StudentID by merging year and adding number
    }

    public void EnrollStudent(){
        do {
            System.out.print("What course are you enroling for? (Enter Q to End): ");
            Scanner in = new Scanner(System.in);
            String Subject = in.nextLine();

            if (!Subject.equals("Q")) {//if subjects entered equals "Q" program ends
                Subjects = Subjects + "\n\t" + Subject; //new subjects are added to "Subjects to make a list of subjects"
                CourseFeeBalance = CourseFeeBalance + CoursePrice;//Adding total fee based on the number of subjects added
            }
            else {
                break;
            }
        } while(1 != 0);//Runs an infinite loop "do" until user enter Q to end loop

        System.out.println("\nStudent is Now Enrolled In: " + Subjects);//List of subjects student is enrolled //prints Courses enrolled
        System.out.println("Total Course Fee: €" + CourseFeeBalance);//Total calculated Course fee for student
    }
    public void ViewCourseBalance(){
        System.out.println("Your current Course Balance is €" + CourseFeeBalance);//View Course balance
    }

    public void CourseFeePayment(){
        System.out.print("How much of your Fee would you like to pay?: €");
        Scanner in = new Scanner(System.in);// Ask user how much they would like to pay
        int pay = in.nextInt();
        CourseFeeBalance = CourseFeeBalance - pay; // payment calculation
        System.out.println("\nYour payment of €" + pay + " was successfull");
        ViewCourseBalance();
    }

    public String toString(){
        return "\nStudent Information: \nStudent Name: " + FirstName + " " + SurName +
                "\nStudent Nationality: " + Nation +
                "\nStudent Phone Number: " + StudentPhone +
                "\nStudent Emergency Contact: " + EmergencyContact +
                "\nStudent Address: " + Address +
                "\nStudent Academic Course: " + SelectedCourse +
                "\nStudent ID: G00" + StudentID +
                "\nAcademic Year: " + Year + " " +
                "\nSubjects Enrolled: " + Subjects +
                "\nCurrent Course Balance: €" + CourseFeeBalance;
    }

}
