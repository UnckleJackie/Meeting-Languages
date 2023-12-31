using System;

namespace _056_for_Без_Тела
{ // Тело цикла может быть пустым
    class Empty3
    {
        static void Main()
        {
            int i;
            int sum = 0;
            // получить сумму чисел от 1 до 5
            for (i = 1; i <= 5; sum += i++) ;

            Console.WriteLine("Сумма равна " + sum);
        }
    }
}
