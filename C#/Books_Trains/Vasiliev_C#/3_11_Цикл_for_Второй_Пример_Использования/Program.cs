using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_11_Цикл_for_Второй_Пример_Использования
{
    internal class ForDemoTwo
    {
        static void Main(string[] args)
        {
            int n = 10, s = 0;
            Console.Write("Сумма 1 + 3 + 5 + ... + {0} = ", 2 * n - 1);

            for (int k = 1; k <= n; k++)
            {
                s += 2 * k - 1;
            }
            Console.WriteLine(s);
        }
    }
}
