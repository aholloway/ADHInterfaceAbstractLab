
package lab1;

//responsible for accepting input and outputting messages

import java.awt.image.ImageObserver;
import javax.swing.JOptionPane;

public class Gui {
    public String askUser(String question){
        //asks user for input
        String string=JOptionPane.showInputDialog(null, question);
        return string;
    }
    
    public String askYesNo(String question){
        int answer=JOptionPane.showConfirmDialog(null, question);
        if (answer==JOptionPane.YES_OPTION) {
            return "yes";
        }
        if (answer==JOptionPane.NO_OPTION) {
            return "no";
        }
        return "cancel";
    }
    
    public void displayErrorMessage(String errorMessage){
        //displays error message
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void showMessage(String message){
        //shows message
        JOptionPane.showMessageDialog(null, message);
                
    }
}
