package io.zipcoder.interfaces;

import sun.jvm.hotspot.ui.tree.FieldTreeNodeAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassRoom {
    public ClassRoom() {
    }

    TechConnect tc =new TechConnect();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    private ArrayList<Student> students = tc.getStudents();
    ZipCodeWilmingtonClass zcw =new ZipCodeWilmingtonClass();
    private ArrayList<Instructor> instructors = zcw.getInstructors();

    public String getRoster()
    {
        HashMap<Person,Person> studentInstructor= new HashMap<Person,Person>();
       StringBuilder str= new StringBuilder();
        for (int i = 0; i < instructors.size(); i++) {
             studentInstructor.put(instructors.get(i) , students.get(i));
             //str.append(instructors.get(i)).append( students.get(i));
        }
        for (Map.Entry<Person,Person> entry : studentInstructor.entrySet()) {  // Iterate through hashmap
            str.append(entry.getKey().getName()).append(" ").append(entry.getValue().getName()).append("\n");
        }

        return str.toString();
    }

}
