package com.example.designpartten.builderPartternStudent;

public class TestBuilderStudent {
    public static void main(String[] args) {
//Using builder to get the object in a single line of code and
//without any inconsistent state or arguments management issues
        Student student1 = new Student.StudentBuilder(
                "1", "Dat","14B","22","Male").build();
        Student student2 = new Student.StudentBuilder(
                "1", "Dat","14B","22","Male").setAdress("Auco")
                .setNationality("Viet Nam").setReligion("none").build();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
