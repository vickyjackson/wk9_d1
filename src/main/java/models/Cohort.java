package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Cohort {

    private ArrayList<Student> students;
    private String name;
    Student student1 = new Student("Vicky");
    Student student2 = new Student("Stoo");
    Student student3 = new Student("Pat");
    Student student4 = new Student("Kirstin");
    Student student5 = new Student("Emil");
    Student student6 = new Student("Molly");
    Student student7 = new Student("Digory");
    Student student8 = new Student("Robbie");
    Student student9 = new Student("Ricardo");
    Student student10 = new Student("Mark");
    Student student11 = new Student("Mike");
    Student student12 = new Student("Tahnee");
    Student student13 = new Student("Euan");
    Student student14 = new Student("Joanna");
    Student student15 = new Student("Raphael");
    Student student16 = new Student("Marcin");
    Student student17 = new Student("Garry");
    Student student18 = new Student("Gemma");
    Student student19 = new Student("Bea");
    Student student20 = new Student("Spongebob");

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        populateStudents();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void populateStudents(){
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);
    }

    public void shuffleStudents(){
        Collections.shuffle(this.students);
    }

    public Student randomStudent(){
        shuffleStudents();
        return students.get(0);
    }

    public StudentPair randomPair(){
        shuffleStudents();
        StudentPair pairOfStudents = new StudentPair();
            for (Student student : this.students) {
                if (pairOfStudents.getStudent1() == null) {
                    pairOfStudents.addFirstStudent(student);
                }
                else if (pairOfStudents.getStudent2() == null){
                    pairOfStudents.addSecondStudent(student);
                }
            }
        return pairOfStudents;
    }

    public ArrayList<StudentPair> getAllPairs(){
        shuffleStudents();
        ArrayList<StudentPair> allPairs = new ArrayList<>();
        int i;
        for (i = 0; i < (students.size() / 2); i++){
            StudentPair studentPair = new StudentPair();
            studentPair.addFirstStudent(students.get(i * 2));
            studentPair.addSecondStudent(students.get((i * 2) + 1));
            allPairs.add(studentPair);
        }
        return allPairs;
    }
}
