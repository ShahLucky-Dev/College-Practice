import java.util.Scanner;

class Student {

    String name;
    int rollno;
    int marks;

   
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollno = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

   
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollno);
        System.out.println("Marks  : " + marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details for Student 1");
        s1.input();

        System.out.println("\nEnter details for Student 2");
        s2.input();

        System.out.println("\nStudent Details:");
        s1.display();
        s2.display();
    }
	
};			