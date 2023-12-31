using System;

namespace _042_Делим_Только_На_Четные_Ненулевые_Значения
{
    class NoZeroDiv2
    { // Разделить только на четные, ненулевые значения
        static void Main()
        {
            for (int i = -5; i < 6; i++)
                if (i != 0 ? (i % 2 == 0) : false)
                    Console.WriteLine("100 / " + i + " равно " + 100 / i);
        }
    }
}
