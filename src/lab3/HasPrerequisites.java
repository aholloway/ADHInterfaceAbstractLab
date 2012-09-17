
package lab3;

/**
 * 
 * This is the interface that is to be used by courses that have prerequisites.
 * But the nice thing about interfaces, is it could be used by anything that 
 * has prerequisites.  :)
 * 
 * This class is secondary to the superclass Course.  Whereas Course provides
 * the meat of what it means to be a course (having a Course name and a Course
 * number - neither of which are null or an empty string), this interface simply
 * provides some functionality that is more peripheral.  It is not essential
 * that all courses have prerequisites.  But some do.
 * 
 * @author Drew
 */
public interface HasPrerequisites {
    
    //all classes that implement this interface will have the following public
    //methods.
    String getPrerequisites();
    void setPrerequisites(String prerequisites);
}
