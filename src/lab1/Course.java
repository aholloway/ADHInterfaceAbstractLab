package lab1;

/**
 * This abstract class contains pro
 *
 * @author aholloway
 */
public abstract class Course {
    //It doesn't look like these fields will do much good here, as they are not
    //used and I wouldn't want a subclass inheriting fields that it doesn't know
    //what they are for  So I'll leave it to the subclasses to declare these fields.

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

    //credits will not be set at the superclass level because validation may depend
    // on variables that are set at the subclass level.
//    private double credits;
//    public final String getCourseName() {
//        return this.courseName;
//    }
//
//    public final String getCourseNumber() {
//        return this.courseNumber;
//    }
//
//    public final double getCredits() {
//        return this.credits;
//    }
    //although getters seem to be useful, they would return the values stored
    //in an instance of Course, and what we really want to get is the values
    //stored in the the subclass.  So it looks like these will have to be abstract
    //as well
    public abstract void setCredits(double credits);

    public abstract double getCredits();
}
