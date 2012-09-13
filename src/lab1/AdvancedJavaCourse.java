package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4;
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private static final String courseNumberNullException =
            "Error: course number cannot be null or empty";
    private static final String prerequisitesNullException =
            "Error: prerequisites cannot be null or empty";
    private static final String creditsNullException =
            "Error: credits must be in the range "
            + MIN_CREDITS + " to " + MAX_CREDITS;
    private static final String courseNameNullException =
            "Error: course name cannot be null or empty";

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

  
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException(courseNumberNullException);
        };
        this.courseNumber = courseNumber;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException(prerequisitesNullException);
        };
        this.prerequisites = prerequisites;
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
