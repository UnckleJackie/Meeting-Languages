using System;

namespace _4_11_Массив_из_Переменных_Массива
{
    class AnotherTwoDimArrayDemo
    {
        static void Main()
        {
            char[][] symbs = new char[16][]; // Символьный массив из переменных массива и Целочисленный массив из переменных массива
            int[][] nums = { new int[] { 1, 2, 3 }, new int[] { 4, 5 }, new int[] { 6, 7, 8, 9 } };
            char s = 'A'; // Символьная переменная

            for (int i = 0; i < symbs.Length; i++)
            { // Заполнение символьного массива и перебор элементов во внешнем массиве
                symbs[i] = new char[i + 3]; // Создание внутреннего массива
                for (int j = 0; j < symbs[i].Length; j++)
                { // Перебор элементов во внутреннем массиве
                    symbs[i][j] = s; // Значение элемента внутреннего массива
                    s++; // Значение для следующего элемента
                }
            }
            Console.WriteLine("Целочисленный массив: "); // Отобржаение целочисленного массива
            for (int i = 0; i < nums.Length; i++)
            {
                for (int j = 0; j < nums[i].Length; j++)
                {
                    Console.Write("{0, 3}", nums[i][j]);
                }
                Console.WriteLine();
            }
            Console.WriteLine("Символьный массив"); // Отображение символьного массива
            foreach (char[] q in symbs)
            { // Перебор элементов внешнего массива
                foreach (char p in q)
                { // Перебор элементов во внутреннем массиве
                    Console.Write("{0, 2}", p); // Отображение элемента массива
                }
                Console.WriteLine();
            }
        }
    }
}
