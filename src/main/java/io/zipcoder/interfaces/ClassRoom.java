package io.zipcoder.interfaces;

import sun.jvm.hotspot.ui.tree.FieldTreeNodeAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
    public ClassRoom() {
    }

    TechConnect tc =new TechConnect();
    private ArrayList<Student> students = tc.getStudents();
    ZipCodeWilmingtonClass zcw =new ZipCodeWilmingtonClass();
    private ArrayList<Instructor> instructors = zcw.getInstructors();

    public HashMap<Person, Person> getRoster()
    {
        HashMap<Person,Person> studentInstructor= new HashMap<Person,Person>();

        for (int i = 0; i < instructors.size(); i++) {
             studentInstructor.put(instructors.get(i) , students.get(i));

        }
        return studentInstructor;
    }

}
