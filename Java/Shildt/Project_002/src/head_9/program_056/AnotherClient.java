package head_9.program_056;
// Еще одна реализация Callback
public class AnotherClient implements Callback {
    // realize interface method Callback
    public void callback(int p) {
        System.out.println("One more version of callback()\n\t" +
                "р в квадрате равно " + (p * p));
    }
}
