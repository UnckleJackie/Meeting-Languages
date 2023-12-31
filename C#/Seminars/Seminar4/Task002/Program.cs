//Напишите программу, которая принимает
// на вход число и выдаёт количество цифр в числе.
// 456 -> 3
// 78 -> 2
// 89126 -> 5

// int DigitCount (int num)
// {
//     int count = 1;
//     while (Math.Abs(num) > 10)
//     {
//         num = num / 10;
//         count++;
//     }
//     return count;
// }
// System.Console.WriteLine("Input number: ");
// int num = Convert.ToInt32(Console.ReadLine);
// System.Console.WriteLine(DigitCount(num));


void DigitsAmount(int num)
{
    int index = 1;
    int result = 0;
    if (num < 0)
    {
        num = num * -1;
    }
    while (num / index >= 1)
    {
        result++;
        index = index * 10;
    }
    System.Console.Write($"Количество цифр в числе {num} составляет {result}. Эка! Крутяк, да?! Сотку гони...");
}

int Prompt(string message)
{
    System.Console.WriteLine(message);
    int number = Convert.ToInt32(System.Console.ReadLine());
    return number;
}
DigitsAmount(Prompt("Здравствуй, Гражданин! Введи число, я тебе фокус покажу, да: "));