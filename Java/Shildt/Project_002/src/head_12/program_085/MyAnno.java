package head_12.program_085;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Test";
    int val() default 9000;
}

class Meta3 {
    // Annotate method with using standard values
    @MyAnno()
    public static void myMeth() {
        Meta3 ob = new Meta3();
        // Get annotation for this method and output members values
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found!");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
