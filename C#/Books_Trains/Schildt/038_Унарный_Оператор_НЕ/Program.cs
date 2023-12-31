using System;

namespace _038_Унарный_Оператор_НЕ
{
    class NotDeme
    { // Продемонстрировать применение поразрядного унарного оператора НЕ
        static void Main()
        {
            sbyte b = -34;

            for (int t = 128; t > 0; t = t / 2)
            {
                if ((b & t) != 0) Console.Write("1 ");
                if ((b & t) == 0) Console.Write("0 ");
            }
            Console.WriteLine();

            // 
            b = (sbyte)~b;
            for (int t = 128; t > 0; t = t / 2)
            {
                if ((b & t) != 0) Console.Write("1 ");
                if ((b & t) == 0) Console.Write("0 ");
            }
        }
    }
}
