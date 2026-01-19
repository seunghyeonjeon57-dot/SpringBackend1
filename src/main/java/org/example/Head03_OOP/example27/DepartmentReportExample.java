package org.example.Head03_OOP.example27;


import java.util.*;
import java.util.stream.Collectors;

class Employee1{
    private String name;
    private String dept;
    private int Salary;

    public Employee1(String name, String dept,int Salary){
        this.name = name;
        this.dept = dept;
        this.Salary = Salary;

    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return Salary;
    }
    public String toString(){
        return name+"(" + dept + "," + Salary + ")";
    }
}

public class DepartmentReportExample {
    public static void main(String[] args) {
        List<Employee1> emps = Arrays.asList(
                new Employee1("Alice","HR",3000),
                new Employee1("Bob","IT",4000),
                new Employee1("Charlie","IT",4500),
                new Employee1("David","HR",3200),
                new Employee1("Eve","Sales",3500)
        );
        Map<String, IntSummaryStatistics> deptStats=
                emps.stream().collect(Collectors.groupingBy(
                        Employee1::getDept,
                        Collectors.summarizingInt(Employee1::getSalary)
                ));
                        deptStats.forEach((dept,stats)->{
                            System.out.println("==" + dept + "부서 ==");
                            System.out.println("사원 수: " + stats.getCount());
                            System.out.println("총 연봉: " + stats.getSum());
                            System.out.println("평균 연봉: " + stats.getAverage());
                            System.out.println("최대 연봉: " + stats.getMax());
                            System.out.println("최소 연봉: " + stats.getMin());

                        });


    }
}
