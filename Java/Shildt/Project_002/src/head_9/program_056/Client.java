package head_9.program_056;

interface Callback {
    void callback(int param);
        }

public class Client implements Callback {
    // Realize interface method Callback
    public void callback(int p) {
        System.out.println("callback() calls with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Классы, которые реализуют интерфейсы, " +
                "могут также определять и другие члены");
    }
}
