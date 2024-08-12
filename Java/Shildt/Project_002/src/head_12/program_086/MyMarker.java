package head_12.program_086;
import java.lang.annotation.*;
import java.lang.reflect.*;
// Marker annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface MyMarker { }
class Marker {
    // Annotate method, using marker annotation. Attention () not neccessary!
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("MyMarker presents");
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
