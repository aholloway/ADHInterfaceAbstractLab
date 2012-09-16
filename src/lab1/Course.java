package lab1;

/**
 * This abstract class contains COMMON features to all the subclasses
 *
 * @author aholloway
 */
public abstract class Course {

    private String courseName;
    private String courseNumber;
    private static final String courseNameNullException =
            "Error: course name cannot be null of empty string";
    private static final String courseNumberNullException =
            "Error: course number cannot be null of empty string";

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException(courseNameNullException);
        };
        this.courseName = courseName;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException(courseNumberNullException);
        };
        this.courseNumber = courseNumber;
    }

    public final String getCourseName() {
        return this.courseName;
    }

    public final String getCourseNumber() {
        return this.courseNumber;
    }

    // methods that differ, because the acceptable range of credits may differ 
    //have been declared abstract
    public abstract void setCredits(double credits);

    public abstract double getCredits();
}
