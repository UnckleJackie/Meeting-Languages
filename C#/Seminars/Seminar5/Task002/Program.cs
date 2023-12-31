// Напишите программу замена элементов
//массива: положительные элементы замените на
//соответствующие отрицательные, и наоборот.
//[-4, -8, 8, 2] -> [4, 8, -8, -2] 
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
        array[i] = new Random().Next(minValue, maxValue+1);
        //Prompt($"Input array[{i}]: ");
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

int[] ChangeElements (int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = array[i] * -1;
    }
    return array;
}

int size = Prompt("Задай размер массива: "); 
int min = Prompt("Минимальное число диапазона: ");
int max = Prompt("максимальное число диапазона: ");
//int find = Prompt("Какое число ищем?: ");
int[] myArray = CreateRandomArray(size, min, max);
PrintArray(myArray);
System.Console.WriteLine();
int[] myArray1 = ChangeElements(myArray);
PrintArray(myArray1);
System.Console.WriteLine();
//System.Console.WriteLine(Find(find, myArray));