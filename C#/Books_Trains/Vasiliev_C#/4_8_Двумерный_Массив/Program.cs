using System;

namespace _4_8_Двумерный_Массив
{
    class TwoDimArrayDemo
    {
        static void Main()
        {
            int rows = 3, cols = 5; // Количество строк и столбцов в массиве
            int[,] nums = new int[rows, cols]; // Создание двумерного массива
            int value = 1; // Значение первого элемента в массиве

            for (int i = 0; i < nums.GetLength(0); i++)
            { // Заполнение и отображение массива, перебор строк
                for (int j = 0; j < nums.GetLength(1); j++)
                { // Перебор столбцов в строке
                    nums[i, j] = value; // Присваивание значения элементу массива
                    value++; // Это будет значение следующего элемента
                    Console.Write(nums[i, j] + "\t"); // Отображение элемента в строке
                }
                Console.WriteLine(); // Переход к новой строке
            }
        }
    }
}
