using System;

namespace _016_Применение_типа_bool
{
    class BoolDemo
    { // Продемонстрировать применение типа bool
        static void Main()
        {
            bool b;
            b = false;

            Console.WriteLine("b равно " + b);
            b = true;
            Console.WriteLine("b равно " + b);
            // Логическое значение может управлять оператором if
            if (b) Console.WriteLine("Выполняется!");
            b = false;
            if (b) Console.WriteLine("Не выполняется!");
            // Результатом вып-я оператора отношения является логическое зн-е
            Console.WriteLine("10 > 9 равно " + (10 > 9));
        }
    }
}
