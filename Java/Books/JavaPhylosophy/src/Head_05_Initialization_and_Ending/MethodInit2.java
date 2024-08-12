package Head_05_Initialization_and_Ending;

public class MethodInit2 {
    int i = f();
    int j = g(i);
    int f() {
        return 11;
    }
    int g(int n) {
        return n * 10;
    }
}
