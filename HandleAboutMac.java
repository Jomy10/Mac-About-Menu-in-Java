import com.apple.eawt.ApplicationAdapter;
import javax.swing.*;

public class HandleAboutMac {
    // Call new HandleAboutMac(), when a user selects [your app name] > about [your app name], the code the setAboutHandler will be executed
    public HandleAboutMac() {
        com.apple.eawt.Application application = com.apple.eawt.Application.getApplication();
        application.setAboutHandler(new AboutHandler() {
            @Override
            public void handleAbout(AppEvent.AboutEvent aboutEvent) {
                // This is where your code goes for what has to be done when a Mac useers selects the about menu
                // For example:
                JOptionPane.showMessageDialog(null, "YOUR APP NAME\nYOUR APP INFO");

                // If you want to use JavaFX, you'll need to use the Platform.runLater;
                // Platform.runLater(new Runnable() {
                //    @Override
                //    public void run() {
                //        // Your JFX code here
                //    }
                // });
            }
        });
    } 
}
    
// Hope this helped!
