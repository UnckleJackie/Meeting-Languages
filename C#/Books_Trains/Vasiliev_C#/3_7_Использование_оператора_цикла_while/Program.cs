using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_7_Использование_оператора_цикла_while
{
    internal class WhileDemo
    {
        static void Main(string[] args)
        {
            int n = 10, k = 1, s = 0;
            Console.Write("Сумма 1 + 3 + 5 + ... + {0} = ", 2 * n - 1); // вместо {0} подставляется значение выражения после запятой
            while (k <= n)
            {
                s += 2 * k - 1;
                k++;
            }
            Console.WriteLine(s);
        }
    }
}
