package ink.maxelbk.ui;

import java.awt.*;

public abstract class View {
    //属性项
    private int x = 0, y = 0;
    private int width, height;

    //属性项设置
    public void setPosition(int x, int y) {
        //位置

    }
    public void setSize(int width, int height) {
        //大小
    }

    //on事件
    public void onMouseMovedIn() {}
    public void onMouseMovedOut() {}
    public void onClicked() {}
    public void onLongClicked() {}

    //绘图
    public abstract void paint(Graphics2D g);
}
