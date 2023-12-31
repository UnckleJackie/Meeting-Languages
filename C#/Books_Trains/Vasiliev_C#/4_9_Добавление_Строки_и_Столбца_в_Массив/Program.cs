using System;

namespace _4_9_Добавление_Строки_и_Столбца_в_Массив
{
    class InitTwoDimArrayDemo
    {
        static void Main()
        {
            char[,] symbs = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' } };
            Console.WriteLine("Исходный массив: "); // Создание, инициализация и отображение двумерного массива

            for (int i = 0; i < symbs.GetLength(0); i++)
            {
                for (int j = 0; j < symbs.GetLength(1); j++)
                {
                    Console.Write(symbs[i, j] + " ");
                }
                Console.WriteLine();
            }

            Random rnd = new Random(); // Объект для нерерации случайных чисел
            int row = rnd.Next(symbs.GetLength(0) + 1); // Строка и столбец
            int col = rnd.Next(symbs.GetLength(1) + 1); 
            Console.WriteLine("Добавляется {0}-я строка и {1}-й столбец", row, col);

            char[,] tmp = new char[symbs.GetLength(0) + 1, symbs.GetLength(1) + 1]; // Создание нового массива
            int a, b; // Целочисленные переменные
            char s = 'a'; // Символьная переменная

            for (int i = 0; i < symbs.GetLength(0); i++)
            { // Заполнение массива. Копирование значений из исходного массива
                if (i < row) a = i; // Первый индекс для элемента нового массива
                else a = i + 1;
                for (int j = 0; j < symbs.GetLength(1); j++)
                { // Второй индекс для элемента нового массива
                    if (j < col) b = j;
                    else b = j + 1; 
                    tmp[a, b] = symbs[i, j]; // Присваивание значения элементу массива
                }
            }

            for (int j = 0; j < tmp.GetLength(1); j++)
            { // Заполнение добавленной строки в новом массиве
                tmp[row, j] = s; // Значение элемента в строке
                s++; // Новое значение для следующего элемента
            }

            for (int i = 0; i < tmp.GetLength(0); i++)
            { // Если элемент не в добавленной строке
                if (i != row) 
                { // Значение элемента в столбце
                    tmp[i, col] = s;
                    s++; // Новое значение для следующего элемента
                }
            }
            symbs = tmp; // Присваивание массивов
            Console.WriteLine("Новый массив: "); // Отображение массива
            for (int i = 0; i < symbs.GetLength(0); i++)
            { // Отображение массива
                for (int j = 0; j < symbs.GetLength(1); j++)
                {
                    Console.Write(symbs[i, j] + " ");
                }
                Console.WriteLine();
            }
        }
    }
}
