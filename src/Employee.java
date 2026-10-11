

    public class Employee {

        private int employeeId;
        private String employeeName;
        private double basicSalary;
        private int performanceRating;

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public void setBasicSalary(double basicSalary) {
            if (basicSalary >= 0) {
                this.basicSalary = basicSalary;
            }
        }

        public void setPerformanceRating(int performanceRating) {
            if (performanceRating >= 1 && performanceRating <= 5) {
                this.performanceRating = performanceRating;
            } else {
                System.out.println("Invalid Performance Rating!");
            }
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public double getBasicSalary() {
            return basicSalary;
        }

        public int getPerformanceRating() {
            return performanceRating;
        }

        public double calculateBonus() {

            if (performanceRating == 5) {
                return basicSalary * 0.20;
            } else if (performanceRating == 4) {
                return basicSalary * 0.15;
            } else if (performanceRating == 3) {
                return basicSalary * 0.10;
            } else if (performanceRating == 2) {
                return basicSalary * 0.05;
            } else {
                return 0;
            }
        }

        public double calculateTotalSalary() {
            return basicSalary + calculateBonus();
        }

        public void displayDetails() {
            System.out.println("\nEmployee Details:");
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Performance Rating: " + performanceRating);
            System.out.println("Bonus: " + calculateBonus());
            System.out.println("Total Salary: " + calculateTotalSalary());
        }
    }


