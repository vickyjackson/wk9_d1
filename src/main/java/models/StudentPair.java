package models;

public class StudentPair {

    Student student1;
    Student student2;

    public StudentPair(){

    }

    public Student getStudent1() {
        return student1;
    }


    public Student getStudent2() {
        return student2;
    }

    public void addFirstStudent(Student student){
        this.student1 = student;
    }

    public void addSecondStudent(Student student){
        this.student2 = student;
    }
}
