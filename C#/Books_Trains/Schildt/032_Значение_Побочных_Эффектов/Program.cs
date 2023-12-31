using System;

namespace _032_Значение_Побочных_Эффектов
{
     class SideEffects
    { // Продемонстрировать значение побочных эффектов
        static void Main()
        {
            int i;
            bool someCondition = false;
            i = 0;
            // Значение переменной i инкрементируется, несмотря на то, что if не выполняется
            if (someCondition & (++i < 100))
                Console.WriteLine("Не выводится");
            Console.WriteLine("Оператор if выполняется: " + i); // выводится 1
            // В данном случае значение переменной i не инкрементируется
            // поскольку инкремент в укороченном логическом операторе опускается.
            if (someCondition && (++i < 100))
                Console.WriteLine("Не выводится");
            Console.WriteLine("Оператор if выполняется: " + i); // по-прежнему 1!!!
        }
    }
}
