
package lab1;

/**
 *
 * @author aholloway
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public final String getCourseName() {
        return courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setCourseName(String courseName);

    public abstract void setCourseNumber(String courseNumber);

    public abstract void setCredits(double credits);

    public abstract void setPrerequisites(String prerequisites);
    
    
   
    
}
