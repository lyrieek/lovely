package pers.th.lovely.internal;

import pers.th.lovely.service.MouseService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tianhao on 2018-03-26.
 */
public class Expression {

    private MouseService mouseService = new MouseService();

    private final static Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+");

    public void analysis(String line){
        char first = line.charAt(0);
        if (first == '=') {
            line = line.substring(1);
            mouseService.move(parseNumber(line,0),parseNumber(line,1));
            return;
        }
        if (first == '>') {
            mouseService.rightClick();
            return;
        }
        if (first == '<') {
            mouseService.leftClick();
        }
//        System.out.println("line = [" + (int) line.charAt(0) + "]");
    }
    
    public int parseNumber(String context, int index){
        Matcher matcher = NUMBER_PATTERN.matcher(context);
        for (;matcher.find() && index > 0; index--);
        return Integer.parseInt(context.substring(matcher.start(),matcher.end()));
    }
    
    public int[] convert(String[] list){
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
