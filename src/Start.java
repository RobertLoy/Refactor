import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		double benchLength = 0.0;
		String chairMaterial = "Oak";

		System.out.println("1. Make a bench");
		System.out.println("2. Make a chair");
		System.out.println("3. Exit");
		System.out.println("Pick an option (use the #)");
		try {
			opt = sc.nextInt();
			sc.nextLine();
		}catch (Exception e) {
			System.out.println("You have an error");
			main(args);
		}
		switch (opt){
		case 1: 
			System.out.println("Making a Bench");
			break;
		case 2: 
			System.out.println("Making a Chair");
			break;
		case 3: 
		default:
			System.out.println("Exiting. Thank you!");
			System.exit(0);
		}

		if (opt == 1) {
			System.out.println("How long should the bench be?");
			try {
				benchLength = sc.nextDouble();
				sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + benchLength + "\" bench is ready");
		}
		if (opt == 2) {
			System.out.println("What material should we use for your chair?");
			try {
				chairMaterial = sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + chairMaterial + " chair is ready");
		}

		System.out.println("1. Make a bench");
		System.out.println("2. Make a chair");
		System.out.println("3. Exit");
		System.out.println("Pick an option (use the #)");
		try {
			opt = sc.nextInt();
			sc.nextLine();
		}catch (Exception e) {
			System.out.println("You have an error");
			main(args);
		}
		switch (opt){
		case 1: 
			System.out.println("Making a Bench");
			break;
		case 2: 
			System.out.println("Making a Chair");
			break;
		case 3: 
		default:
			System.out.println("Exiting. Thank you!");
			System.exit(0);
		}

		if (opt == 1) {
			System.out.println("How long should the bench be?");
			try {
				benchLength = sc.nextDouble();
				sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + benchLength + "\" bench is ready");
		}
		if (opt == 2) {
			System.out.println("What material should we use for your chair?");
			try {
				chairMaterial = sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + chairMaterial + " chair is ready");
		}
		System.out.println("1. Make a bench");
		System.out.println("2. Make a chair");
		System.out.println("3. Exit");
		System.out.println("Pick an option (use the #)");
		try {
			opt = sc.nextInt();
			sc.nextLine();
		}catch (Exception e) {
			System.out.println("You have an error");
			main(args);
		}
		switch (opt){
		case 1: 
			System.out.println("Making a Bench");
			break;
		case 2: 
			System.out.println("Making a Chair");
			break;
		case 3: 
		default:
			System.out.println("Exiting. Thank you!");
			System.exit(0);
		}

		if (opt == 1) {
			System.out.println("How long should the bench be?");
			try {
				benchLength = sc.nextDouble();
				sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + benchLength + "\" bench is ready");
		}
		if (opt == 2) {
			System.out.println("What material should we use for your chair?");
			try {
				chairMaterial = sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + chairMaterial + " chair is ready");
		}

		System.out.println("1. Make a bench");
		System.out.println("2. Make a chair");
		System.out.println("3. Exit");
		System.out.println("Pick an option (use the #)");
		try {
			opt = sc.nextInt();
			sc.nextLine();
		}catch (Exception e) {
			System.out.println("You have an error");
			main(args);
		}
		switch (opt){
		case 1: 
			System.out.println("Making a Bench");
			break;
		case 2: 
			System.out.println("Making a Chair");
			break;
		case 3: 
		default:
			System.out.println("Exiting. Thank you!");
			System.exit(0);
		}

		if (opt == 1) {
			System.out.println("How long should the bench be?");
			try {
				benchLength = sc.nextDouble();
				sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + benchLength + "\" bench is ready");
		}
		if (opt == 2) {
			System.out.println("What material should we use for your chair?");
			try {
				chairMaterial = sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + chairMaterial + " chair is ready");
		}
		System.out.println("1. Make a bench");
		System.out.println("2. Make a chair");
		System.out.println("3. Exit");
		System.out.println("Pick an option (use the #)");
		try {
			opt = sc.nextInt();
			sc.nextLine();
		}catch (Exception e) {
			System.out.println("You have an error");
			main(args);
		}
		switch (opt){
		case 1: 
			System.out.println("Making a Bench");
			break;
		case 2: 
			System.out.println("Making a Chair");
			break;
		case 3: 
		default:
			System.out.println("Exiting. Thank you!");
			System.exit(0);
		}

		if (opt == 1) {
			System.out.println("How long should the bench be?");
			try {
				benchLength = sc.nextDouble();
				sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + benchLength + "\" bench is ready");
		}
		if (opt == 2) {
			System.out.println("What material should we use for your chair?");
			try {
				chairMaterial = sc.nextLine();
			}catch (Exception e) {
				System.out.println("You have an error");
				main(args);
			}
			System.out.println("Your " + chairMaterial + " chair is ready");
		}
	}
}
