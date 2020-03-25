package pers.th.lovely.service;

import pers.th.lovely.dto.Color;

import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Tianhao on 2018-03-26.
 */
public class MouseService extends RobotService {

    public Point current() {
        return MouseInfo.getPointerInfo().getLocation();
    }

    public void move(int x, int y) {
        move(new Point(x, y));
    }

    public void move(Point p) {
        robot.mouseMove((int) p.getX(), (int) p.getY());
        System.out.println("move=" + current());
        if (!p.equals(current())) {
            move(p);
        }
    }

    public void ss() {
        Toolkit.getDefaultToolkit().addAWTEventListener(event -> {
            System.out.println("event = [" + event.getID() + "]");
        }, AWTEvent.KEY_EVENT_MASK);
    }

    public Color color(int x, int y) {
        return Color.convert(robot.getPixelColor(x, y));
    }

    public void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void leftClick5() {
        for (int i = 0; i < 5; i++) {
            leftClick();
            robot.delay(200);
        }
    }

    public void ctrl() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void esc() {
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public void rightClick() {
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }
}
