using System;

namespace _083_Превышение_Границ_Массива
{ // Продемонстрировать превышение границ массива
    class ArrayErr
    {
        static void Main()
        {
            int[] sample = new int[10];
            int i;

            // Воссоздать превышение границ массива
            for (i = 0; i < 100; i = i + 1)
                sample[i] = i;
        }
    }
}
