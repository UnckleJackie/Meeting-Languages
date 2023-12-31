using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_8_Еще_пример_использования_while
{
    internal class AnotherWhileDemo
    {
        static void Main(string[] args)
        {// Количество слагаемых в сумме и значение суммы
            int n = 10, s = 0;
            Console.Write("Сумма 1 + 3 + 5 + ... + {0} = ", 2 * n - 1);

            while (n > 0)
            {
                s += 2 * n - 1; // Добавляем слагаемое в сумму
                n--; // Новое значение переменной
            }
            Console.WriteLine(s);
        }
    }
}
