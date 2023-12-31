using System;

namespace _033_Поразрядный_Оператор_И
{
    class MakeEven
    { // Применить поразрядный оператор И, чтобы сделать число четным
        static void Main()
        {
            ushort num;
            ushort i;

            for (i = 1; i <= 10; i++)
            {
                num = i;
                Console.WriteLine("num: " + num);
                num = (ushort)(num & 0xFFFE);
                Console.WriteLine("num после сброса младшего разряда: " + num + "\n");
            }
        }
    }
}
