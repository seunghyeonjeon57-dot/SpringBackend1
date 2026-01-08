package org.example.Head03_OOP.example25;

import java.util.*;

public class StudentManager {
    private List<Student> students;
    private List<String> studentNames;
    private Map<String,Integer> scoreMap;

    public StudentManager(){
        students = new ArrayList<>();
        studentNames = new ArrayList<>();
        scoreMap = new HashMap<>();
    }

    public void addStudent(Student student,int score){


        students.add(student);
        studentNames.add(student.getName());
        scoreMap.put(student.getName(),score);
        System.out.println("새로운 학생이 등록되었습니다:\n" + student);
    }

    public void removeStudent(String name){
        Student target = null;
        for(Student s : students){
            if(s.getName().equals(name)){
                target = s;
                break;
            }
        }
        if(target != null){
            students.remove(target);
            studentNames.remove(name);
            scoreMap.remove(name);
            System.out.println("학생이 삭제되었습니다" + name);
        }else{
            System.out.println("해당 이름의 학생을 찾을 수 없다");
        }
    }

    public void printAllStudent(){
        for(Student s : students){
            System.out.println(s);
        }
    }
    public void printScore(String name){
        Integer score = scoreMap.get(name);
        if(score != null){
            System.out.println(name + "의 점수: " + score);
        }else{
            System.out.println("점수를 찾을수없다.");
        }
    }
}
