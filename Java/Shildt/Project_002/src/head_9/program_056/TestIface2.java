package head_9.program_056;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob; // now c links to object AnotherClient
        c.callback(42);
    }
}
