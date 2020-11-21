package io.zipcoder.interfaces;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        // Given
        Student student = new Student("Gunjan");;

        // When
        Boolean instanceFlag=  student instanceof Learner;
        // Then
        assertEquals(true,instanceFlag) ;
    }
    @Test
    public void testInheritance(){
        // Given
        Student student = new Student("Gunjan");;

        // When
        Boolean inheritanceFlag=  student instanceof Person;
        // Then
        assertEquals(true,inheritanceFlag) ;
    }
    @Test
    public void testLearn(){
        // Given
        Student student = new Student("Gunjan");;

        // When
        student.learn(50);;
        // Then
        assertEquals(50,student.totalStudyTime,0) ;

    }
    @Test
    public void testLearnGetTime(){
        // Given
        Student student = new Student("Gunjan");;

        // When
        student.learn(50);;
        // Then
        assertEquals(50,student.getTotalStudyTime(),0) ;

    }
}
