package lab3;

/**
 * This class demonstrates the other objects created in this package.
 * 
 * What is good about using an abstract superclass is that you can pass code
 * to all the objects that inherit from it that may be useful.  The problems arise
 * when you pass code that is not used by all subclasses and then needs to be 
 * overridden, or worse yet, is ignored by the creator of the subclass.  Since
 * the code is passed invisibly to all the subclasses, this is a real danger of 
 * using abstract classes.  We will favor interfaces over inheritance in this course.
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
