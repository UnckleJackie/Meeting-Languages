﻿using System;

namespace _080_Одномерный_Массив
{ // Продемонстрировать одномерный массив
    class ArrayDemo
    {
        static void Main()
        {
            int[] sample = new int[10];
            int i;

            for (i = 0; i < 10; i = i + 1)
                sample[i] = i;

            for (i = 0; i < 10; i = i + 1)
                Console.WriteLine("sample[" + i + "]: " + sample[i]);
        }
    }
}
