package SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Joseph", 2000, 43, 2014);
        Employee e2 = new Employee("Mathilda", 2300 , 35, 2018);
        Employee e3 = new Employee("Robin", 1500, 50, 1990);

        e1.raiseSalary();
        int e1Bonus = e1.bonus();
        int e1Tax = e1.tax();
        System.out.println(e1.name + "'s" + " Bonus: " + e1Bonus + " Tax is: " + e1Tax);
        e1.salary = e1.salary + e1Bonus - e1Tax;
        e1.printInfo();

        e2.raiseSalary();
        int e2Bonus = e2.bonus();
        int e2Tax = e2.tax();
        System.out.println(e2.name + "'s" + " Bonus: " + e2Bonus + " Tax is: " + e2Tax);
        e2.salary = e2.salary + e2Bonus - e2Tax;
        e2.printInfo();

        e3.raiseSalary();
        int e3Bonus = e3.bonus();
        int e3Tax = e3.tax();
        System.out.println(e3.name + "'s" + " Bonus: " + e3Bonus + " Tax is: " + e3Tax);
        e1.salary = e3.salary + e1Bonus - e3Tax;
        e3.printInfo();
    }
}
