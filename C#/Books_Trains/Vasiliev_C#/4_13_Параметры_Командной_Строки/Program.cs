using System;

namespace _4_13_Параметры_Командной_Строки
{
    class ProgArgsDemo
    {
        static void Main(string[] args) // Главный метод с аргументом - массивом
        {
            Console.WriteLine("Передано {0} параметров", args.Length); // Определение количества переданных параметров

            for (int k = 0; k < args.Length; k++)
            { // Отображение значений параметров
                Console.WriteLine("{0}-й параметр: {1}", (k + 1), args[k]); // Отображение значения параметра
            }
            Console.WriteLine("Выполнение программы завершено!");
        }
    }
}
