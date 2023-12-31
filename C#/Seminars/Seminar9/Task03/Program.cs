// Задайте значения m, n и выведите все значения от n до m

void ShowNumbers(int n, int m)
{

    if (n != m)
    {
        if (n > m)
        {
            ShowNumbers(n - 1, m);
            Console.Write(n + ", ");
        }
        else 
        {
            ShowNumbers(n, m - 1);
            Console.Write(m + ", ");
        }
    }
    else 
        {
            System.Console.Write(n + ", ");
        }       
}

System.Console.WriteLine("Введите m: ");
int m = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Введите n: ");
int n = Convert.ToInt32(Console.ReadLine());
ShowNumbers(n, m);
