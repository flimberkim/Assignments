package me.day14.practice.practice03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static List<Student> studentList = new ArrayList<>(); // 수정
    public static void main(String[] args) {
        studentList.add(new Student("20212222", "이순신", 85));  // 입학연도: 2021 + 들어간 순서: 1
        studentList.add(new Student("20211111", "자바킹", 100)); // 입학연도: 2021 + 들어간 순서: 2
        studentList.add(new Student("20213333", "이제이", 50));  // 입학연도: 2021 + 들어간 순서: 3
        studentList.add(new Student("20171234", "이텔리", 80));  // 입학연도: 2017 + 들어간 순서: 4
        studentList.add(new Student("20045555", "이초잉", 70));  // 입학연도: 2004 + 들어간 순서: 5
    }
    public static List<Student> upper(int score) {
        List<Student> students = new ArrayList<>();
        for(Student student : studentList){
            if(student.getScore() > score){
                students.add(student);
            }
        }
        Collections.sort(students);
        return students;
    }
    public static List<Student> lower(int score) {
        List<Student> students = new ArrayList<>();
        for(Student student : studentList){
            if(student.getScore() < score){
                students.add(student);
            }
        }
        students.sort(Collections.reverseOrder());
        return students;
    }
    public static double average() {
        double avg = 0;
        double sum = 0;
        for(Student student : studentList){
            sum += student.getScore();
        }
        avg = sum / studentList.size();
        return avg;
    }
}
