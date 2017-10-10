package com.stream.design._05_composite;

//子节点
public class Doc extends Component {

    public Doc(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        System.out.println("不能新增叶子节点!");
    }

    @Override
    public void remove(Component c) {
        System.out.println("不能删除叶子节点!");
    }

    @Override
    public void diaplay(int depath) {
        StringBuilder str  = new StringBuilder();
        for (int i = 0; i < depath; i++) {
            str.append("-");
        }
        str.append(name);
        System.out.println(str.toString());
    }

}
