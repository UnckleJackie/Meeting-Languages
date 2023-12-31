// Напишите программу, которая по заданному номеру четверти, 
// показывает диапазон возможных координат точек в этой четверти (x и y).

void Findcoordinates(int quarter)
{
    if(quarter <= 4 && quarter >= 1)
    {
        if(quarter == 1)
        {
            System.Console.WriteLine("x+, y+");
        }        
        if(quarter == 2)
        {
            System.Console.WriteLine("x+, y-");
        }
        if(quarter == 3)
        {
            System.Console.WriteLine("x-, y-");
        }
        if(quarter == 4)
        {
            System.Console.WriteLine("x-, y+");
        }
       
    } 
    else
    {
         System.Console.WriteLine("Invalid Inpur");
    }
}

System.Console.WriteLine("Input quarter num: ");
int num = Convert.ToInt32(Console.ReadLine());

Findcoordinates(num);