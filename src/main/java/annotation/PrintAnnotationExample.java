package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
            printLine(printAnnotation);

            method.invoke(new Service());

            printLine(printAnnotation);
        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            final int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                final String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }

    }
}
