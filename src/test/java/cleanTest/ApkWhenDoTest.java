package cleanTest;

import activity.whenDo.CreateTaskForm;
import activity.whenDo.DeleteTask;
import activity.whenDo.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Wait;
import singletonSession.Session;

public class ApkWhenDoTest {

    MainScreen mainScreen = new MainScreen();
    CreateTaskForm createTaskForm = new CreateTaskForm();

    DeleteTask deleteTask = new DeleteTask();

    @Test
    public void verifyCreateNewTask(){
        String title = "Tarea";
        String task = "Esta es una tarea";

        mainScreen.addTaskButton.click();
        createTaskForm.titleTxtBox.setText(title);
        createTaskForm.taskTxtBox.setText(task);
        createTaskForm.saveButton.click();
        //Verification
        Assertions.assertTrue(mainScreen.isTaskDisplayed(title),
                    "ERROR, the task was not created");
    }

    @AfterEach
    public void verifyTaskEdit() throws InterruptedException {
        String title = "Tarea";
        String newTitle = "Tarea editada";
        String newTask = "Esta es una tarea editada";

        //Edit Task
        mainScreen.selectTaskDisplayed(title);
        createTaskForm.titleTxtBox.setText(newTitle);
        createTaskForm.taskTxtBox.setText(newTask);
        createTaskForm.saveButton.click();
        Assertions.assertTrue(mainScreen.isTaskDisplayed(newTitle),
                "ERROR, the task was not updated");
        Thread.sleep(20000);
    }

    @AfterEach

    public void verifyDeleteTask() {
        String title = "Tarea editada";
        //Select Task
        mainScreen.selectTaskDisplayed(title);
        //Delete Task
        deleteTask.deleteTask.click();
        deleteTask.confirmDelete.click();
        //Verification
        Assertions.assertFalse(mainScreen.isTaskDisplayed(title),
                "ERROR, the task was not delete");
    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }

}
