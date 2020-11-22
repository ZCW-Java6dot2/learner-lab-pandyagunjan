package io.zipcoder.interfaces;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClassroom {

    @Test
    public void testgetRoster(){
        // Given
        Instructor instructor1 = new Instructor("Ram");
        Instructor instructor2 = new Instructor("Ram");;
        Student student1 = new Student("Gunjan");
        Student student2 = new Student("Radha");;
        Student[] students = new Student[2];
        students[0]=student1;
        students[1]=student2;
        ClassRoom classR= new ClassRoom();
        // When
        System.out.println(classR.getRoster());

        // Then
        //assertEquals(true,instanceFlag) ;
    }

}
