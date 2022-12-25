package OBS;

public class Main {
    public static void main(String[] args) {
        Teacher joseph = new Teacher("Joseph" , "554468" , "Phy");
        Teacher carole = new Teacher("Carole" , "44586" , "BIO");
        Teacher el = new Teacher("El" , "33333" , "MTH");

        Course c1 = new Course("Physics" , "-101" , "Phy", 20);
        Course c2 = new Course("Biology" , "-101" , "BIO", 50);
        Course c3 = new Course("Math" , "-101" , "MTH", 30);

        c1.addTeacher(joseph);
        c2.addTeacher(carole);
        c3.addTeacher(el);



        Student mike = new Student("Mike" , "558965", "2", c1, c2, c3);
        mike.addBulkExamNote(50, 63, 66, 78, 55, 49);
        mike.isPass();

        Student max = new Student("Max" , "546596" , "2",c1 , c2, c3);
        max.addBulkExamNote(44,33,50,56,96,63);
        max.isPass();

        Student will = new Student("Will" , "84865", "2", c1 ,c2 ,c3);
        will.addBulkExamNote(66,33,920,0,4,53);
        will.printNote();
        will.isPass();
        c2.printTeacher();
    }
}
