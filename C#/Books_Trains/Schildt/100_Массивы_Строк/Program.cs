using System;

namespace _100_Массивы_Строк
{ // Продемонстрировать массивы строк
    class StringArrays
    {
        static void Main()
        {
            string[] str = { "Это", "очень", "простой", "тест." };
            Console.WriteLine("Исходный массив: ");
            for (int i = 0; i < str.Length; i++)
                Console.Write(str[i] + " ");
            Console.WriteLine("\n");

            // Изменить строку
            str[1] = "тоже";
            str[3] = "до предела тест!";

            Console.WriteLine("Видоизмененный массив: ");
            for (int i = 0; i < str.Length; i++)
                Console.Write(str[i] + " ");
        }
    }
}
