package head_14.program_097;

/**
 * @apiNote
 * Простой обобщенный класс
 * Объявляем объект типа Т (T ob), передаем конструктору ссылку на объект типа Т
 * Возвращаем getOb, showType
 * @param <T> - параметр типа, который будет заменен реальным типом при создании объекта типа Gen
 *
 */
public class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }
    void showType() {
        System.out.println("Type T is " + ob.getClass().getName());
    }
}
