package ink.maxelbk.ui;

import java.awt.*;

public abstract class View {
    //属性项
    protected int px = 0, py = 0; //父容器位置
    private int x = 0, y = 0; //绝对位置
    private int width, height;

    //属性项设置
    public void setPosition(int x, int y) {
        //位置
        this.x = px + x;
        this.y = py + y;
    }
    public void setSize(int width, int height) {
        //大小
        this.width = width;
        this.height = height;
    }

    //on事件
    public void onMouseMovedIn() {}
    public void onMouseMovedOut() {}
    public void onClicked() {}
    public void onLongClicked() {}
    public void onKeyClicked() {}
    public void onKeyPressed() {}
    public void onKeyReleased() {}

    //xy处理
    public int x(int dx) {
        return x + dx;
    }
    public int y(int dy) {
        return y + dy;
    }

    //绘图
    public abstract void paint(Graphics2D g);
}
