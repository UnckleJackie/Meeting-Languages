using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_14_Цикл_for_Пятый_Пример_Использования
{
    internal class ForDemoFive
    {
        static void Main(string[] args)
        {
            int n = 10, k = 1, s = 0;
            Console.Write("Сумма 1 + 3 + 5 + ... {0} = ", 2 * n - 1);
            for (; ;)
            {
                s += 2 * k - 1;
                k++;
                if (k > n) break;
            }
            Console.WriteLine(s);
        }
    }
}
