package pers.th.lovely.core;

import java.util.HashMap;
import java.util.Map;

public class Router{

    private final Map<String,Dispatcher> mapping = new HashMap<>();


    public Dispatcher addRecord(String url, Dispatcher dispatcher){
        return mapping.put(url,dispatcher);
    }

    public Dispatcher rmRecord(String url){
        return mapping.remove(url);
    }

}