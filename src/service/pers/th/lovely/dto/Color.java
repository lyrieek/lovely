package pers.th.lovely.dto;

import pers.th.lovely.service.RobotService;

import java.awt.*;

/**
 * Created by Tianhao on 2018-03-27.
 */
public class Color extends java.awt.Color {
    public Color(int v) {
        super(v);
    }

    public Color(int r, int g, int b) {
        super(r, g, b);
    }

    public String code() {
        return this.getRed() + "," + this.getGreen() + "," + this.getBlue();
    }

    public static Color convert(java.awt.Color color) {
        return new Color(color.getRGB());
    }

    public static Color currentPointColor() {
        Point point = MouseInfo.getPointerInfo().getLocation();
        return convert(RobotService.robot().getPixelColor((int) point.getX(), (int) point.getY()));
    }

}
