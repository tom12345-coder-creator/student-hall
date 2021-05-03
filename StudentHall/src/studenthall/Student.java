/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthall;

/**
 *
 * @author thomas
 */
public class Student {

    String HallName;
    String RoomNum;
    String StuYear;
    String Firstname;
    String Surname;
    String ContactNum;

    public Student(String HallName, String RoomNum, String StuYear, String firstname, String Surname, String ContactNum) {
        this.HallName = HallName;
        this.RoomNum = RoomNum;
        this.StuYear = StuYear;
        this.Firstname = firstname;
        this.Surname = Surname;
        this.ContactNum = ContactNum;
    }

    public String getHall() {
        return HallName;
    }

    public void setHall(String HallName) {
        this.HallName = HallName;
    }

    public String getRoom() {
        return RoomNum;
    }

    public void setRoom(String RoomNum) {
        this.RoomNum = RoomNum;
    }

    public String getYear() {
        return StuYear;
    }

    public void setYear(String StuYear) {
        this.StuYear = StuYear;
    }

    public String getFname() {
        return Firstname;
    }

    public void setFname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getContact() {
        return ContactNum;
    }

    public void setContact(String ContactNum) {
        this.ContactNum = ContactNum;
    }

}
