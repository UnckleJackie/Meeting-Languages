//  Задайте одномерный массив из 123 случайных чисел.
//Найдите количество элементов массива, значения которых лежат в
//отрезке [10,99].
//Пример для массива из 5, а не 123 элементов. В своём решении сделайте для 123
//[5, 18, 123, 6, 2] -> 1
//[1, 2, 3, 6, 2] -> 0
//[10, 11, 12, 13, 14] -> 5

int Prompt(string message)
{
    System.Console.Write(message);
    string readInput = System.Console.ReadLine();
    int request = Convert.ToInt32(readInput);
    return request;
}

int[] createArray(int size, int minValue, int maxValue)
{
    int[] array = new int[size];

    for (int i = 0; i < size; i++)
    {
        array[i] = new Random().Next(minValue, maxValue+1);
    }
    return array;
}

void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        System.Console.Write( array[i] + " ");
    }
}

int CountInRange(int minRange, int maxRange, int[] array) // мы передаем в скобках мин, макс диапазона и САМ МАССИВ для обработки!
{
    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if  (array[i] <= maxRange && array[i] >= minRange)
        {
            count++;
        }
    }
    return count;
}

int size = Prompt("Size of array: ");
int minValue = Prompt("min value: ");
int maxValue = Prompt("max value: ");
int minRange = Prompt("minimal number of range: ");
int maxRange = Prompt("maximum number of range: ");

int[] myArray = createArray(size, minValue, maxValue);
PrintArray(myArray);
System.Console.WriteLine();
System.Console.Write($"Количество чисел в диапазоне от {minRange} до {maxRange} составляет: ");
System.Console.WriteLine(CountInRange(minRange, maxRange, myArray));

int[] myArray2 = createArray(CountInRange(minRange, maxRange, myArray), minRange, maxRange);
PrintArray(myArray2);