package com.Management.controller;

import Management.model.Student1;
import Management.model.Teacher1;
import Management.service.ServiceImplements;

import java.util.ArrayList;
import java.util.List;

    public class Controller {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            List<Teacher1> teachers = new ArrayList<>();
            List<Student1> students = new ArrayList<>();

            // Add initial data for teachers
            teachers.add(new Teacher1("Mr. Smith", "Mathematics", 50000) {

            });
            teachers.add(new Teacher1("Ms. Johnson", "Science", 55000) {

            });

            // Add initial data for students
            students.add(new Student1(1, 85, 20) {

            });
            students.add(new Student1(2, 90, 22) {

            });

            // Create Service implementation
            ServiceImplements service = new ServiceImplements();

            // Display teachers and students
            service.displayTeachers(teachers);
            service.displayStudents(students);

            // Modify teacher details
            System.out.println("\nModifying teacher at index 0:");
            service.modifyTeacher(teachers, 0, "Dr. Smith", "Physics", 60000);
            service.displayTeachers(teachers);

            // Modify student details
            System.out.println("\nModifying student at index 1:");
            service.modifyStudent(students, 1, 3, 95, 23);
            service.displayStudents(students);


        }

    }

