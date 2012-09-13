package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
//prereqs will default to none.  for this class.
public class IntroToProgrammingCourse extends Course {

    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4;
    private String courseName;
    private String courseNumber;
    private double credits;
    private static final String courseNumberNullException =
            "Error: course number cannot be null of empty string";
    private static final String creditsNullException =
            "Error: credits must be in the range "
            + MIN_CREDITS + " to " + MAX_CREDITS;
    private static final String courseNameNullException =
            "Error: course name cannot be null of empty string";

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    //getters are inherited from the superclass.  No more magic numbers in
    //code below.  Also exceptions are thrown rather than outputting messages
    //when entries are not valid
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException(courseNumberNullException);
        };
        this.courseNumber = courseNumber;
    }

    public final void setCredits(double credits) {
        if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IllegalArgumentException(creditsNullException);
        }
        this.setCredits(credits);
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException(courseNameNullException);
        };
        this.courseName = courseName;
    }
}
