package pers.th.lovely.internal;

import pers.th.lovely.dto.Color;
import pers.th.lovely.service.MouseService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tianhao on 2018-03-26.
 */
public class Expression {

    private MouseService mouseService = new MouseService();

    private final static Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+");

    public void analysis(String line) {
        if (line == null || line.isEmpty() || line.startsWith(" ")) {
            return;
        }
        char first = line.charAt(0);
        if (first == '#') {
            return;
        }
        line = line.substring(1);
        if (first == '=') {
            mouseService.move(parseNumber(line, 0), parseNumber(line, 1));
            System.out.println("move point:" + mouseService.current());
            return;
        }
        if (first == '!') {
            if (line.isEmpty()) {
                System.exit(0);
            }
            if (line.startsWith(".")) {
                line = line.substring(1);
                while (!Color.currentPointColor().code().equals(line)) {
                    System.out.println("retry:" + Color.currentPointColor().code());
                    sleep(1000);
                }
                return;
            }
            if (!Color.currentPointColor().code().equals(line)) {
                System.out.println("color error:" + line + " != " + Color.currentPointColor().code());
                System.exit(0);
            }
            System.out.println("success:" + line);
            return;
        }
        if (first == '>') {
            mouseService.rightClick();
            System.out.println("click:" + Color.currentPointColor().code());
            return;
        }
        if (first == '<') {
            mouseService.leftClick();
            System.out.println("click:" + Color.currentPointColor().code());
            sleep(500);
            return;
        }
        if (first == '+') {
            System.out.println(line);
            return;
        }
        if (first == ',') {
            sleep(parseNumber(line, 0));
        }
        if (first == '_') {
            System.out.println("color:" + Color.currentPointColor().code());
        }
//        System.out.println("line = [" + (int) line.charAt(0) + "]");
    }

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int parseNumber(String context, int index) {
        Matcher matcher = NUMBER_PATTERN.matcher(context);
        for (; matcher.find() && index > 0; index--) ;
        return Integer.parseInt(context.substring(matcher.start(), matcher.end()));
    }

    public int[] convert(String[] list) {
        int[] result = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            result[i] = Integer.parseInt(list[i]);
        }
        return result;
    }

    private String[] splitParam(String line) {
        return line.split(line);
    }

}
