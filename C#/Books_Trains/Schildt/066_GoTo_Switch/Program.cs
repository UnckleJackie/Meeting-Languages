using System;

namespace _066_GoTo_Switch
{ // Применить оператор goto в операторе switch
    class Program
    {
        static void Main()
        {
            for (int i = 1; i < 5; i++)
            {
                switch(i)
                {
                    case 1:
                        Console.WriteLine("В ветви case 1");
                        goto case 3;
                    case 2:
                        Console.WriteLine("В ветви case 2");
                        goto case 1;
                    case 3:
                        Console.WriteLine("В ветви case 3");
                        goto default;
                    default:
                        Console.WriteLine("В ветви default");
                        break;
                }
                Console.WriteLine();
            }
            // goto case 1; // Ошибка! Безусловный переход к оператору switch недопустим
        }
    }
}
