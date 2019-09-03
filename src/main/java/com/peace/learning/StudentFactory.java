package com.peace.learning;

public class StudentFactory {
    private static int id = 0;

    public static Student createStudent(int age, String name, SUBJECTS subject) {
        Subject s = new Subject();
        switch (subject) {
            case NATURE: s.setDescription("Nature");s.setId(0);s.setName("Nature");break;
            case ENGLISH:   s.setDescription("English");s.setId(0);s.setName("English");break;
            case GEOGRAPHY: s.setDescription("Geography");s.setId(0);s.setName("Geography");break;
            case MATH:      s.setDescription("Math");s.setId(0);s.setName("Math");break;
        }
        Student student = new Student(age, name, s, id++);
        return student;
    };

enum SUBJECTS { NATURE, MATH, ENGLISH, GEOGRAPHY }
}
