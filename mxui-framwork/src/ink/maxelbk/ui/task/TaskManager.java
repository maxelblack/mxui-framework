package ink.maxelbk.ui.task;

import java.util.ArrayList;
import java.util.List;

public final class TaskManager {
    //Task线程集合
    private static final List<TaskThread> threads = new ArrayList<>();

    //配置项
    private static int maxThreadsNumber = 4; //最多线程数量

    //执行任务
    public static void runTask(Task task) {
        switch (task.getTaskMode()) {
            case Task.TASK_MODE_LINE:
                runTask_LINE(task);
                break;
            case Task.TASK_MODE_CURRENT_THREAD:
                runTask_CURRENT_THREAD(task);
                break;
            case Task.TASK_MODE_NEW_THREAD:
                runTask_NEW_THREAD(task);
                break;
        }
    }
    private static void runTask_LINE(Task task) {
        //独立任务队列线程执行任务
        if(threads.isEmpty() || threads.size() < maxThreadsNumber) {
            TaskThread thread = new TaskThread();
            thread.addTask(task);
            threads.add(thread);
            thread.activate();
        } else {
            int i = 0;
            TaskThread thread = threads.get(i);
            int m = thread.getTasksNumber();
            for (i++; i < maxThreadsNumber; i++) {
                TaskThread thread1 = threads.get(i);
                int n = thread1.getTasksNumber();
                if(n < m) {
                    m = n;
                    thread = thread1;
                }
            }
            thread.addTask(task);
        }
    }
    private static void runTask_CURRENT_THREAD(Task task) {
        //当前线程执行任务
        task.event();
    }
    private static void runTask_NEW_THREAD(Task task) {
        //新线程执行任务
        new Thread(task::event, "MX-UI Task Runner").start();
    }

    //get & set
    public static int getMaxThreadsNumber() {
        return maxThreadsNumber;
    }
    public static void setMaxThreadsNumber(int number) {
        maxThreadsNumber = number;
    }
}
