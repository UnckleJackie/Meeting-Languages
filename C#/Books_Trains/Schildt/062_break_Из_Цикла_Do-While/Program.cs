using System;

namespace _062_break_Из_Цикла_Do_While
{ // Применить оператор break для выхода из цикла do-while
    class BreakDemo2
    {
        static void Main()
        {
            int i;
            i = -10;
            do
            {
                if (i > 0) break;
                Console.Write(i + " ");
                i++;
            }
            while (i <= 10);
            Console.WriteLine("Готово!");
        }
    }
}
