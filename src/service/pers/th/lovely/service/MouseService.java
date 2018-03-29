package pers.th.lovely.service;

import pers.th.lovely.dto.Color;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created by Tianhao on 2018-03-26.
 */
public class MouseService extends RobotService {

    public Point current(){
        return MouseInfo.getPointerInfo().getLocation();
    }

    public void move(int x, int y) {
        robot.mouseMove(x, y);
    }

    public Color color(int x, int y) {
        return Color.convert(robot.getPixelColor(x, y));
    }

    public void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void rightClick() {
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }
}
