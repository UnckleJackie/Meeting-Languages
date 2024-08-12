package head_12.program_084;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}
@What(description = "Class annotation")
@MyAnno(str = "Meta2", val = 99)

class Meta2 {
    @What(description = "Method Annotation")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            // Display all the annotations for Meta2
            System.out.println("All the annotations for Meta2 class: ");
            for (Annotation a : annos)
                System.out.println(a);
            System.out.println();

            // Display all the annotations for MyMeth.
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All yt annotations for myMeth: ");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found!");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
