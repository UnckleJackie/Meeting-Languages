using System;

namespace _058_While_Вычисляем_Порядок_Величины_Целого_Числа
{ // Вычислить порядок величины целого числа
    class WhileDemo
    {
        static void Main()
        {
            int num;
            int mag;

            num = 435679;
            mag = 0;

            Console.WriteLine("Число: " + num);

            while (num > 0)
            {
                mag++;
                num = num / 10;
            };
            Console.WriteLine("Порядок величины: " + mag);
        }
    }
}
