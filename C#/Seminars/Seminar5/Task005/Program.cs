//Найдите произведение пар чисел в одномерном массиве.
//Парой считаем первый и последний элемент, второй и предпоследний
//и т.д. Результат запишите в новом массиве.
//[1 2 3 4 5] -> 5 8 3
//[6 7 3 6] -> 12 10

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
    System.Console.WriteLine();
}

//Создаем массив и выводим его на печать




int size = Prompt("Size of array: ");
int minValue = Prompt("min value: ");
int maxValue = Prompt("max value: ");
// int minRange = Prompt("minimal number of range: ");
// int maxRange = Prompt("maximum number of range: ");

int[] myArray = createArray(size, minValue, maxValue);
PrintArray(myArray);

// Создаем метод, в котором производим операции суммирования
int Sum(int[] array) // мы передаем в скобках мин, макс диапазона и САМ МАССИВ для обработки!
{
    int count = 0;
    int sumOfPair = 0;
    for (int i = 0; i < array.Length / 2; i++)
    {
        sumOfPair += array[i] + array[array.Length -1 - i];
        count++;
    }
    return sumOfPair;
    System.Console.WriteLine();
    //System.Console.WriteLine(count);
}

int sumOfPairs = Sum(myArray);
System.Console.WriteLine($"Сумма пар чисел из массива равна {sumOfPairs}");
// System.Console.WriteLine();
// System.Console.Write($"Количество чисел в диапазоне от {minRange} до {maxRange} составляет: ");
// System.Console.WriteLine(CountInRange(minRange, maxRange, myArray));

// int[] myArray2 = createArray(CountInRange(minRange, maxRange, myArray), minRange, maxRange);
// PrintArray(myArray2);