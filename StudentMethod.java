import java.util.*;

class Student{
	
	String name;
	int age;
	int marks;
	
		void input(){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("name");
			name = sc.nextLine();
			
			System.out.println("age");
			age = sc.nextInt();
			
			System.out.println("marks");
			marks = sc.nextInt();
		}
		
		void display(){
			System.out.println("name:- "  + name);
			System.out.println("age:- "  + age);
			System.out.println("marks:- "  + marks);
			
		}
		
		public static void main(String[] args){
			Student s1 = new Student();
			Student s2  = new Student();
			
			System.out.println("s1 deatail");
			s1.input();
			
			System.out.println("s2 deatail");
			s2.input();
			
			System.out.println("deatails");
			s1.display();
			s2.display();
			
			
			
		}
}