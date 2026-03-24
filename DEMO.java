import java.util.*;

class DEMO{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter string:-");
	String str = sc.nextLine();
	
	System.out.println("uppecase:-" + str.toUpperCase());
	System.out.println("lowercase:-" + str.toLowerCase());
	System.out.println("charat:-" + str.charAt(3));
	
	sc.close();

}
}