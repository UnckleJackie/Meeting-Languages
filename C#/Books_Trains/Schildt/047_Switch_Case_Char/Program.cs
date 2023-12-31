using System;

namespace _047_Switch_Case_Char
{ // Использовать элементы типа char для управления оператором switch
    class SwitchDemo2
    {
        static void Main()
        {
            char ch;

            for (ch = 'A'; ch <= 'E'; ch++)
                switch (ch)
                {
                    case 'A':
                        Console.WriteLine("ch содержит A");
                        break;
                    case 'B':
                        Console.WriteLine("ch содержит B");
                        break;
                    case 'C':
                        Console.WriteLine("ch содержит C");
                        break;
                    case 'D':
                        Console.WriteLine("ch содержит D");
                        break;
                    case 'E':
                        Console.WriteLine("ch содержит E");
                        break;
                }
        }
    }
}
