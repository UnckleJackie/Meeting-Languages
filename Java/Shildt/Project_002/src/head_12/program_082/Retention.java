package head_12.program_082;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnno {
    String str();
    int val();
}

class Meta {
    // Annotate method
    @MyAnno(str = "Annotation example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // Get annotation for this method and display values of its members

        try {
            // Firstly to get object Class which present this class
            Class<?> c = ob.getClass();
            // Now to get object Method which presents this method
            Method m = c.getMethod("myMeth");
            // Then to get annotation for this class
            MyAnno anno = m.getAnnotation(MyAnno.class);
            // At the end output values
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
