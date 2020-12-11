package ink.maxelbk.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class AnimationThread {
    //窗口对象
    private final Activity activity;
    //动画线程
    private final Thread thread = new Thread(this::runEvent, "MX-UI Animation");
    //延时时间
    private int period = 1000/24;
    //动画任务
    private final List<AnimationTask> tasks = new LinkedList<>();

    //run方法
    private void runEvent() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                runAnimationTasks();
                activity.update();
            }
        } ,0, period);
    }

    protected AnimationThread(Activity activity) {
        this.activity = activity;
    }

    //动画任务运行一帧
    synchronized private void runAnimationTasks() {
        for (AnimationTask task : tasks) {
            if(task.next()) {
                tasks.remove(task);
                task.onFinished();
            }
        }
    }

    //启动动画线程
    protected void start() {
        thread.start();
    }

    //get & set
    public void setFps(int fps) {
        period = 1000/fps;
    }
    public void addTask(AnimationTask task) {
        tasks.add(task);
    }
}
