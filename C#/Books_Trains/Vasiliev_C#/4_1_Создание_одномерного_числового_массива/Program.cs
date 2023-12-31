using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4_1_Создание_одномерного_числового_массива
{
    internal class CharArrayDemo
    {
        static void Main(string[] args)
        { // Массив заполняем числами, которые при делении на 3 дают остаток 1
            int[] nums = new int[12];
            for (int i = 0; i < nums.Length; i++)
            {
                nums[i] = 3 * i + 1;
                Console.Write("| " + nums[i] + " ");
            }
            Console.WriteLine("|");
        }
    }
}
