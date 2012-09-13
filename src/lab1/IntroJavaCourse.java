package lab1;

/**
 * Describe responsibilities here.
 *
 * @Drew
 * @version 2.00
 */
public class IntroJavaCourse extends Course {

    private static final double MIN_CREDITS = 0;
    private static final double MAX_CREDITS = 5;
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private static final String courseNumberNullException =
            "course number cannot be null or empty";
    private static final String prerequisitesNullException =
            "prerequisites cannot be null or empty";
    private static final String creditsNullException =
            "Error: credits must be in the range "
            + MIN_CREDITS + " to " + MAX_CREDITS;
    private static final String courseNameNullException =
            "course name cannot be null or empty";

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    //getters are inherited from the superclass.  No more magic numbers in
    //code below.  Also exceptions are thrown rather than outputting messages
    //when entries are not valid
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException(courseNumberNullException);
        };
        this.courseNumber = courseNumber;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException(prerequisitesNullException);
        };
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IllegalArgumentException(creditsNullException);
        }
        this.setCredits(credits);
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException(courseNameNullException);
        };
        this.courseName = courseName;
    }
    
}
