package pers.th.lovely.service;

import java.awt.*;

/**
 * Created by Tianhao on 2018-03-26.
 *
 * Basic Service
 */
public class RobotService {

    static Robot robot;

    static {
        try {
            robot = new Robot();
            robot.setAutoDelay(150);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

}
