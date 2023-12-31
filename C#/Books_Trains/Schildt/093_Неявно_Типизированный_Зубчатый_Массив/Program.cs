using System;

namespace _093_Неявно_Типизированный_Зубчатый_Массив
{ // Продемонстрировать неявно типизированный зубчатый массив
    class Jagged
    {
        static void Main()
        {
            var jagged = new[]
            {
                new[] {1, 2, 3, 4 },
                new[] {9, 8, 7 },
                new[] {11, 12, 13, 14, 15 }
            };
            for (int j = 0; j < jagged.Length; j++)
            {
                for (int i = 0; i < jagged[j].Length; i++)
                    Console.Write(jagged[j][i] + " ");
                Console.WriteLine();
            }
        }
    }
}
