using System;

namespace _017_Применяем_Команды_Форматирования
{
    class DisplayOptions
    { // Применяем команды форматирования
        static void Main()
        {
            int i;
            Console.WriteLine("Число\tКвадрат\tКуб");

            for (i = 1; i < 10; i++)
                Console.WriteLine("{0}\t{1}\t{2}", i, i * i, i * i * i);

            Console.WriteLine("Деление 10/3 дает: {0:#.##}", 10.0 / 3.0);
            Console.WriteLine("{0:###,###.##}", 123456.56);

            decimal balance = 12323.09m;
            Console.WriteLine("Текущий баланс равен {0:C}", balance);
        }
    }
}
