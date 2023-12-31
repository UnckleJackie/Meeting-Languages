using System;

namespace _050_for_Выявление_Простых_Чисел
{ // Выяснить, является ли число простым. Если оно непростое, вывести наибольший его множитель
    class FindPrimes
    {
        static void Main()
        {
            int num;
            int i;
            int factor;
            bool isprime;

            for (num = 2; num < 1000; num++)
            {
                isprime = true;
                factor = 0;

                // Выяснить, делится ли значение переменной num нацело
                for (i = 2; i <= num / 2; i++)
                {
                    if ((num % i) == 0)
                    {
                        // Значение переменной num делится нацело.
                        // Следовательно, это не простое число.
                        isprime = false;
                        factor = i;
                    }
                }
                if (isprime)
                    Console.WriteLine(num + " - простое число.");
                else
                    Console.WriteLine("Наибольший множитель числа " + num + " равен " + factor);
            }
        }
    }
}
