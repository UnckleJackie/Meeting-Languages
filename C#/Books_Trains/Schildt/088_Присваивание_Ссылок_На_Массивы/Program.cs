﻿using System;

namespace _088_Присваивание_Ссылок_На_Массивы
{ // Присваивание ссылок на массивы
    class AssignARef
    {
        static void Main()
        {
            int i;

            int[] nums1 = new int[10];
            int[] nums2 = new int[10];

            for (i = 0; i < 10; i++) nums1[i] = i;

            for (i = 0; i < 10; i++) nums2[i] = -i;
            Console.Write("Содержимое массива nums1: ");

            for (i = 0; i < 10; i++)
                Console.Write(nums1[i] + " ");
            Console.WriteLine();

            Console.Write("Содержимое массива nums2: ");
            for (i = 0; i < 10; i++)
                Console.Write(nums2[i] + " ");
            Console.WriteLine();

            nums2 = nums1; // Теперь nums2 ссылается на nums1

            Console.Write("Содержимое массива nums2\n" + "после присваивания: ");
            for (i = 0; i < 10; i++)
                Console.Write(nums2[i] + " ");
            Console.WriteLine();

            // Далее оперировать массивом nums1 посредством переменной
            // ссылки на массив nums2
            nums2[3] = 99;

            Console.Write("Содержимое массива nums1 после изменения\n" +
                "посредством переменной nums2: ");
            for (i = 0; i < 10; i++)
                Console.Write(nums1[i] + " ");
            Console.WriteLine();
        }
    }
}
