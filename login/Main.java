package JavaAssesment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        CourseMgmt cms = new CourseMgmt();

        System.out.print("Enter number of courses: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter course ID: ");
                int courseId = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("Enter course name: ");
                String courseName = scanner.nextLine();

                System.out.print("Enter instructor name: ");
                String instructor = scanner.nextLine();

                System.out.print("Enter duration in weeks: ");
                int durationWeeks = scanner.nextInt();

                System.out.print("Enter fee: ");
                double fee = scanner.nextDouble();
                scanner.nextLine();  // Consume newline

                System.out.print("Enter course type (Technical/Non-Technical): ");
                String type = scanner.nextLine();

                Course course;
                if (type.equalsIgnoreCase("Technical")) {
                    course = new TechnicalCourse(courseId, courseName, instructor, durationWeeks, fee);
                } else if (type.equalsIgnoreCase("Non-Technical")) {
                    course = new NonTechnicalCourse(courseId, courseName, instructor, durationWeeks, fee);
                } else {
                    throw new IllegalArgumentException("Invalid course type");
                }

                cms.addCourse(course);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

   
	}

}
