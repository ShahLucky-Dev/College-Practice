import java.util.Scanner;

class MyString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Length: " + str.length());
        System.out.println("Reversed: " + new StringBuilder(str).reverse());
		System.out.println("Lowercase: " + str.toLowerCase());

        sc.close();
    }
}
