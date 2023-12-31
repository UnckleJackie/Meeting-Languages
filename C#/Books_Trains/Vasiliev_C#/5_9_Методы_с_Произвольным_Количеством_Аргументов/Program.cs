using System;

namespace _5_9_Методы_с_Произвольным_Количеством_Аргументов
{
    class ParamsDemo
    { // Методы для вычислеиня суммы чисел
        static int sums(params int[] a)
        {
            int res = 0;// Локальная переменная (значение суммы)
            for (int k= 0; k < a.Length; k++)
            { // Перебор аргументов метода
                res += a[k]; // Прибавление слагаемого к сумме
            }
            return res; // Результат метода
        }
        static string getText(string t, params int[] a)
        { // Метод для извлечения символов из текста
            string res = ""; // Начальное значение формируемой текстовой строки
            for (int k = 0; k < a.Length; k++)
            { // Перебор аргументов метода
                res += t[a[k]]; // Добавление символа в текст
            }
            return res; // Результат метода
        }
        static void show(int[] a, params char[] b)
        { // Метод отображает значения аргументов
            Console.Write("Чисел " + a.Length + ": "); // Количество элементов в числовом массиве
            for (int k = 0; k < a.Length - 1; k++)
            { // Значения элементов в числовом массиве
                Console.Write(a[k] + " ");
            } // Количество символьных аргументов
            Console.WriteLine("и " + a[a.Length - 1]);
            Console.Write("Символов" + b.Length + ": ");
            for (int k = 0; k < b.Length - 1; k++)
            { // Зн-я символьных аргументов
                Console.Write(b[k] + " ");
            }
            Console.WriteLine("и " + b[b.Length - 1]);
        }
        static void Main()
        { // Главный метод программы
            Console.WriteLine("Сумма чисел: " + sums(1, 6, 9, 2, 4)); // Вычисление суммы чисел
            Console.WriteLine("Сумма чисел: " + sums(5, 1, 2)); 
            Console.WriteLine(getText("Раз два три", 0, 10, 8, 1)); // Формируется текст
            Console.WriteLine(getText("Бревно", 3, 5, 1, 5, 4));
            show(new int[] { 1, 3, 5 }, 'A', 'B', 'C', 'D', 'E'); // Отображаются аргументы
            show(new int[] { 1, 3, 5, 7, 9 }, 'A', 'B', 'C', 'D');
        }
    }
}
