package com.stream.design._05_composite;

import java.util.ArrayList;
import java.util.List;

//组合节点
public class Files extends Component {

    private List<Component> children = new ArrayList<>();

    public Files(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        this.children.add(c);
    }

    @Override
    public void remove(Component c) {
        this.children.remove(c);
    }

    @Override
    public void diaplay(int depath) {
        StringBuilder str  = new StringBuilder();
        for (int i = 0; i < depath; i++) {
            str.append("-");
        }
        str.append(name);
        System.out.println(str.toString());
        for (Component c: children) {
            c.diaplay(depath+2);
        }
    }
}
