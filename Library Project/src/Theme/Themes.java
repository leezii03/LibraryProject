package Theme;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Themes {
    public Themes(String mode){
        try {
            if(mode.equalsIgnoreCase("light")){
                UIManager.setLookAndFeel(new FlatLightLaf());
            }else{
                UIManager.setLookAndFeel(new FlatDarkLaf());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
