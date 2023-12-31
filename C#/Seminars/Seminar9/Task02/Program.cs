// Напишите программу, которая будет принимать на вход число и
// возвращать сумму его цифр

int FindSum(int num)
{
    if (num > 0)
    {
        return FindSum(num / 10) + num % 10;
    }
    else return num;
}

System.Console.WriteLine(FindSum(45674774));