// Напишите программу, которая будет принимать на вход 
// два числа и выводить, является ли второе число кратным первому. 
// Если второе число не кратно числу первому, 
// то программа выводит остаток от деления.
//
// 34, 5 -> не кратно, остаток 4
// 16, 4  -> кратно

void CheckMultiplicity(int num1, int num2) 
//описываем метод. Называть можем как угодно, 
//поэтому назовем его "Проверка на кратность и переведем на англ. В скобках задаем переменные - целые числа, 2шт
{ 
    if (num1 % num2 == 0)
    {
        System.Console.WriteLine($"{num1} кратно {num2}");
    }
    else
    {
        System.Console.WriteLine($"{num1} не кратно {num2} -> остаток {num1 % num2}");
    }
}
System.Console.WriteLine("Привет! Я проверяю кратность двух чисел друг другу");
System.Console.Write("Введи первое число: "); //выводит строку о запросе
int n1 = Convert.ToInt32(Console.ReadLine()); //считывает число и конвертит
System.Console.Write("Теперь второе: ");
int n2 = Convert.ToInt32(Console.ReadLine());

CheckMultiplicity(n1, n2);

System.Console.WriteLine("А теперь я хочу сгененировать свои 2 числа сама: ");
int num3 = new Random().Next(1,1000);
int num4 = new Random().Next(1,1000);
System.Console.WriteLine($"Вот я сгенерила первое число: {num3}");
System.Console.WriteLine($"А вот и второе мое число: {num4}");
System.Console.WriteLine("И сейчас я их по твоей задаче сама же и проверю, не уходи никуда...");

CheckMultiplicity(num3, num4);

