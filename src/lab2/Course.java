package lab2;


/**
 * This interface has the relevant signatures for methods that any course
 * should have.
 *
 * @author aholloway
 */
interface Course {

    void setCourseName(String courseName);

    void setCourseNumber(String courseNumber);

    String getCourseName();

    String getCourseNumber();

    void setCredits(double credits);

    double getCredits();
}
