using System;

namespace _063_Выявляем_Наименьший_Множитель_Числа
{ // Выявить наименьший множитель числа
    class FindSmallestFactor
    {
        static void Main()
        {
            int factor = 1;
            int num = 1000;

            for (int i = 2; i <= num / i; i++)
            {
                if ((num % i) == 0)
                {
                    factor = i;
                    break; // прервать цикл, как только будет выявлен
                           // наименьший множитель числа
                    Console.Write(factor);
                }
            }
            Console.WriteLine("Наименьший множитель числа равен " + factor);
        }
    }
}
