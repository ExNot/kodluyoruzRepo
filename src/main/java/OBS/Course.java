package OBS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note1Percent;
    int note1;
    int note2Percent;
    int note2;
    double note;
    Course(String name, String code, String prefix,int note1Percent){

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        if (note1Percent<=100 && note1Percent>=0){
            this.note1Percent = note1Percent;
        }else System.out.println("Please enter valid note percent!");

        this.note2Percent = 100-note1Percent;

    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch))
        this.teacher = teacher;
        else System.out.println("Invalid teacher!");
    }
    void printTeacher(){
        System.out.println("Name: " + teacher.name + "\nmpno: " + teacher.mpno + "\nbranch " + teacher.branch);
    }

}
