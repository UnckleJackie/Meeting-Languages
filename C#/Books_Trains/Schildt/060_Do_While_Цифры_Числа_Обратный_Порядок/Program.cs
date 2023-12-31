using System;

namespace _060_Do_While_Цифры_Числа_Обратный_Порядок
{ // Отобразить цифры целого числа в обратном порядке
    class DoWhileDemo
    {
        static void Main()
        {
            int num;
            int nextdigit;
            num = 198;

            Console.WriteLine("Число: " + num);
            Console.Write("Число в обратном порядке: ");

            do
            {
                nextdigit = num % 10;
                Console.Write(nextdigit);
                num = num / 10;
            }
            while(num > 0);
            Console.WriteLine();
        }
    }
}
