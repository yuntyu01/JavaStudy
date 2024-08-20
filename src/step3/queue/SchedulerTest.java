package step3.queue;

public class SchedulerTest {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new CompressionTask());
        scheduler.addTask(new BackupTask());
        scheduler.addTask(new CleanTask());

        System.out.println("작업시작");
        run(scheduler);
        System.out.println("작업 완료");
    }

    private static void run(TaskScheduler scheduler){
        while (scheduler.getRemainingTasks() > 0){
            scheduler.processNextTask();
        }
    }
}
