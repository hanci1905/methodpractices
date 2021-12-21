package Salary;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    Employee( String name,int salary, int workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(int salary, int hireYear){
        return (this.salary < 1000) ? 0 : (this.salary * 0.03);
    }

    int bonus() {
        if (this.workHours > 40) {
            return 30 * (this.workHours - 40);
        } else return 0;
    }
    double raiseSalary() {
        if ((2021 - this.hireYear) < 10) {
            return this.salary * 0.05;
        } else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
            return this.salary * 0.1;
        } else if ((2021 - this.hireYear) > 19) return this.salary * 0.15;

        return 0;
    }
    public String toString() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Weekly Working Hours: " + this.workHours);
        System.out.println("Year of Start: " + this.hireYear);
        System.out.println("Tax: " + tax(this.salary, this.hireYear));
        System.out.println("Bonus: " + bonus());
        System.out.println("Rise in Salary: " + raiseSalary());
        double total = (this.salary - tax(this.salary, this.hireYear)) + bonus();
        System.out.println("The salary of with tax and bonus: " + total);
        double total1 = total + raiseSalary();
        System.out.println("Total salary: " + total1);

        return null;
    }

    }

