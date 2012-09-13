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

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("course number cannot be null or empty");
        };
        this.courseNumber = courseNumber;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("prerequisites cannot be null or empty");
        };
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
            System.out.println(
                    "Error: credits must be in the range "+MIN_CREDITS+" to "+MAX_CREDITS);
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("course name cannot be null or empty");
        };
        this.courseName = courseName;

    }
}
