package lab2;

/**
 * This class has the responsibilities of getting and setting the name of the
 * course and the course number. 
 *
 * Additionally, this class has the responsibility of getting and setting the
 * number of credits (validating that the number is within the proper range)
 *
 * @author Drew
 * @version 1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse {

    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4;
    private double credits;
    private String courseName;
    private String courseNumber;
    private static final String courseNameNullException =
            "Error: course name cannot be null of empty string";
    private static final String courseNumberNullException =
            "Error: course number cannot be null of empty string";
    private static final String creditsNullException =
            "Error: credits must be in the range "
            + MIN_CREDITS + " to " + MAX_CREDITS;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {

        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

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
    

    public final void setCredits(double credits) {
        if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IllegalArgumentException(creditsNullException);
        }

        this.credits = credits;
    }

    public final double getCredits() {
        return this.credits;
    }
}
