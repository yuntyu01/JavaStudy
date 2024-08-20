package step3.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {
    private Deque<Task> task = new ArrayDeque<>();
    public void addTask(Task task) {
        this.task.offer(task);
    }

    public int getRemainingTasks() {
        return task.size();
    }

    public void processNextTask() {
        Task task1 = task.pop();
        task1.execute();
    }


}
