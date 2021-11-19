package com.example.designpartten.builderPartternStudent;

public class Student {
    //required parameters
    private String id;
    private String name;
    private String classname;
    private String age;
    private String gender;

    //optional parameters
    private String adress;
    private String fatherName;
    private String motherName;
    private String nationality;
    private String religion;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassname() {
        return classname;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAdress() {
        return adress;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getReligion() {
        return religion;
    }

    public Student(Student.StudentBuilder builder) {
        this.id = builder.id;
        this.name = name;
        this.classname = classname;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.nationality = nationality;
        this.religion = religion;
    }


    //Builder Class
    public static class StudentBuilder{
        //required parameters
        private String id;
        private String name;
        private String classname;
        private String age;
        private String gender;

        //optional parameters
        private String adress;
        private String fatherName;
        private String motherName;
        private String nationality;
        private String religion;

        public StudentBuilder(String id, String name, String classname, String age, String gender) {
            this.id = id;
            this.name = name;
            this.classname = classname;
            this.age = age;
            this.gender = gender;
        }

        public Student.StudentBuilder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public Student.StudentBuilder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public Student.StudentBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public Student.StudentBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Student.StudentBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
