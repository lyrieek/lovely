package pers.th.lovely.core;

/**
 * Created by Tianhao on 2018-03-26.
 */
public class Dispatcher {

    private Class<?> classes;
    private Object target;

    public Dispatcher(Class classes) {
        this.classes = classes;
        try {
            target = classes.newInstance();
        } catch (Exception e) {
            System.err.println("instance error:" + classes);
            e.printStackTrace();
        }
    }

    public Object method(String name) {
        try {
            return classes.getMethod(name).invoke(target);
        } catch (Exception e) {
            System.err.println("instance error:" + classes);
            e.printStackTrace();
        }
        return null;
    }

    public Object method(String name, Object... args) {
        try {
            if (args == null || args.length == 0) {
                return classes.getMethod(name).invoke(target);
            }
            Class[] paramTypes = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                paramTypes[i] = args[i].getClass();
            }
            return classes.getMethod(name, paramTypes).invoke(target, args);
        } catch (Exception e) {
            System.err.println("instance error:" + classes);
            e.printStackTrace();
        }
        return null;
    }

}
