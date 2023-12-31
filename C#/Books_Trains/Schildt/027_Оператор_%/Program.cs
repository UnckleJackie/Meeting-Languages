using System;

namespace _027_Оператор__
{
    class ModDemo
    { // Продемонстрировать применение оператора %
        static void Main()
        {
            int iresult, irem;
            double dresult, drem;

            iresult = 10 / 3;
            irem = 10 % 3;

            dresult = 10.0 / 3.0;
            drem = 10.0 % 3.0;

            Console.WriteLine("Результат и остаток от деления 10 / 3: " + iresult + " " + irem);
            Console.WriteLine("Результат и остаток от деления 10.0 / 3.0: " + dresult + " " + drem);
        }
    }
}
