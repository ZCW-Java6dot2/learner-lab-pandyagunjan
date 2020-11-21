package io.zipcoder.interfaces;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class TestZipCodeWilmington {

    @Before
    public void setup() {
        ZipCodeWilmingtonClass.fireStaff();
    }

    @Test
    public void testFireStaff(){
        Boolean expected = true;
        Boolean actual=  ZipCodeWilmingtonClass.getInstructors().isEmpty();
        // Then
        assertEquals(expected,actual) ;
    }
    @Test
    public void testHireStaff(){
        Instructor instructor1 = new Instructor("Ram");;
        Instructor instructor2 = new Instructor("Daksh");;
        ZipCodeWilmingtonClass.hire(instructor1);
        ZipCodeWilmingtonClass.hire(instructor2);
        // Then
        assertEquals("Ram",ZipCodeWilmingtonClass.getInstructors().get(0).getName()) ;
        assertEquals("Daksh",ZipCodeWilmingtonClass.getInstructors().get(1).getName()) ;
    }

}
