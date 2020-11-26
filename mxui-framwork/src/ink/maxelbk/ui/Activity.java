package ink.maxelbk.ui;

import javax.swing.*;
import java.awt.*;

public class Activity extends JFrame {
    //动画线程
    private final AnimationThread animationThread = new AnimationThread(this);
    //死循环线程


    //窗口元素
    private Panel panel; //面板容器

    //初始化方法
    public Activity(Panel panel) {
        this.panel = panel;

    }

    //重写paint()
    @Override
    public void paint(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        panel.paint(graphics);
    }
    //重写setVisible()
    @Override
    public void setVisible(boolean b) {}

    //启动活动
    public void start(boolean enableAnimation) {
        super.setVisible(true);
        if(enableAnimation) animationThread.start();
    }

    //get & set
    public AnimationThread getAnimationThread() {
        return animationThread;
    }

}
