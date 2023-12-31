// Напишите программу, которая выводит случайное число из отрезка 
//[10, 99] и показывает наибольшую цифру числа.
//78 -> 8
//12-> 2
//85 -> 8

int FindBiggestDigit(int num)
{
    int ed = num % 10;
    int dec = num / 10;
   // string str = Convert.ToString(num);
    //str[0];
    //int ed = Convert.ToInt32(str[1]);
    //int dec = Convert.ToInt32(str[0]);
    if(ed > dec)
    {
        return ed;
    }
    else
    {
        return dec;
    }
}

int num = new Random().Next(10,100);
int result = FindBiggestDigit(num);
System.Console.WriteLine(FindBiggestDigit(num));
System.Console.WriteLine(num);

