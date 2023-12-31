using System;

namespace _089_Применение_Свойства_Length
{ // Использовать свойство Length массива
    class LengthDemo
    {
        static void Main()
        {
            int[] nums = new int[10];
            Console.WriteLine("Длина массива nums равна " + nums.Length);

            // Использовать свойство Length для инициализации массива nums
            for (int i = 0; i < nums.Length; i++)
                nums[i] = i * i;

            // А теперь воспользоваться свойством Length для вывода
            // содержимого массива nums
            Console.Write("Содержимое массива nums: ");
            for (int i = 0; i < nums.Length; i++)
                Console.Write(nums[i] + " ");
            Console.WriteLine();
        }
    }
}
