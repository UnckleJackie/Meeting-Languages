using System;

namespace _023_Время_Существования_Переменной
{
     class VarInitDemo
    { // Продемонстрировать время существования переменной
        static void Main()
        {
            int x;

            for (x = 0; x < 3; x++)
            {
                int y = -1; // Переменная у инициализируется при каждом входе в блок
                Console.WriteLine("" + y); // Здесь всегда выводится -1
                y = 100;
                Console.WriteLine("" + y);
            }
        }
    }
}
