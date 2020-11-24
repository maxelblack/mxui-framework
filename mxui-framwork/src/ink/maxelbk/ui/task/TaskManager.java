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
        //TODO 独立任务队列线程执行任务
    }
    private static void runTask_CURRENT_THREAD(Task task) {
        //当前线程执行任务
        task.event();
    }
    private static void runTask_NEW_THREAD(Task task) {
        //新线程执行任务
        new Thread(task::event).start();
    }

    //get & set
    public static int getMaxThreadsNumber() {
        return maxThreadsNumber;
    }
    public static void setMaxThreadsNumber(int number) {
        maxThreadsNumber = number;
    }
}
