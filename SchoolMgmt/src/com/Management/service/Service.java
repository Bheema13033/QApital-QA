package com.Management.service;
import Management.model.Student1;
import Management.model.Teacher1;
import com.Management.model.Student1;
import com.Management.model.Teacher1;


import java.util.List;

    public interface Service {
        void displayTeachers(List<com.Management.model.Teacher1> teachers);

        void displayStudents(List<com.Management.model.Student1> students);

        void modifyTeacher(List<com.Management.model.Teacher1> teachers, int index, String newName, String newSubject, double newSalary);

        void modifyStudent(List<com.Management.model.Student1> students, int index, int newId, int newMar);

        void modifyStudent(List<com.Management.model.Student1> students, int index, int newId, int newMarks, int newAge);
    }


