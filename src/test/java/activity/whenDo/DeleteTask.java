package activity.whenDo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class DeleteTask {
    public Button deleteTask = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmDelete = new Button(By.id("android:id/button1"));
    public Button cancelDelete = new Button(By.id("android:id/button2"));
}
