package ink.maxelbk.ui;

import java.util.Timer;
import java.util.TimerTask;

public class AnimationThread {
    //Graphics对象
    private final Activity activity;
    //动画线程
    private final Thread thread = new Thread(this::runEvent, "MX-UI Animation");
    //延时时间
    private int period = 1000/24;

    //run方法
    private void runEvent() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

            }
        } ,0, period);
    }

    protected AnimationThread(Activity activity) {
        this.activity = activity;
    }

    public void start() {
        thread.start();
    }

    //get & set
    public void setFps(int fps) {
        period = 1000/fps;
    }
}
