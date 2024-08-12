package head_8.program_052;
/* при работе с наследованием выведенным типом является объявленный тип инициализатора,
и он может отличаться от производного типа объекта, на который ссылается инициализатор
 */
class MyClass {
    // ...
}

class FirstDerivedClass extends MyClass {
    int x;
    // ...
}

class SecondDerivedClass extends FirstDerivedClass {
    int y;
    // ...
}

public class TypeInferenceAndInheritance {
    // Return some type of object MyClass
    static MyClass getObj(int which) {
        switch(which) {
            case 0: return new MyClass();
            case 1: return new FirstDerivedClass();
            default: return new SecondDerivedClass();
        }
    }
    public static void main(String[] args) {
        /* Несмотря на то, что getObj() возвращает различные типы объектов в иерархии
        наследования MyClass, объявленным типом возвращаемого значения является MyClass.
        В результате во всех трех показанных здесь случаях предполагается, что типом
        переменны является MyClass, хотя получаются разные производные типы объектов.
        В этом случае getObj() возвращает объект MyClass
         */
        var mc = getObj(0);
        var mc2 = getObj(1); // return object FirstDerivedClass
        var mc3 = getObj(2); // return object SecondDerivedClass
        // Поскольку типы mc2 & mc3 output as MyClass (т.к. возвращаемым типом getObj()
        // является MyClass), то ни mc2, ни mc3 не могут получить доступ к полям, объявленным в
        // FirstDerivedClass or SecondDerivedClass.
        // mc2.x = 10; // Error! MyClass hasn't field x
        // mc3.y = 10; // Error! MyClass hasn't field y.
    }
}
