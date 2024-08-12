package head_12.program_087;
import java.lang.annotation.*;
import java.lang.reflect.*;
// Single-element annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();    // value has to bo the name of member
}
class Single {
    // Annotate method, using single-element annotation
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value()); // output 100
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found!");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
