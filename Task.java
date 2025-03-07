import java.time.LocalDate;


public class Task {
    private String title;
    private String description;
    private LocalDate due_data;
    private boolean status;

    Task(){
        this.title = "";
        this.description = "";
        this.due_data = LocalDate.now();
        this.status = false;
    }

    Task(String title, String description, LocalDate due_data, boolean status){
        this.title = title;
        this.description = description;
        this.due_data = due_data;
        this.status = status;
    }

    boolean getStatus(){
        return status;
    }
    LocalDate getDueData(){
        return due_data;
    }
    String getDescription(){
        return description;
    }
    String getTitle(){
        return title;
    }

    void setStatus(boolean status){
        this.status =  status;
    }
    void setDueData(LocalDate due_data){
        this.due_data = due_data;
    }
    void setDescription(String description){
        this.description = description;
    }
    void setTitle(String title){
        this.title = title;
    }

    //action

    void markAsCompleted() {
        setStatus(true);
    }

    void postponeTask(int days){
        this.due_data = this.due_data.plusDays(days);
    }

    boolean isOverdue(){
        return LocalDate.now().isAfter(this.due_data);
    }

    public String toString(){
        return "Task: " + title + " Description: " + description + " due data: " +  due_data + " status " + status + "\n";
    }
}
