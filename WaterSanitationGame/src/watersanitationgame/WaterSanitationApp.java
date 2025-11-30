package watersanitationgame;

/**
 * WaterSanitationApp.java for individual checkpoint
 * @authors Nikolas Misins
 */

//imports
import  watersanitationgame.Events_Nikolas.EventsGUI;

public class WaterSanitationApp {
    public static void main(String[] args) {
        //for the purpose of  the individual checkpoint submission, the app class immediately opens my own section
        EventsGUI w = new EventsGUI(0);
        w.setVisible(true);
    }
}
