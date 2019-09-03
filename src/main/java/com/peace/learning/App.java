package com.peace.learning;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Sample with gson code example
 */
public class App {
    public static void main(String[] args) throws IOException {

        Student josef = StudentFactory.createStudent(30, "Josef", StudentFactory.SUBJECTS.NATURE);
        Student michael = StudentFactory.createStudent(22, "Michael", StudentFactory.SUBJECTS.GEOGRAPHY);
        Student patricie = StudentFactory.createStudent(37, "Josef", StudentFactory.SUBJECTS.ENGLISH);

        // first way
        Gson gson = new Gson();
        String json = gson.toJson(josef);
        System.out.println(json);

        // second way
        String filePath = "student.json";
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(michael, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // third way
        filePath = "students2.json";
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(Arrays.asList(michael, josef, patricie), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Student student = gson.fromJson(json, Student.class);
        System.out.println("Converted entity from json");
        System.out.println(student);
    }
}
