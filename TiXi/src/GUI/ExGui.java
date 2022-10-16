package GUI;


import java.awt.*;

public class ExGui {
    private Frame frame;
    private Button button1, button2, button3,button4;

    public void go(){
        frame = new Frame("tz202031061161");
        //使用FlowLayout替换掉默认的BorderLayout布局管理器
        frame.setLayout(new FlowLayout());

        button1 = new Button("主程序-子程序");
        button2 = new Button("面向对象");
        button3 = new Button("事件系统");
        button4 = new Button("管道-过滤");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setSize(1000, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       ExGui gui = new ExGui();

        gui.go();
    }
}



