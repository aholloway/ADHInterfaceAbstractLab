
package lab1;

/**
 * This abstract class contains pro
 * @author aholloway
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    
    

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
    

    public abstract void setCourseName(String courseName);

    public abstract void setCourseNumber(String courseNumber);

    public abstract void setCredits(double credits);
    
    public abstract String getCourseName();

    public abstract String getCourseNumber();

    public abstract double getCredits();

}
