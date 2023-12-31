using System;

namespace _041_Исключаем_Деление_На_Ноль
{
    class NoZeroDiv
    { // Исключить денелие на ноль, используя оператор ?
        static void Main()
        {
            int result;

            for (int i = -5; i < 6; i++)
            {
                result = i != 0 ? 100 / i : 0;
                if (i != 0)
                    Console.WriteLine("100 / " + i + " равно " + result);
            }
        }
    }
}
