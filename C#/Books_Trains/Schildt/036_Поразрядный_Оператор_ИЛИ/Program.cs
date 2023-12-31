using System;

namespace _036_Поразрядный_Оператор_ИЛИ
{
    class MakeOdd
    { // Применить поразрядный оператор ИЛИ, чтобы сделать число нечетным
        static void Main()
        {
            ushort num;
            ushort i;

            for (i = 1; i <= 10; i++)
            {
                num = i;
                Console.WriteLine("num: " + num);
                num = (ushort)(num | 1);
                Console.WriteLine("num после установки младшего разряда: ", +num + "\n");
            }
        }
    }
}
