package io.zipcoder.interfaces;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestPerson {
    @Test
    public void testSetName(){
        // Given
        String name = "Gunjan";


        // When
        Person person = new Person("test");

        person.setName(name);
        // Then
        assertEquals("Gunjan", person.getName());
    }

    @Test
    public void testConstructor(){
        // Given
        String name = "Gunjan";


        // When
        Person person = new Person("Constructor");

        //person.setName(name);
        // Then
        assertEquals("Constructor", person.getName());
    }
}
