package head_8.program_042;
// Создать подкласс путем расширения класса А
public class B extends A{
    int k;
    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
