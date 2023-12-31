using System;

namespace _061_Оператор_break
{ // Применить оператор break для выхода из цикла
    class BreakDemo
    {
        static void Main()
        {
            // Использовать оператор break для выхода из этого цикла
            for (int i = -10; i <= 10; i++)
            {
                if (i > 0) break; // завершить цикл, как только значение
                                  // переменной i станет положительным
                Console.Write(i + " ");
            }
            Console.WriteLine("Готово!");
        }
    }
}
