using System;

namespace _029_Операторы_Отношения_и_Логические
{
    class RelLogOps
    { // Продемонстрировать применение операторов отношения и логических операторов
        static void Main()
        {
            int i, j;
            bool b1, b2;

            i = 10;
            j = 11;
            if (i < j) Console.WriteLine("i < h");
            if (i <= j) Console.WriteLine("i <= j");
            if (i != j) Console.WriteLine("i != j");
            if (i == j) Console.WriteLine("");
            if (i >= j) Console.WriteLine("");
            if (i > j) Console.WriteLine("");

            b1 = true;
            b2 = false;
            if (b1 & b2) Console.WriteLine("");
            if (!(b1 & b2)) Console.WriteLine("!(b1 * b2) - true");
            if (b1 | b2) Console.WriteLine("b1 | b2 - true");
            if (b1 ^ b2) Console.WriteLine("b1 ^ b2 - true");
        }
    }
}
