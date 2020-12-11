package ink.maxelbk.ui;

public abstract class AnimationTask {
    //foreach变量
    private int i;
    private final int max;

    //可继承
    public abstract void forEach(int i);
    public void onFinished() {}

    //循环下一帧
    public boolean next() {
        forEach(i++);
        return i == max;
    }
    //重置帧进度
    public void reset() {
        i = 0;
    }

    //初始化方法
    public AnimationTask(int frames) {
        i = 0;
        max = frames;
    }

}
