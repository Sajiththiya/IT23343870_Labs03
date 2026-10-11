

import java.util.Scanner;

    public class EmployeeApp {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            Employee emp = new Employee();

            System.out.print("Enter Employee ID: ");
            emp.setEmployeeId(input.nextInt());
            input.nextLine();

            System.out.print("Enter Employee Name: ");
            emp.setEmployeeName(input.nextLine());

            System.out.print("Enter Basic Salary: ");
            emp.setBasicSalary(input.nextDouble());

            int rating;

            do {
                System.out.print("Enter Performance Rating (1-5): ");
                rating = input.nextInt();

                if (rating < 1 || rating > 5) {
                    System.out.println("Invalid rating! Enter 1 to 5.");
                }

            } while (rating < 1 || rating > 5);

            emp.setPerformanceRating(rating);

            emp.displayDetails();

            input.close();
        }
    }


