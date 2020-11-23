package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
    private HashMap<String, Person> roster;

    public ClassRoom(){
        roster = new HashMap<String, Person>();
    }
    public HashMap<String,Person> getRoster(){
        ArrayList<Instructor> instructors = ZipCodeWilmingtonClass.getInstructors();
        for (int i = 0; i < instructors.size(); i++) {
            Instructor x = instructors.get(i);
            roster.put(x.getName(), x);
        }
        ArrayList<Student> students = TechConnect.getStudents();
        for (int i = 0; i < students.size(); i++) {
            Student y = students.get(i);
            roster.put(y.getName(), y);
        }
        return roster;
    }

}