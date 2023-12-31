using System;

namespace _5_8_Использование_Рекурсии
{
    class RecursionDemo
    {
        static int factorial(int n)
        { // Метод для вычисления факториала числа
            if (n == 1) return 1;
            else return n * factorial(n - 1);
        }
        static int fibs(int n)
        { // Метод для вычисления чисел Фибоначчи
            if (n == 1 || n == 2) return 1;
            else return fibs(n - 1) + fibs(n - 2);
        }
        static int sum(int n)
        { // Метод для вычисления суммы чисел
            if (n == 0) return 0;
            else return n + sum(n - 1);
        }
        static void show(int[] a, int k)
        { // Метод для отображения содержимого массива
            Console.Write(a[k] + " "); // Отображение значения элемента массива
            if (k == a.Length - 1) // Если элемент в массиве последний
            {
                Console.WriteLine();
            }
            else
            { // Если элемент в массиве не последний
                show(a, k + 1); // Рекурсивный вызов метода
            }
        }
        static void show(int[] a)
        { // Перегрузка метода для отображения содержимого массива
            show(a, 0); // Вызов версии метода с двумя аргументами
        }
        static void Main(string[] args)
        { // Главный метод программы
            Console.WriteLine("Факториал числа: ");
            for (int k = 1; k <= 10; k++)
            { // Вычисление факториала числа
                Console.WriteLine(k + "!= " + factorial(k));
            }
            Console.WriteLine("Числа Фибоначчи: ");
            for (int k = 1; k <= 10; k++)
            { // Вычисление чисел Фибоначчи
                Console.Write(fibs(k) + " ");
            }
            Console.WriteLine();
            Console.Write("Сумма чисел от 1 до 100: ");
            Console.WriteLine(sum(100));

            int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 }; // Числовой массив
            Console.WriteLine("Числовой массив: ");
            show(A); // Отображение всех элементов массива
            Console.WriteLine("Элементы, начиная с третьего");
            show(A, 2); // Отображение элементов начиная с третьего
        }
    }
}
