package collections.homeWork.task_3;

import java.util.*;

public class Student {
    private String name;
    private Integer course;

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void printStudents(List<Student> students, Integer course) {
        Iterator iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getCourse().equals(course)) {
                System.out.println(student.getName());
            }
        }
    }

    public void compareStudentsByName(List<Student> list) {

        list.sort(Comparator.comparing(Student::getName));
    }

    public void compareStudentsByCourse(List<Student> list) {
        list.sort(Comparator.comparing(Student::getCourse));
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(List.of(new Student("Vasya", 2), new Student("Piter", 3),
                new Student("Liza", 2), new Student("Anna", 5), new Student("Serg", 4)));
        list.get(0).compareStudentsByName(list);
        System.out.println(" Sorting by names: ");
        list.forEach(System.out::println);
        list.get(0).compareStudentsByCourse(list);
        System.out.println(" Sorting by courses: ");
        list.forEach(System.out::println);

    }


}
