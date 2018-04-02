package pers.th.lovely.core;

/**
 * Created by Tianhao on 2018-03-26.
 */
public class Dispatcher {

    private Class<?> classes;
    private Object target;

    public Dispatcher(Class classes){
        this.classes = classes;
        try {
            target = classes.newInstance();
        } catch (Exception e) {
            System.err.println("instance error:"+classes);
            e.printStackTrace();
        }
    }

    public Object method(String name){
        try {
            return classes.getMethod(name).invoke(target);
        } catch (Exception e) {
            System.err.println("instance error:"+classes);
            e.printStackTrace();
        }
        return null;
    }

    public Object method(String name, Class[] parameterTypes, Object... args){
        try {
            return classes.getMethod(name,parameterTypes).invoke(target, args);
        } catch (Exception e) {
            System.err.println("instance error:"+classes);
            e.printStackTrace();
        }
        return null;
    }

}
