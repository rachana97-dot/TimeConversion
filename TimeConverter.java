package assesment;

import java.util.Scanner;

public class TimeConverter {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input time in 12-hour format
	        System.out.print("Enter time in 12-hour AM/PM format (e.g., 03:45:30 PM): ");
	        String inputTime = scanner.nextLine();

	        // Convert to military time
	        String militaryTime = convertToMilitaryTime(inputTime);

	        // Display the result
	        System.out.println("The military time is: " + militaryTime);

	        scanner.close();
	    }

	    public static String convertToMilitaryTime(String timeStr) {
	        // Extracting the components of the input time
	        String[] timeComponents = timeStr.split(":");
	        int hours = Integer.parseInt(timeComponents[0]);
	        int minutes = Integer.parseInt(timeComponents[1]);
	        int seconds = Integer.parseInt(timeComponents[2].substring(0, 2)); // Extracting seconds and ignoring AM/PM

	        // Checking if the time is in PM and not 12 PM
	        if (timeStr.contains("PM") && hours != 12) {
	            hours += 12;
	        }
	        // Checking if the time is in AM and 12 AM
	        else if (timeStr.contains("AM") && hours == 12) {
	            hours = 0;
	        }

	        // Formatting the result in 24-hour time
	        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	    }
	}


