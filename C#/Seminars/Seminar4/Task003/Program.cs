// Напишите программу, которая
// принимает на вход число N и выдаёт
// произведение чисел от 1 до N.
// 4 -> 24
// 5 -> 120

// int Factorial(int N);
// {
//     int factorial = 1;
//     for (int i = 1; i <= N; i++);
//     {
//         factorial *= i;
//     }
//     return factorial;
// }

// int Prompt (string message)
// {
//     System.Console.WriteLine(message);
//     string value = Console.ReadLine();
//     int result = Convert.ToInt32(value);
//     return result;
// }

// Factorial(Prompt("Input N: "));

void Factorial(int N)
{
    int index = 1;
    int result = 1;
    while (index <= N)
    {
        result = result * index;
        index++;
    }
    System.Console.Write($"Произведение от 1 до {N} будет составлять ровно {result}. \nЭка! Крутяк, да? Сотку гони...");
}

int Prompt(string message)
{
    System.Console.WriteLine(message);
    int number = Convert.ToInt32(System.Console.ReadLine());
    return number;
}

Factorial(Prompt("Здравствуй, Гражданин! Введи число, я тебе фокус покажу, да: "));
