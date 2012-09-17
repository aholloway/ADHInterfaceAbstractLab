package lab2;


/**
 * more specific interface for Programming courses
 *
 * @author aholloway
 */
interface ProgrammingCourse {

    void setCourseName(String courseName);

    void setCourseNumber(String courseNumber);

    String getCourseName();

    String getCourseNumber();

    void setCredits(double credits);

    double getCredits();
}
