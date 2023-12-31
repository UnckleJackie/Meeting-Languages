// Напишите программу, которая принимает на вход число (А) и выдаёт 
// сумму чисел от 1 до А.
// 7 -> 28
// 4 -> 10
// 8 -> 36

void Amount(int A)
{
    int index = 0;
    int result = 0;
    while (index <= A)
    {
        result = result + index;
        index++;
    }
    System.Console.Write($"Сумма от 1 до {A} будет составлять ровно {result}. \nЭка! Крутяк, да? Сотку гони...");
}

int Prompt(string message)
{
    System.Console.WriteLine(message);
    int number = Convert.ToInt32(System.Console.ReadLine());
    return number;
}
Amount(Prompt("Здравствуй, Гражданин! Введи число, я тебе фокус покажу, да: "));