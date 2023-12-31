using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_10_Цикл_for
{
    internal class ForDemo
    {
        static void Main(string[] args)
        {
            int n = 10, k, s = 0;
            Console.Write("Сумма 1 + 3 + 5 + ... + {0} = ", 2 * n - 1);

            for (k = 1; k <= n; k++)
            {
                s += 2 * k - 1;
            }
            Console.WriteLine(s);
        }
    }
}
