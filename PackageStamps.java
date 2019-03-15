import java.util.Scanner;
public class PackageStamps {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a weight in ounces for letters to be mailed out.");
	System.out.println("When you are done entering, please enter -1 to finish: ");
	double weight = input.nextDouble();
	
	while(weight != -1) {
		if (weight <= 1) {
			System.out.println("You can use forever stamp.");
		}
		else {
			System.out.println("You need additional postage than a forever stamp.");
		}
		System.out.println("Enter a weight in ounces for letters to be mailed out.");
		System.out.println("When you are done entering, please enter -1 to finish: ");
		weight = input.nextDouble();
	}
	System.out.println("Goodbye!!");
	}

}
