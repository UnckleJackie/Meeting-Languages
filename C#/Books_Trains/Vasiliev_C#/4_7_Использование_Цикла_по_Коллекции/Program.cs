using System;

namespace _4_7_Использование_Цикла_по_Коллекции
{
    internal class ForeachDemo
    {
        static void Main()
        {
            int[] nums = { 1, 3, 4, 8, 9 }; // Целочисленный массив
            char[] symbs = { 'a', 'b', 'A', 'B', 'Ы' }; // Символьный массив
            string[] txts = { "красный", "желтый", "синий" }; // Текстовый массив
            Console.WriteLine("Целочисленный массив");

            foreach (int s in nums)
            { // Циклы по целочисленному массиву
                Console.WriteLine("Число {0} - {1}", s, s % 2 == 0 ? "четное" : "нечетное");
            }

            Console.WriteLine("Символьный массив");
            foreach (char s in symbs)
            { // Цикл по символьному масссиву
                Console.WriteLine("Код символа {0} - {1}", s, (int)s);
            }

            Console.WriteLine("Текстовый массив");
            foreach (string s in txts)
            { // Цикл по текстовому массиву
                Console.WriteLine("В слове \"{0}\" {1} букв", s, s.Length);
            }
        }
    }
}
