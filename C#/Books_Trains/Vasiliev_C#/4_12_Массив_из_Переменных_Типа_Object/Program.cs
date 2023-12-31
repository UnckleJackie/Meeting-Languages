using System;

namespace _4_12_Массив_из_Переменных_Типа_Object
{
    class ObjectArrayDemo
    {
        static void Main()
        {
            Object[] objs = new object[3]; // Массив из трех переменных типа Object
            objs[0] = 123; // Элементам массива присваиваются значения разных типов
            objs[1] = 'A'; // Символ
            objs[2] = "trese elemento"; // Текст
            Console.WriteLine("Look at this strange Array: ");

            for (int k = 0; k < objs.Length; k++)
            { // Проверка содержимого массива
                Console.WriteLine(k + ": " + objs[k]);
            }

            objs[0] = (int)objs[0] + 111; // Новые значения элементов
            objs[1] = "Dos elemento puto!"; // Текст
            objs[2] = 3.141592; // Действительное число
            Console.WriteLine("После присваивания значений: ");

            for (int k = 0; k < objs.Length; k++)
            { // Проверка содержимого массива
                Console.WriteLine(k + ": " + objs[k]);
            }

            int[] nums = { 10, 20, 30 }; // Целочисленный массив.
            objs[2] = nums; // Переменная массива присваивается как значение элементу массива
            Console.WriteLine("Целочисленный массив");

            for (int i = 0; i < ((int[])objs[2]).Length; i++)
            { // Отображение элементов целочисленного массива
                Console.Write("{0, 3}", ((int[])objs[2])[i]);
            }
            Console.WriteLine();

            ((int[])objs[2])[1] = 0; // Новое значение элемента в целочисленном массиве
            Console.WriteLine("Еще раз тот же массив: "); // Отображение элементов целочисленного массива 
            for (int i = 0; i < nums.Length; i++)
            {
                Console.Write("{0, 3}", nums[i]);
            }
            Console.WriteLine();
        }
    }
}
