using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_12_Цикл_for_Третий_Пример_Использования
{
    internal class ForDemoThree
    {
        static void Main(string[] args)
        {
            int n = 10, k, s;
            Console.Write("Сумма 1 + 3 + 5 + ... + {0} = ", 2 *  n - 1);
            for (k = 1, s = 0; k <= n; s += 2 * k - 1, k++) ;
            Console.WriteLine(s);
        }
    }
}
