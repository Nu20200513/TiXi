package GUI;


import java.awt.*;

public class ExGui {
    private Frame frame;
    private Button button1, button2, button3,button4;

    public void go(){
        frame = new Frame("tz202031061161");
        //ʹ��FlowLayout�滻��Ĭ�ϵ�BorderLayout���ֹ�����
        frame.setLayout(new FlowLayout());

        button1 = new Button("������-�ӳ���");
        button2 = new Button("�������");
        button3 = new Button("�¼�ϵͳ");
        button4 = new Button("�ܵ�-����");

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



