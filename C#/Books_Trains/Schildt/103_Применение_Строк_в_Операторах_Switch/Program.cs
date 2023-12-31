using System;

namespace _103_Применение_Строк_в_Операторах_Switch
{ // Продемонстрировать управление оператором switch посредством строк
    class StringSwitch
    {
        static void Main()
        {
            string[] strs = { "один", "два", "три", "два", "один" };

            foreach (string s in strs)
            {
                switch (s)
                {
                    case "один":
                        Console.Write(1);
                        break;
                    case "два":
                        Console.Write(2);
                        break;
                    case "три":
                        Console.Write(3);
                        break;
                }
            }
            Console.WriteLine();
        }
    }
}
