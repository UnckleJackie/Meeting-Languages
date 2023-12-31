using System;

namespace _102_Метод_Substring
{ // Применить метод Substring()
    class Substr
    {
        static void Main()
        {
            string orgstr = "В C# упрощается обращение со строками.";
            // 
            string substr = orgstr.Substring(5, 20);

            Console.WriteLine("orgstr: " + orgstr);
            Console.WriteLine("substr: " + substr);
        }
    }
}
