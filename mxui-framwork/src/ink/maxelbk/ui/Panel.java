package ink.maxelbk.ui;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Panel extends View {
    //组件集合
    private List<View> viewList = new ArrayList<>();

    //add
    public void add(View view) {
        view.father = this.father;
        viewList.add(view);
    }

    @Override
    public void paint(Graphics2D g) {
        for(View view : viewList) {
            view.paint(g);
        }
    }
}
