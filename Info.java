import java.util.Scanner;

public class Info {
	public static void main(String[] args) {
		
		String name;
		int age;
		String gender;
		String address;
		String contactNumber;
		String email;
		String hobbies;
		String qoute;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		name = inputDevice.nextLine();
		System.out.print("Please enter your age: ");
		age = inputDevice.nextInt();
		inputDevice.nextLine();
		System.out.print("Please enter your gender: ");
		gender = inputDevice.nextLine();
		System.out.print("Please enter your address: ");
		address = inputDevice.nextLine();
		System.out.print("Please enter your contactNumber: ");
		contactNumber = inputDevice.nextLine();
		System.out.print("Please enter your email: ");
		email = inputDevice.nextLine();
		System.out.print("Please enter your hobbies: ");
		hobbies = inputDevice.nextLine();
		System.out.print("Please enter your qoute: ");
		qoute = inputDevice.nextLine();
		System.out.println(" My name is "+name+". I am "+age+" years old, "+gender+" living in " +address+". In my free time, I enjoy "+hobbies+". You can reach me at "+contactNumber+ " or via email at "+email+". Inspired by the qoute "+qoute+" ");
		
		
	}
}