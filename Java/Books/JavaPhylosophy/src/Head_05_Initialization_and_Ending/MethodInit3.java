package Head_05_Initialization_and_Ending;

public class MethodInit3 {
    //! int j = g(i); // ERROR!
    int i = f();
    int f() {
        return 11;
    }
    int g(int n) {
        return n * 10;
    }
}
