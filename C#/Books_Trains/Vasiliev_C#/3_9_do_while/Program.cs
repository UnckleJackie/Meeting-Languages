using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_9_do_while
{
    internal class DoWhileDemo
    {
        static void Main(string[] args)
        {
            int n = 10, k = 1, s = 0;
            Console.Write("Сумма 1 + 3 + 5 + ... + {0} = ", 2 * n - 1);

            do
            {
                s += 2 * k - 1;
                k++;
            }
            while (k <= n);
            Console.WriteLine(s);
        }
    }
}
