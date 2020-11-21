package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTechConnect {
    TechConnect tc = new TechConnect();

    @Before
    public void setup() {
        // TestTechConnect tc= new TestTechConnect();
        tc.removeStudents();

    }

    @Test
    public void testRemoveStudents() {
        // Given
        Boolean expected = true;
        //When
        Boolean actual = tc.getStudents().isEmpty();
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testRecruitStudents() {
        // Given
        Boolean expected = true;
        Student student1 = new Student("gunjan");
        Student student2 = new Student("daksh");


        //When
        tc.recruitStudent(student1);
        tc.recruitStudent(student2);
        // Then
        assertEquals(2,tc.getStudents().size(),0);
    }
}