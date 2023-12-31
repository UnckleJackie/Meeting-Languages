using System;

namespace _4_6_Сортировка_Массива_Методом_Пузырька
{
    internal class SortArrayDemo
    {
        static void Main()
        {
            char s; // Символьная переменная и исходный символьный массив
            char[] symbs = { 'Q', 'S', 'a', 'B', 'R', 'G', 'q', 'b', 'j', 'y', 'h' };
            Console.WriteLine("Массив до сортировки: "); // Отображение содержимого массива

            for (int k = 0; k < symbs.Length; k++)
            {
                Console.Write(symbs[k] + " ");
            }
            Console.WriteLine();

            for (int i = 1; i < symbs.Length; i++)
            { // Сортировка элементов в массиве
                for (int j = 0; j < symbs.Length - i; j++)
                { // Перебор элементов
                    if (symbs[j] > symbs[j + 1])
                    { // Если значение элемента слева больше элемента справа
                        s = symbs[j + 1];
                        symbs[j + 1] = symbs[j];
                        symbs[j] = s;
                    }
                }
            }
            Console.WriteLine(""); // Отображение содержимогомассиве
            for (int k = 0; k < symbs.Length; k++)
            {
                Console.Write(symbs[k] + " ");
            }
            Console.WriteLine();
        }
    }
}
