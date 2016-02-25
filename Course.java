/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Derslerin isimleri ve kodlarini tutan sınıf
 * 
 * @author Adnan EROL
 */
public class Course {
    /**
     * Derslerin isimerini tutan data field
     */
    private String courseName;
    
    /**
     * Derslerin kodlarini tutan data field
     */
    private String courseCode;

    /**
     * Derslerin isimlerini return eden metot
     * @return String tipinde ders ismi return eder
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Derslerin ismini set eden metot
     * @param courseName String tipinde parametre alir ve bunu set eder
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Derslerin kodlarini return eden metot
     * @return String tipinde ders ismini return eder
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Derslerin kodlarini set eden metot
     * @param courseCode String tipinde parametre alir ve bunu set eder
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    
}
