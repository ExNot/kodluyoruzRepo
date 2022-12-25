package OBS;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avg;
    boolean isPass= false;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    void addBulkExamNote(int c11, int c12, int c21,int c22, int c31, int c32){
        if (c11 <= 100 && c11>=0 && c12 <=100 && c12>=0){
            this.c1.note = c11* c1.note1Percent/100 + c12* c1.note2Percent/100;
        }
        else System.out.println("Invalid note!");

        if (c21<=100 && c21>= 0 && c22 <=100 && c22>=0)
        this.c2.note = c21* c2.note1Percent/100 + c22*c2.note2Percent/100;
        else System.out.println("Invalid note!");

        if (c31<=100 && c31>=0 && c32<=100 && c32>=0)
        this.c3.note = c31* c3.note1Percent/100 + c32*c3.note2Percent/100;
        else System.out.println("Invalid note!");

    }
    void calcAvg(){
        this.avg = (this.c1.note + this.c2.note + this.c3.note)/3.0;
        if (avg>55) isPass = true;
        else isPass = false;
    }
    void printNote(){
        System.out.println("Course 1 note is: " + c1.note + "Course 2 note is: " + c2.note);
    }
    void isPass(){
        calcAvg();
        System.out.println(this.name + "'s avg is: " + this.avg);
        if (isPass) System.out.println(this.name + " passed!");
        else System.out.println(this.name + " failed");
    }

}
