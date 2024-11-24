package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;
//        Class clazz = new String().getClass();
//        Class clazz = Class.forName("java.lang.String");

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod);
        }

        System.out.println("Superclass: " + clazz.getSuperclass());

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface.getName());
        }
    }
}
