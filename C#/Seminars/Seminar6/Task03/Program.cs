// Напишите программу, которая принимает на вход три числа и проверяет, 
// может ли существовать треугольник с сторонами такой длины.

int Prompt(string message)
{
    System.Console.Write(message);
    string value = Console.ReadLine();
    int request = Convert.ToInt32(value);
    return request;
}

int num1 = Prompt("Введите первую сторону: ");
int num2 = Prompt("Введите вторую сторону: ");
int num3 = Prompt("Введите третью сторону: ");

bool Triangle (int number1, int number2, int number3)
{
    if(number1 < number2 + number3 
    && number2 < number1 + number3 
    && number3 < number1 + number2) return true;
    else return false;
}

if (Triangle(num1, num2, num3) == true) 
{
    System.Console.WriteLine("Треугольник с такими сторонами вполне себе существует");
}
else
{
    System.Console.WriteLine("Нет, такому треугольнику в природе не бывать!");
}


//Console.WriteLine(Triangle(num1, num2, num3));