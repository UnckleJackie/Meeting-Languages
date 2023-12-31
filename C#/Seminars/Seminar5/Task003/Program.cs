// Задайте массив. Напишите программу, которая
//определяет, присутствует ли заданное число в массиве.
//4; массив [6, 7, 19, 345, 3] -> нет
//-3; массив [6, 7, 19, 345, 3] -> да
int Prompt(string message)
{
    System.Console.Write(message);
    string readInput = System.Console.ReadLine();
    int result = Convert.ToInt32(readInput);
    return result;
}

int[] CreateRandomArray(int size, int minValue, int maxValue)
{
    int[] array = new int[size];

    for (int i = 0; i < size; i++)
    {
        array[i] = Prompt($"Input array[{i}]: ");
        //new Random().Next(minValue, maxValue+1);
    }
    return array;
}

void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        System.Console.Write(array[i] + " ");
    }
}

bool Find (int find, int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        if(array[i] == find) return true;
    }
    return false;
}

int size = Prompt("Задай размер массива: "); 
int min = Prompt("Минимальное число диапазона: ");
int max = Prompt("максимальное число диапазона: ");
int find = Prompt("Какое число ищем?: ");
int[] myArray = CreateRandomArray(size, min, max);
PrintArray(myArray);
System.Console.WriteLine();
System.Console.WriteLine(Find(find, myArray));