using System;

namespace _064_break_Вложенные_Циклы
{
    class BreakNested
    { // Применить оператор break во вложенных циклах
        static void Main()
        {
            for (int i = 0; i < 3; i++)
            {
                Console.WriteLine("Подсчет во внешнем цикле: " + i);
                Console.Write("Подсчет во внутреннем цикле: ");

                int t = 0;
                while (t < 100)
                {
                    if (t == 10) break; // прервать цикл, если t равно 10
                    Console.Write(t + " ");
                    t++;
                }
                Console.WriteLine();
            }
            Console.WriteLine("Циклы завершены!");
        }
    }
}
