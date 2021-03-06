package lab3;

/**
 * This class has the responsibilities of getting and setting the name of the course
 * and the course number.  These methods are inherited from the superclass Course
 * 
 * Additionally, this class has the responsibility of getting and setting the
 * number of credits (validating that the number is within the proper range)
 *
 * @author Drew
 * @version 1.00
 */

public class IntroToProgrammingCourse extends ProgrammingCourse {

    /**
     * The fields MIN_CREDITS, MAX_CREDITS, and credits should
     * be declared at the subclass level, as they are get and set at this level.
     * That allows added flexibility for validation logic to differ.  In this class,
     * the MIN_CREDITS are set to 0.5 and MAX_CREDITS to 4.  But in another course,
     * the range could differ.  Additionally, the error message that is used
     * in this class should be declared here.  If any of these properties were
     * declared at the superclass level, the subclass would not have access to
     * them if they were declared private (as they should be).
     */
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4;
    private double credits;
    private static final String creditsNullException =
            "Error: credits must be in the range "
            + MIN_CREDITS + " to " + MAX_CREDITS;
    

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        // this object inherits the getters and setters for courseName and courseNumber
        // from the superclass.  It actaully stores these values in the superclass
        // object, but the course Name and number, but to anyone working with this
        // class object, they would not know this, and it would function as expected,
        // as if the getters and setters were written in this class.
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    

    public final void setCredits(double credits) {
        if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IllegalArgumentException(creditsNullException);
        }
        this.credits=credits;
    }

    public final double getCredits() {
        return this.credits;
    }
}
