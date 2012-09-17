package lab3;

/**
 * This abstract class contains COMMON features to all the subclasses.
 *
 * This class is the primary class for the different types of courses, as ALL
 * subclasses are courses.
 *
 * @author aholloway
 */
public abstract class Course {
    
    /**
     * courseName and courseNumber should be declared in the Course superclass
     * as they are used by the concrete methods in the superclass.  In a similar
     * fashion the courseNameNullExemption string and the courseNumberNullExemption
     * string are used by the superclass.  On the other hand, credits is a field
     * that may be used by subclasses, but it is not my job to declare a field that
     * a subclass may not want or need.  It may cause confusion, and besides,
     * it cannot be accessed from the subclass as I would declare it private.
     */
    private String courseName;
    private String courseNumber;
    private static final String courseNameNullException =
            "Error: course name cannot be null of empty string";
    private static final String courseNumberNullException =
            "Error: course number cannot be null of empty string";

    /**
     * setCourseNumber and getCourseNumber should be concrete as ALL subclasses 
     * have courseNumbers and I do not anticipate that the validation should
     * differ between subclasses.
     */
    @SuppressWarnings("empty-statement")
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException(courseNameNullException);
        };
        this.courseName = courseName;
    }

    /**
     * setCourseNumber and getCourseNumber should be concrete as ALL subclasses 
     * have courseNumbers and I do not anticipate that the validation should
     * differ between subclasses.
     */
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

    /**
     * setCredits and getCredits should be abstract as ALL subclasses should
     *  have a different number of credits, but because each course may have
     *  a different valid range that credits can be between, we provide these 
     *  as abstract so that the creator of subclasses can validate the credits
     *  the way that they see fit.
     */
    public abstract void setCredits(double credits);

    public abstract double getCredits();
}
