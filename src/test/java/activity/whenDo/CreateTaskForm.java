package activity.whenDo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class CreateTaskForm {

    public TextBox titleTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox taskTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
}
