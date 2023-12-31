using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _001_Буткемп
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = 5;
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("[" + string.Join(" ", array) + "]");
            Console.WriteLine(array[3]);
            // Сложность алгоритма О(1)
            // [4, 5, 3, 1, 2] - чтобы выяснить сумму операций,
            // необходимо 5 операций или О(п)
            // [1, 2, 3, 4, 5] = O(n + lg n) - поиск в отсортированном массиве
            // ((5 + 1) / 2) * 5 = О(1)

            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += array[i];
            Console.WriteLine("Сумма: "sum); // O(n)
        }
    }
}
