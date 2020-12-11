package ink.maxelbk.ui.task;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TaskThread {
    //任务列表
    private final List<Task> tasks = new LinkedList<>();
    //Thread对象
    private final Thread thread = new Thread(this::runEvent, "MX-UI Task Runner");

    //run方法
    private void runEvent() {
        for(;;) {
            if (tasks.isEmpty()) {
                try {
                    thread.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            tasks.get(0).event();
            tasks.remove(0);
        }
    }

    //激活线程
    public void activate() {
        if(thread.isAlive()) {
            if(thread.isInterrupted()) thread.notify();
        } else {
            thread.start();
        }
    }

    //添加任务
    public void addTask(Task task) {
        tasks.add(task);
    }
    public void addTask(Task... tasks) {
        this.tasks.addAll(Arrays.asList(tasks));
    }

    //get & set
    public int getTasksNumber() {
        return tasks.size();
    }

}
