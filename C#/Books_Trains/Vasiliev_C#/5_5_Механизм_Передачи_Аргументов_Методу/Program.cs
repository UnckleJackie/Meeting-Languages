using System;

namespace _5_5_Механизм_Передачи_Аргументов_Методу
{
    class ArgsDemo
    {
        static void alpha(int n)
        {
            Console.WriteLine("В методе alpha(). На входе :" + n); // Первый метод. Аргумент - целое число
            n++; // Попытка изменить значение аргумента
            Console.WriteLine("В методе alpha(). На выходе :" + n); // Проверка значения аргумента
        }
        static void bravo(int[] n)
        { // Второй метод. Аргумент - ссылка на массив
            Console.WriteLine("В методе bravo(). На входе :" + ArrayToText(n));
            for (int k = 0; k < n.Length; k++)
            { // Перебор элементов массива
                n[k]++; // Попытка изменить значение элемента массива
            }
            Console.WriteLine("В методе bravo(). На выходе :" + ArrayToText(n));
        }
        static void charlie(int[] n)
        { // Третий метод. Аргумент - ссылка на массив
            Console.WriteLine("В методе charlie(). На входе :" + ArrayToText(n));
            int[] m = new int[n.Length]; // Создается новый массив
            for (int k = 0; k < n.Length; k++)
            { // Перебор элементов в массиве
                m[k] = n[k] + 1; // Значение элемента в массиве
            }
            n = m; // Попытка присвоить новое значение аргументу
            Console.WriteLine("В методе charlie(). На выходе :" + ArrayToText(n));
        }
        static string ArrayToText(int[] n)
        { // Метод для преобразования массива в текст
            string res = " [" + n[0]; // Текстовая переменная
            for (int k = 1; k < n.Length; k++)
            { // Перебор элементов массива (кроме начального элемента)
                res += "," + n[k]; // Дописывание текста в текстовую переменную
            }
            res += "] "; // Дописывание текста в текстовую переменную
            return res; // Результат метода - текстовая строка
        }
        static void Main(string[] args)
        { // Главный метод программы
            int A = 100; // Переменная для передачи аргументом методу
            Console.WriteLine("До вызова метода alpha(): A = " + A); // Проверка значений переменной
            alpha(A); // Вызов метода
            Console.WriteLine("После вызова метода alpha: A = " + A); // Проверка значений переменной
            int[] B = { 1, 3, 5 }; // Массив для передачи аргументом методу
            Console.WriteLine("До вызова метода bravo(): B = " + ArrayToText(B)); // Проверка содержимого массива
            bravo(B); // Вызов метода
            Console.WriteLine("После вызова метода bravo(): B = " + ArrayToText(B)); // Проверка содержимого массива
            int[] C = { 2, 4, 6 }; // Массив для передачи аргументом методу
            Console.WriteLine("До вызова метода charlie(): C = " + ArrayToText(C)); // Проверка содержимого массива
            charlie(C); // Вызов метода
            Console.WriteLine("После вызова метода charlie(): C = " + ArrayToText(C)); // Проверка содержимого массива
        }
    }
}
