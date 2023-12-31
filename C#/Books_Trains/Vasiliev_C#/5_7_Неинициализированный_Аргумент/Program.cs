using System;

namespace _5_7_Неинициализированный_Аргумент
{
    class UsingOutDemo
    {
        static int getMin(int[] nums, out int index)
        { // Метод для вычисления значения наименьшего элемента в массиве и его индекса
            index = 0; // Начальное значение для индекса
            for (int k = 1; k < nums.Length; k++) 
            { // Перебор элементов массива
                if (nums[k] < nums[index])
                { // Если значение элемента массива меньше текущего минимального значения, то
                    index = k; // Новое значение для индекса
                }
            }
            return nums[index]; // Результат метода
        }
        static void Main()
        { // Главный метод программы
            int[] A = { 12, 7, 8, 3, 8, 4, 1, 3, 4, 1, 7, 15 }; // Целочисленный массив
            foreach(int v in A)
            { // Отображение содержимого массива
                Console.Write("| {0}", v);
            }
            Console.WriteLine("|");

            int val, k; // Объявление переменных
            val = getMin(A, out k); // Вычисление элемента с наименьшим значением и отображение результатов
            Console.WriteLine("Наименьшее значение: " + val);
            Console.WriteLine("Индекс элемента: " + k);
            Console.WriteLine("Проверка: A[{0}] = {1}", k, A[k]);
        }
    }
}
