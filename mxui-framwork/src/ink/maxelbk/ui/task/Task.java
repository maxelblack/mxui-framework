package ink.maxelbk.ui.task;

/**
 * <h1>Task</h1>
 * <h3>任务处理类</h3>
 * <p>
 *     MX-UI框架中用于代替事件监听器 Listener 的机制。
 *     可以完全实现事件监听器的功能，并能够简单实现异步任务机制，从根本避免任务卡住界面导致“未响应”问题等。
 * </p>
 */
public abstract class Task {
    //模式选择常量
    public final static int TASK_MODE_LINE = 0;
    public final static int TASK_MODE_CURRENT_THREAD = 1;
    public final static int TASK_MODE_NEW_THREAD = 2;

    private final int taskMode;

    //初始化方法

    /**
     * <p>
     *     以默认模式(独立任务队列线程)初始化任务对象
     * </p>
     */
    public Task() {
        taskMode = TASK_MODE_LINE;
    }

    /**
     * <p>
     *     以指定模式初始化任务对象
     * </p>
     * @param mode 任务执行模式
     */
    public Task(int mode) {
        taskMode = mode;
    }

    /**
     * <p>
     *     任务起始点
     * </p>
     */
    public abstract void event();
}
