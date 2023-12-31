// Напишите программу, которая будет преобразовывать десятичное число в двоичное.
// 45 -> 101101
// 3 -> 11
// 2 -> 10

int Prompt(string message)
{
    System.Console.Write(message);
    string value = Console.ReadLine();
    int request = Convert.ToInt32(value);
    return request;
}

string DecimalToBinary(int num)
{
    string result = string.Empty;
    while (num > 0)
    {
        result =  num % 2 + result;
        num /= 2;
    }
    return result;
}

string DecimalToThirdary(int num)
{
    string result = string.Empty;
    while (num > 0)
    {
        result = num % 3 + result;
        num /= 3;
    }
    return result;
}

string DecimalToFourthary(int num)
{
    string result = string.Empty;
    while (num > 0)
    {
        result = num % 4 + result;
        num /= 4;
    }
    return result;
}

string DecimalToFiveary(int num)
{
    string result = string.Empty;
    while (num > 0)
    {
        result = num % 5 + result;
        num /= 5;
    }
    return result;
}

string DecimalToSixary(int num)
{
    string result = string.Empty;
    while (num > 0)
    {
        result = num % 6 + result;
        num /= 6;
    }
    return result;
}

string DecimalToSevenary(int num)
{
    string result = string.Empty;
    while (num > 0)
    {
        result = num % 7 + result;
        num /= 7;
    }
    return result;
}

string DecimalToEightary(int num)
{
    string result = string.Empty;
    while (num > 0)
    {
        result = num % 8 + result;
        num /= 8;
    }
    return result;
}

string DecimalToNineary(int num)
{
    string result = string.Empty;
    while (num > 0)
    {
        result = num % 9 + result;
        num /= 9;
    }
    return result;
}

string DecimalToSixteenary(int num) // Данный метод вызывает вопросы после введения числа 160
{
    string result = string.Empty;
    while (num > 0)
    {
        if (num % 16 == 10) 
        {
            result = "A" + result;
            num /= 16;
        }
        if (num % 16 == 11)
        {
            result = "B" + result;
            num /= 16;
        }
        if (num % 16 == 12)
        {
            result = "C" + result;
            num /= 16;
        }
        if (num % 16 == 13)
        {
            result = "D" + result;
            num /= 16;
        }
        if (num % 16 == 14)
        {
            result = "E" + result;
            num /= 16;
        }
        if (num % 16 == 15)
        {
            result = "F" + result;
            num /= 16;
        }
        else
        {
            result = num % 16 + result;
            num /= 16;
        }
    }
    return result;
}

int num = Prompt("Введите любое число: ");
System.Console.WriteLine($"В двоичной системе счисления число {num} выглядит как: {DecimalToBinary(num)}");
System.Console.WriteLine($"В троичной: {DecimalToThirdary(num)}");
System.Console.WriteLine($"В четверичной: {DecimalToFourthary(num)}");
System.Console.WriteLine($"В пятеричной: {DecimalToFiveary(num)}");
System.Console.WriteLine($"В шестеричной: {DecimalToSixary(num)}");
System.Console.WriteLine($"В семеричной: {DecimalToSevenary(num)}");
System.Console.WriteLine($"В восьмеричной: {DecimalToEightary(num)}");
System.Console.WriteLine($"В девятеричной: {DecimalToNineary(num)}");
System.Console.WriteLine($"В шестнадцатеричной: {DecimalToSixteenary(num)}");
