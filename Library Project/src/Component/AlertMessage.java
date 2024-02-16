package Component;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AlertMessage {
    static public void Success(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("D:\\Project\\Library\\src\\Image\\SuccessIcon.png"));
    }
    static public void Error(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.ERROR_MESSAGE);
    }
    static public void Warning(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.WARNING_MESSAGE);
    }
}
