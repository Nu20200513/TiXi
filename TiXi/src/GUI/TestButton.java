package GUI;

import One.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

import One.demo1;
import Two.*;
import Three.*;
import Four.*;
import Three.KWICSubject;
import Two.Alphabetizer;
import Two.Input;
import Two.Output;
import Two.Shift;

public class TestButton {
    public static void main(String[] args) {
        Frame frame = new Frame("tz202031061161");
        //使用FlowLayout替换掉默认的BorderLayout布局管理器
        frame.setLayout(new FlowLayout());

        Button button1 = new Button("主程序-子程序");
        Button button2 = new Button("面向对象");
        Button button3 = new Button("事件系统");
        Button button4 = new Button("管道-过滤");

        //增加事件处理器
        button1.addActionListener(new ButtonHandler1());
        button2.addActionListener(new ButtonHandler1());
        button3.addActionListener(new ButtonHandler1());
        button4.addActionListener(new ButtonHandler1());
        /**
         * public void addActionListener(ActionListener l)
         * ActionListener是一个接口所有我们要写个类继承这个接口
         * void actionPerformed(ActionEvent e)
         * Invoked when an action occurs.
         * 重写这个接口中的方法
         */

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setSize(1000, 500);
        frame.setVisible(true);
    }
}

class ButtonHandler1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        demo1 kwic = new demo1();
        kwic.input("C:\\Users\\LENOVO\\Desktop\\实验\\input.txt");
        kwic.shift();
        kwic.alphabetizer();
        kwic.output("C:\\Users\\LENOVO\\Desktop\\实验\\output.txt");
        FileInputStream fls = null;
        try {
        	File file = new File("C:\\Users\\LENOVO\\Desktop\\实验\\output.txt");
        	fls = new FileInputStream(file);
        	byte[] b =  new byte[(int)file.length()];
        	while(fls.read(b) != -1) {}
        		System.out.println(new String(b));
        	}
        catch(Exception e1) {
        	e1.printStackTrace();
        }    
    }   
}



