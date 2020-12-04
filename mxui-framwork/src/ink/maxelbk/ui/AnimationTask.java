package ink.maxelbk.ui;

public abstract class AnimationTask {
    //foreach变量
    private int i;
    private final int max;

    public abstract void forEach(int i);

    //循环下一帧
    public boolean next() {
        forEach(i++);
        return i == max;
    }

    //初始化方法
    public AnimationTask(int frames) {
        i = 0;
        max = frames;
    }

}
