// Задайте массив из 12 элементов, заполненный
//случайными числами из промежутка [-9, 9]. Найдите сумму
//отрицательных и положительных элементов массива.
//Например, в массиве [3,9,-8,1,0,-7,2,-1,8,-3,-1,6] сумма
//положительных чисел равна 29, сумма отрицательных равна -20.

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

int size = Prompt("Size of array: ");
int minValue = Prompt("min value: ");
int maxValue = Prompt("max value: ");
int[] myArray = createArray(size, minValue, maxValue);
PrintArray(myArray);

void SelectionSort(int[] array)
{
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < array.Length - 1; i++)
    {
        if (array[i] > 0)
        {
            sum1 += array[i];
        }
        else
        {
            sum2 += array[i];
        }
    }
    System.Console.WriteLine();
    System.Console.WriteLine($"Сумма положительных элементов равна {sum1}");
    System.Console.WriteLine($"Сумма отрицательных элементов равна {sum2}");
}
SelectionSort(myArray);

// Попытаюсь создать другой массив, опираясь на первый
int[] createArray2(int [] arrayForCheck)
{
    int sizeOfArray = arrayForCheck.Length;
    int[] array = new int[sizeOfArray];

    for (int i = 0; i < sizeOfArray/2; i++)
    {
        array[i] = myArray[i] + myArray[sizeOfArray - i - 1];
    }
    return array;
}

int[] myArray2 = createArray2();
PrintArray(myArray2);