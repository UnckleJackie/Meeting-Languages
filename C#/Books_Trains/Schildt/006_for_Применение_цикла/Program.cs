using System;

namespace _006_for_Применение_цикла
{
    internal class ForDemo
    { // Продемонстрировать применение оператора цикла for
        static void Main()
        {
            int count;
            for (count = 0; count < 5;  count++)
            {
                Console.WriteLine("Это подсчет: " + count);
            }
            Console.WriteLine("Готово!");
        }
    }
}
