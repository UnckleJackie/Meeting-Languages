using System;

namespace _085_Суммируем_Значения_По_Диагонали_3_Мерного_Массива
{ // Суммировать значения по одной из диагоналей матрицы 3х3х3х
    class ThreeDMatrix
    {
        static void Main()
        {
            int[,,] m = new int[3, 3, 3];
            int sum = 0;
            int n = 1;

            for (int x = 0; x < 3; x++)
                for (int y = 0; y < 3; y++)
                    for (int z = 0; z < 3; z++)
                        m[x, y, z] = n++;
            sum = m[0, 0, 0] + m[1, 1, 1] + m[2, 2, 2];

            Console.WriteLine("Сумма значений по первой диагонали: " + sum);
        }
    }
}
