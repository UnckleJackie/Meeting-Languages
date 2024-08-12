package head_9.program_061;

public interface MyIF {
    // Это объявление "нормального" метода интерфейса.
    // В нем НЕ определяется стандартная реализация.
    int getNumber();

    // Это стандартный метод. Обратите внимание, что он предоставляет
    // реализацию по умолчанию.
    default String getString() {
        return "Standard string";
    }

    // It's a static interface method
    static int getDefaultNumber() {
        return 0;
    }
}
