using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3_15_Использование_Инструкции_goto
{
    internal class GotoDemo
    {
        static void Main(string[] args)
        {
            int n = 10, k = 1, s = 0;
            Console.Write("Сумма 1 + 3 + 5 + ... + {0} = ", 2 * n - 1);
        mylabel: //Использование метки
            s += 2 * k - 1; // Добавляем слагаемое в сумму
            k++; // Изменение значения индексной переменной
            if (k <= n) goto mylabel; // Использование инструкции и переход к помеченному коду
            Console.WriteLine(s);
        }
    }
}
