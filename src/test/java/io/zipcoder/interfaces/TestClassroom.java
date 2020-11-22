package io.zipcoder.interfaces;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestClassroom {

    @Test
    public void testgetRoster(){
        // Given
         ClassRoom classR= new ClassRoom();
        HashMap<Person,Person> studentInstructor= new HashMap<Person,Person>();
        StringBuilder expected= new StringBuilder();
        for (int i = 0; i < classR.getInstructors().size(); i++) {
            studentInstructor.put(classR.getInstructors().get(i) , classR.getStudents().get(i));
            //str.append(instructors.get(i)).append( students.get(i));
        }
        for (Map.Entry<Person,Person> entry : studentInstructor.entrySet()) {  // Iterate through hashmap
            expected.append(entry.getKey().getName()).append(" ").append(entry.getValue().getName()).append("\n");
        }

        // When
        String actual = classR.getRoster();
       // System.out.println(actual);
        // Then
        assertEquals(expected.toString(),actual) ;
    }

}
