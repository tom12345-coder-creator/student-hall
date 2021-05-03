/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthall;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author thomas
 */
public class StudentHall extends Application {

    private StudentList Students;

    // width and height of GUI stored as constants 
    private final int WIDTH = 900;
    private final int HEIGHT = 900;
    // all the  components that will be visiable to users
    private Label headingLabel = new Label("Book in to the student hall ");
    private Label hallDetailsLabel = new Label("Hall Details");
    private Label hallLabel = new Label("Hall Name");
    private TextField hallField = new TextField();
    private Label roomLabel = new Label("Room Number");
    private TextField roomField = new TextField();
    private Label yearLabel = new Label("Student Year");
    private TextField yearField = new TextField();
    private Separator sectSeparator = new Separator();
    private Separator sectSeparator2 = new Separator();
    private Separator sectSeparator3 = new Separator();
    private Separator sectSeparator4 = new Separator();
    private Label PersonLabel = new Label("Personal Details");
    private Label nameLabel = new Label("First Name");
    private TextField nameField = new TextField();
    private Label surnameLabel = new Label("Surname");
    private TextField surnameField = new TextField();
    private Label contactLabel = new Label("Phone Number");
    private TextField contactField = new TextField();
    private TextArea displayStudents = new TextArea();
    private Button addButton = new Button("Register");

    public void start(Stage stage) {
        //this is the class to contain all the students. The parameter represents the maximum number of students
        Students = new StudentList(20);
        //creates boxes for the student detals and the persons details 
        HBox studentDetails = new HBox(10);
        HBox PersonDetails = new HBox(10);
        // add all the components that are going to be needed for the HBox
        studentDetails.getChildren().addAll(hallLabel, hallField, roomLabel, roomField, yearLabel, yearField);

        PersonDetails.getChildren().addAll(nameLabel, nameField, surnameLabel, surnameField, contactLabel, contactField);

        VBox root = new VBox(10);

        root.getChildren().addAll(headingLabel, sectSeparator, hallDetailsLabel, studentDetails, sectSeparator2,
                PersonLabel, PersonDetails, sectSeparator3, displayStudents, sectSeparator4, addButton);

        Scene scene = new Scene(root, Color.web("#03fcd7"));
        // setting the fonts and sizes for heading and hall details  
        Font font = new Font("Helvetica", 40);
        headingLabel.setFont(font);
        font = new Font("Serif", 20);
        hallDetailsLabel.setFont(font);
        PersonLabel.setFont(font);
        // set alignment for the HBoxes 
        studentDetails.setAlignment(Pos.CENTER);
        PersonDetails.setAlignment(Pos.CENTER);
        addButton.setAlignment(Pos.CENTER);

        root.setAlignment(Pos.CENTER);
        root.setBackground(Background.EMPTY);

        // set min and max width size
        displayStudents.setMaxSize(400, 700);

        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        addButton.setOnAction(e -> addHandler());

        stage.setScene(scene);
        stage.setTitle("Student Reg");
        stage.show();

    }

    /*
        method to add a student    
     */
    private void addHandler() {

        String stuHall = hallField.getText();
        String stuRoom = roomField.getText();
        String stuYear = yearField.getText();
        String fName = nameField.getText();
        String surname = surnameField.getText();
        String contact = contactField.getText();
        // a way to check to see if there are any errors that occur 
        if (stuHall.length() == 0 || stuRoom.length() == 0 || stuYear.length() == 0) {
            displayStudents.setText("please enter the hall name your room number and student year");
        } else if (fName.length() == 0 || surname.length() == 0 || contact.length() == 0) {
            displayStudents.setText("please enter your name and phone number");
        } else {
            Student studentToAdd = new Student(stuHall, stuRoom, stuYear, fName, surname, contact);
            Students.addStudents(studentToAdd);
            //clear the fields
            hallField.setText("");
            roomField.setText("");
            yearField.setText("");
            nameField.setText("");
            surnameField.setText("");
            contactField.setText("");
            displayStudents.setText("");
            displayStudents.appendText(fName + "" + surname + " was successfully added");
            displayStudents.appendText(Students.displayStudents());
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}
