package SalaryCalculator;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax(){
        if (this.salary<1000){
        return 0;
        }
        else {
            return (int) (this.salary*0.03); //%3 tax!
        }
    }
    int bonus(){
        if (workHours>40){
            int additanioal = workHours -40;
            return additanioal*30;
        }
        else return 0;
    }
    void raiseSalary(){
        int workYear = 2021-hireYear;
        if (workYear<10){
            this.salary = (int) (this.salary+ this.salary*0.05);
        } else if (workYear>=10 && workYear<20) {
            this.salary = (int) (this.salary+ this.salary*0.1);
        } else if (workYear>=20) {
            this.salary = (int) (this.salary+ this.salary*0.15);
        }
        else System.out.println("Please enter valid year!!");
    }
    void printInfo(){
        System.out.println(this.name+ "\n" + "New Salary: " + this.salary + "\n" + "Work Hours: " + this.workHours +"\n" + "Hire Year: " + this.hireYear);
        System.out.println("----------------------------------");
    }

}
