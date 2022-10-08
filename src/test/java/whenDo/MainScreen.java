package activity.whenDo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public MainScreen(){
    }

    public boolean isTaskDisplayed(String title){
        Label task = new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return task.isControlDisplayed();
    }

    public void selectTaskDisplayed(String title){
        Label titleTask = new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        titleTask.click();
    }
}
