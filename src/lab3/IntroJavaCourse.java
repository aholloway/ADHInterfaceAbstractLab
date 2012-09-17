package lab3;

/**
 * This class has the responsibilities of getting and setting the name of the
 * course and the course number. These methods are inherited from the superclass
 * Course
 *
 * Additionally, this class has the responsibility of getting and setting the
 * number of credits (validating that the number is within the proper range)
 *
 * Another responsibility of this class is setting and getting the prerequisites
 * for the course
 *
 * @author Drew
 * @version 1.00
 */
public class IntroJavaCourse extends Course implements HasPrerequisites {

    private static final double MIN_CREDITS = 0;
    private static final double MAX_CREDITS = 5;
    private double credits;
    private String prerequisites;
    private static final String prerequisitesNullException =
            "Error: prerequisites cannot be null or empty";
    private static final String creditsNullException =
            "Error: credits must be in the range "
            + MIN_CREDITS + " to " + MAX_CREDITS;

    public IntroJavaCourse(String courseName, String courseNumber) {
        // this object inherits the getters and setters for courseName and courseNumber
        // from the superclass.  It actaully stores these values in the superclass
        // object, but the course Name and number, but to anyone working with this
        // class object, they would not know this, and it would function as expected,
        // as if the getters and setters were written in this class.
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
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
        //this.setCredits(credits); this would cause an infinite loop.  D'oh!
        this.credits = credits;
    }

    public final double getCredits() {
        return this.credits;
    }
}
