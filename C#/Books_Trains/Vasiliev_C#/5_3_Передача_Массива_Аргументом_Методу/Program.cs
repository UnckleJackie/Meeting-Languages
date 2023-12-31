using System;

namespace _5_3_Передача_Массива_Аргументом_Методу
{
    class ArrayToMethDemo
    {
        static void fillRand(int[] nums)
        { // Метод для заполнения массива случайными числами
            Random rnd = new Random(); // Объект для генерирования случайных чисел
            for (int k = 0; k < nums.Length; k++)
            { // Заполнение массива случайными числами
                nums[k] = rnd.Next(1, 101);
            }
            Console.WriteLine("|");
        }
        static void showArray(int[] nums)
        { // Метод для отображения одномерного целочисленного массива
            for (int k = 0; k < nums.Length; k++)
            { // Перебор элементов массива и отображение значения элемента
                Console.Write("| {0}", nums[k]);
            }
            Console.WriteLine();
        }
        static void showArray(int[,] nums)
        { // Метод для отображения двумерного целочисленного массива
            for (int i = 0; i < nums.GetLength(0); i++)
            { // Перебор строк и элементов массива и отображение значения элемента
                for (int j = 0; j < nums.GetLength(1); j++)
                {
                    Console.Write("{0,3}", nums[i, j]);
                }
                Console.WriteLine();
            }    
        }
        static int findMin(int[] nums)
        { // Метод для вычисления наименьшего элемента в массиве
            int s = nums[0]; // Локальная переменная
            for (int k = 1; k < nums.Length; k++)
            { // Поиск наименьшего значения. Если проверяемый элемент имеет значение меньшее
                if (nums[k] < s) s = nums[k]; // текущего значения переменной s
            }
            return s;
        }
        static void Main()
        { // Главный метод программы
            int[] A = { 1, 3, 5, 7, 9, 11, 13, 15 }; // Одномерные массивы
            int[] B = new int[5];
            int[,] C = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }; // Двумерный массив
            fillRand(B); // Массив В заполняется случайными числами
            Console.WriteLine("Одномерный массив A: ");
            showArray(A); // Отображается массив А
            Console.WriteLine("Одномерный массив B: ");
            showArray(B); // Отображается массив В
            int m = findMin(B); // Поиск наименьшего элемента
            Console.WriteLine("Наименьшее значение: {0}", m);
            Console.WriteLine("Двумерный массив C: ");
            showArray(C); // Отображается массив С
        }
    }
}
