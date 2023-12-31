using System;

namespace _057_Объявление_Управляющих_Переменных_for
{ // Объявить переменную управления циклом в самом цикле for
    class ForVar
    {
        static void Main()
        {
            int sum = 0;
            int fact = 1;

            // вычислить факториал чисел от 1 до 5
            for (int i = 1; i <= 5; i++)
            {
                sum += i; // Переменная i действует в цикле
                fact *= i;
            }
            // А здесь переменная i недоступна
            Console.WriteLine("Сумма равна " + sum);
            Console.WriteLine("Факториал равен " + fact);
        }
    }
}
