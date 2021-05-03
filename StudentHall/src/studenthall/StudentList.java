/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthall;

import java.util.ArrayList;


/**
 *
 * @author thomas
 */
public class StudentList {

    private ArrayList<Student> StudentReg;
    public final int MAX;

    /**
     * Constructor initialises the empty student list and sets the maximum list
     * size
     *
     * @param maxIn The maximum number of students that are in the list
     */
    public StudentList(int maxIn) {
        StudentReg = new ArrayList<>();
        MAX = maxIn;
    }

    /**
     * Adds a new student to the list
     *
     * @param theStudent the student that is added
     * @return Returns true if the student was added successfully and false
     * otherwise
     */
    public boolean addStudents(Student theStudent) {
        if (!isFull()) {
            StudentReg.add(theStudent);
            return true;
        } else {
            return false;
        }
    }
    
    

        /**
         * Reports on whether the list is full or empty
         *
         * @return Returns true if the list is empty and false otherwise
         */
    public boolean isEmpty() {
        return StudentReg.isEmpty();
    }

    /**
     * Reports on whether or not the list is full
     *
     * @return Returns true if the list is full and false otherwise
     */
    public boolean isFull() {
        return StudentReg.size() == MAX;
    }

    /**
     * Gets the total number of students
     *
     * @return Returns the total number of students currently in the list
     */
    public int getTotal() {
        return StudentReg.size();
    }

    /**
     * Reads were students position is in the list
     *
     * @param positionIn The position of the student in the list
     * @return Returns the student at the position in the list or null if no
     * student at that logical position
     */
    public Student getStudent(int positionIn) {
        if (positionIn < 0 || positionIn >= getTotal()) {
            return null;
        } else {

            return StudentReg.get(positionIn);
        }
    }

    /**
     * Outputs all the students in the list
     *
     * @return Returns all the students in the list in an easy to read format
     */
    public String displayStudents() {
        String output = "\n";
        for (int counter = 0; counter < StudentReg.size(); counter++) {
            output += StudentReg.get(counter).Firstname + "\t" + StudentReg.get(counter).Surname + "\t" + StudentReg.get(counter).ContactNum;
            output += "\n" + StudentReg.get(counter).HallName + "\t" + StudentReg.get(counter).RoomNum + "\t" + StudentReg.get(counter).StuYear;
            output += "\n\n";
        }
        return output;
    }
}
