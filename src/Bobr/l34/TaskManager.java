package Bobr.l34;

import java.util.List;

public class TaskManager {

    private final List<Task> tasks;

    public TaskManager(List<Task> tasks) {
        this.tasks = tasks;
    }

    public  void addTask(String title) {
        Task task = new Task(title);
        this.tasks.add(task);
    }

    public Task remove (int id) {
       for (Task task : tasks) {
           if (task.getId() != id)
               continue;
           tasks.remove(task);
           return  task;
       }
       return null;
    }
}
