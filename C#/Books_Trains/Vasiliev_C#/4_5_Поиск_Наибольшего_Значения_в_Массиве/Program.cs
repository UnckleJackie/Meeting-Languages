using System;

namespace _4_5_Поиск_Наибольшего_Значения_в_Массиве
{
    internal class MaxElementDemo
    {
        static void Main()
        {
            int value, index; // Переменные для записи значения элемента и индекса
            int size = 100_500_000; // Размер массива
            Random rnd = new Random(); // Объект для генерации случайных чисел
            int[] nums = new int[size]; // Создание массива

            for (int k = 0; k < nums.Length; k++)
            { // Заполнение и отображение массива
                nums[k] = rnd.Next(1, 1_000_000_001); // Значение элемента массива
                //Console.Write(nums[k] + " "); // Отобраение значения элемента
            }
            Console.WriteLine();

            index = 0; // Поиск наибольшего элемента. Начальное значение для индекса
            value = nums[index]; // Значение элемента с индексом
            for (int k = 1; k < nums.Length; k++)
            { // Перебор элементов
                if (nums[k] > value)
                { // Если значение проверяемого элемента больше текущего наибольшего значения:
                    value = nums[k]; // Новое наибольшее значение
                    index = k; // Новое значение для индекса
                }
            }
            // Отображение результата
            Console.WriteLine("Наибольшее значение: " + value);
            Console.WriteLine("Индекс элемента: " + index);
        }
    }
}
