package lab2;


/**
 * This class demonstrates the other objects created in this package.
 * 
 * This class demonstrates the same thing as lab1, with the big change being using
 * an interface instead of an abstract class.  Although interfaces may seem like a lot
 * more work, there is a lot of flexibility with working with interfaces due to 
 * multiple inheritance.  There is also NO danger of inheriting bad code as 
 * all the code must be written in the implementing subclass.  However, if one
 * desires to modify an interface, there is some danger, as all implementing classes
 * will most likely be broken.
 *
 * @Drew Holloway
 */
public class StartUp {

    public static void main(String[] args) {

        //instantiate GUI
        Gui gui = new Gui();

        String answer;//to hold answers to questions

        String name;// to hold user's name.
        
        name=gui.askUser("Hello, what is your name?");
        
        //validation of name would occur here
        
        gui.showMessage("Hello "+name+", you must be here to sign up for classes!");
        
        answer = gui.askYesNo("Would you like to take Intro to Programming?");
        
        if (answer == "yes") {
            
            //try to take Intro to Programming Class
            
            IntroToProgrammingCourse course = new IntroToProgrammingCourse("Intro to Programming", "100");
            
            //course.setCredits(6);//cause exception
            
            course.setCredits(4);
            
            //course.setPrerequisites("");//No pre-reqs can be set.
            
            gui.showMessage("There are no prerequisites for this course");
            
            gui.showMessage("Very good.  You are now taking " + course.getCourseName()
                    + " which is course number " + course.getCourseNumber() + " for "
                    + course.getCredits() + " credits.");

        } else {
            
            //if they are not here for into to programming they are probably interested
            // in an advanced course...
            
            answer = gui.askYesNo("Would you like to take Intro to Java?");
            
            if (answer == "yes") {
                
                //try to take Intro to Java Class
                
                IntroJavaCourse course = new IntroJavaCourse("Intro to Java", "200");
                
                course.setCredits(5);
                
                course.setPrerequisites("Intro to Programming");
                
                //Check on prereqs
                
                answer=gui.askYesNo("The prerequisites for this course are "+
                        course.getPrerequisites() +". Have you taken the prerequisites?");
                
                if (answer=="yes"){
                    
                    gui.showMessage("You are taking " + course.getCourseName()
                        + " which is course number " + course.getCourseNumber() + " for "
                        + course.getCredits() + " credits.");
                }
                else{
                    //haven't taken the prereqs??  Can't take the course!
                    gui.displayErrorMessage("You must take the prerequisites: "+
                        course.getPrerequisites());
                }
            } else {
                
                //by process of elimination, they must be here for adv java.
                
                gui.showMessage("Then you must be here for Advanced Java!!!");
                gui.showMessage("Let me sign you up!");
                
                //try to take Advanced Java Course
                AdvancedJavaCourse course = new AdvancedJavaCourse("Advanced Java", "300");
                
                course.setCredits(4);
                
                course.setPrerequisites("Intro to Programming and Intro to Java");
                
                answer=gui.askYesNo("The prerequisites for this course are "+
                        course.getPrerequisites() +". Have you taken the prerequisites?");
                
                if (answer=="yes"){
                    gui.showMessage("You are taking " + course.getCourseName()
                        + " which is course number " + course.getCourseNumber() + " for "
                        + course.getCredits() + " credits.");
                }
                else{
                    gui.displayErrorMessage("You must take the prerequisites: "+
                        course.getPrerequisites());
                }

            }
        }
    }
}
