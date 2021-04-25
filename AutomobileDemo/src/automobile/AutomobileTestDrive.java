package automobile;

import java.util.Scanner;

public class AutomobileTestDrive {

	private boolean tryAgain = false;

	public String getClassName(String cls) {
		int dotLstIndx = cls.lastIndexOf(".");
		return cls.substring(dotLstIndx + 1);
	}

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		AutomobileTestDrive atd = new AutomobileTestDrive();
		Automobile am;

		do {
			am = null;
			System.out.print("Enter automobile for test drive (TataSafari - TS / YamahaFZ - FZ) : ");
			String input = sc.nextLine();

			if (input.equalsIgnoreCase("TS")) {
				am = new TataSafari();
			} else if (input.equalsIgnoreCase("FZ")) {
				am = new YamahaFZ();
			} else
				System.out.println("Input " + input + " is invalid!");

			if (am != null) {
				System.out.println();
				System.out.println("Automobile Type: " + am.getType());
				System.out.println("Automobile Class: " + atd.getClassName(am.getClass().toString()));
				am.start();
				Thread.sleep(5000);
				am.isRunning();
				am.stop();
				Thread.sleep(5000);
				am.isRunning();
				System.out.println();
			}

			System.out.print("Want to try again Y/N ? ");
			input = sc.nextLine();
			if (input.equalsIgnoreCase("Y"))
				atd.tryAgain = true;
			else
				atd.tryAgain = false;

		} while (atd.tryAgain == true);
		sc.close();
		System.out.println("Bye! Have a great day...");
	}

}
