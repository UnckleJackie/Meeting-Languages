using System;

namespace _5_4_Массив_как_Результат_Метода
{
    class ArrayFromMethDemo
    {
        static int[] fibs(int n)
        { // Метод для создания массива с числами Фибоначчи
            int[] nums = new int[n]; // Создается массив
            nums[0] = 1; // Первый элемент массива
            if (nums.Length == 1) return nums; // Если массив из одного элемента
            nums[1] = 1; // Второй элемент массива

            for (int k = 2; k < nums.Length; k++)
            { // Заполнение элементов массива
                nums[k] = nums[k - 1] + nums[k - 2]; // Значение элемента массива равно сумме 
            } // значений двух предыдущих элементов
            return nums; // Результат метода - ссылка на массив
        }
        static char[] rands(int n)
        { // Метод для создания массива со случайными символами
            Random rnd = new Random(); // Объект для генерирования случайных чисел
            char[] symbs = new char[n]; // Создание массива

            for (int k = 0; k < symbs.Length; k++)
            { // Заполнение массива
                symbs[k] = (char)('A' + rnd.Next(26)); // Значение элемента - случайный символ
            }
            return symbs; // Результат метода - ссылка на массив
        }
        static int[,] odds(int m, int n)
        { // Метод для создания двумерного массива с нечетными числами
            int[,] nums = new int[m, n]; // Создание массива
            int val = 1; // Локальная переменная

            for (int i = 0; i < nums.GetLength(0); i++)
            { // Перебор строк массива
                for (int j = 0; j < nums.GetLength(1); j++)
                { // Перебор элементов в строке
                    nums[i, j] = val; // Значение элемента
                    val += 2; // Значение следующего элемента
                }
            }
            return nums; // Результат метода - ссылка на массив
        }
        static void Main()
        { // Главный метод программы
            int[] A; // Переменная для целочисленного массива
            char[] B; // Переменная для символьного массива
            int[,] C; // Переменная для двумерного массива
            A = fibs(10); // Создается массив с числами Фибоначчи
            Console.WriteLine("Числа Фибоначчи: ");
            foreach (int s in A)
            { // Отображение содержимого массива
                Console.Write("| {0}", s);
            }
            Console.WriteLine("|");

            B = rands(8); // Создается массив со случайными символами
            Console.WriteLine("Случайные символы: ");
            foreach (char s in B)
            { // Отображение содержимого массива
                Console.Write("| {0}", s);
            }
            Console.WriteLine("|");

            C = odds(4, 6); // Создается двумерный массив с нечетными числами
            Console.WriteLine("Двумерный массив: ");
            for (int i = 0; i < C.GetLength(0); i++)
            { // Отображение содержимого двумерного массива
                for (int j = 0; j < C.GetLength(1); j++)
                { // 
                    Console.Write("{0, 4}", C[i, j]);
                }
                Console.WriteLine();
            }
        }
    }
}
