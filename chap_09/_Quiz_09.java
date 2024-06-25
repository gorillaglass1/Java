package chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("유재석", "파이썬"));
        students.add(new Student("박명수", "자바"));
        students.add(new Student("김종국", "자바"));
        students.add(new Student("조세호", "C"));
        students.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");

//        Iterator<Student> itStudent = students.iterator();
//        itStudent = students.iterator();
//        while (itStudent.hasNext()) {
//            if (itStudent.next().certification.equals("자바")) {
//                System.out.println(itStudent.next().name);
//            }
//        }
        for (Student s : students) {
            if (s.certification.equals("자바"))
                System.out.println(s.name);
        }
    }
}

class Student {
    public String name;
    public String certification;

    Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }

}
