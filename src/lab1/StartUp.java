package lab1;

/**
 *
 * @Drew Holloway
 */
public class StartUp {
    public static void main(String[] args){
        
        //instantiate GUI
        Gui gui=new Gui();
        
        String answer=gui.askUser("How are you?");
        
        gui.showMessage("You said you were "+answer);
        
        gui.displayErrorMessage(answer);
    }
}
