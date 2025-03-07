import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> myToDoList;

    ToDoList(){
        myToDoList = new ArrayList<Task>();
    }

    void addTask(Task task){
        this.myToDoList.add(task);
    }

    void removeTask(String title){
        myToDoList.removeIf(task -> task.getTitle().equals(title));
    }

    void displayTask(){
        if (myToDoList.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            for(Task i: myToDoList){
                System.out.println(i);
            }
        }
    }

    Task findTask(String title){
        for(Task task:  myToDoList){
            if(task.getTitle().equals(title)){
                return task;
            }
        }
        return null;

    }
    void markTaskAsCompleted(String title){
        Task task = findTask(title);
        if(task != null){
            task.markAsCompleted();

            
        }else{
            System.out.println("task is not existing");
        }
    }




}
