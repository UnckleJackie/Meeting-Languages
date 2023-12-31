// Напишите программу, которая принимает на вход число и проверяет, 
//кратно ли оно одновременно 7 и 23.

//14  ->  нет
///46  ->  нет
//161 ->  да

bool Multiplicity (int num)
{
    if(num % 7 == 0 && num % 23 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

System.Console.Write("Input num: ");
int num = Convert.ToInt32(Console.ReadLine());
bool result = Multiplicity(num);
System.Console.WriteLine(result);
