using System;
class NestedIfDemo
{
    static void Main()
    {
        string txt;
        Console.WriteLine("Введите текст: ");
        txt = Console.ReadLine();

        if (txt != "")
        {
            Console.WriteLine("Спасибо, что ввели текст!");
            if (txt.Length > 10)
            {
                Console.WriteLine("Ого, как много букаф ипать!");
            }
            else
            {
                Console.WriteLine("А че как мало, йопт!?");
            }
        }
        else
        {
            Console.WriteLine("Че, глухой шоле?");
        }
    }
}