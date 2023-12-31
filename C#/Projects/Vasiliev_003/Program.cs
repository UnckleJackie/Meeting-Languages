using System;
class InputConsoleDemo
{
    static void Main()
    {
        string name; // Текстовая переменная
        Console.Title = "Let's meet..."; // Заголовок в консоли
        Console.WriteLine("What's your name, homie?"); // Сообщение в консоли
        name = Console.ReadLine(); // Считывание текста
        string txt = "I'm pleased to meet you, " + name + "!"; // Еще одна текстовая переменная
        Console.Title = "Meeting has done! Great!"; // Заголовок консольного окна
        Console.WriteLine(txt); // Сообщение в консоли
    }
}