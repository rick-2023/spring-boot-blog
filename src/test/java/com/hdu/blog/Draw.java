package com.hdu.blog;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
import java.awt.*;
import javax.swing.*;

public class Draw extends JFrame
{
    MyPanel mp = null ;

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Draw qwe = new Draw();

    }

    public Draw()
    {
        mp = new MyPanel();

        this.add(mp);
        this.setSize(400,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel    //我自己的面板，用于绘图和实现绘图区域
{
    //覆盖JPanel的paint方法
    //Graphics是绘图的重要类，可以理解成一支画笔
    public void paint(Graphics g)
    {
        //1.调用父类函数完成初始化
        super.paint(g);     //这句话不能少
        //画直线
        g.drawLine(30, 30, 90, 30);
        g.drawLine(30, 30, 30, 90);
        g.drawLine(30, 90, 90, 30);
    }
}