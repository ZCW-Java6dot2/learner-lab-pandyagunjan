package io.zipcoder.interfaces;

import static org.junit.Assert.*;
import org.junit.Test;
public class TestInstructor {
    @Test
    public void testImplementation(){
        // Given
        Instructor instructor = new Instructor("Ram");;

        // When
        Boolean instanceFlag=  instructor instanceof Teacher;
        // Then
        assertEquals(true,instanceFlag) ;
    }
    @Test
    public void testInheritance(){
        // Given
        Instructor instructor = new Instructor("Ram");;

        // When
        Boolean inheritanceFlag= instructor instanceof Person;
        // Then
        assertEquals(true,inheritanceFlag) ;
    }
    @Test
    public void testTeach(){
        // Given
        Instructor instructor = new Instructor("Ram");;
        Student student = new Student("Gunjan");;
        // When
        instructor.teach(student,50);
        // Then
        assertEquals(50,student.totalStudyTime,0) ;

    }

    @Test
    public void testLecture(){
        // Given
        Instructor instructor = new Instructor("Ram");;
        Student student1 = new Student("Gunjan");
        Student student2 = new Student("Radha");;
        Student[] students = new Student[2];
        students[0]=student1;
        students[1]=student2;
        // When
        instructor.lecture(students,100);
        // Then
        assertEquals(50,student1.getTotalStudyTime(),0) ;
        assertEquals(50,student2.getTotalStudyTime(),0) ;

    }



}
