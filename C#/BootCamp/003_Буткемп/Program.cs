public static class Sorting
{
    public static int[] SortSelection(this int[] collection)
    {
        int size = collection.Length;

        for (int i = 0; i < size - 1; i++)
        {
            int pos = i;
            for (int j = i + 1; j < size - 1; j++)
            {
                if (collection[j] > collection[pos]) pos = j;
            }
            int temp = collection[i];
            collection[i] = collection[pos];
            collection[pos] = temp;
        }
        return collection;
    }

    static void Main();
    {
    var arr[] = new int[] { 9, 6, 8, 5, 7, 3, 1, 2, 0 };
    Console.WriteLine(string.Join(' ', arr));
        SortSelection(arr);
    Console.WriteLine(string.Join(' ', arr));
    }
    /// <summary>
    /// Сортировка методом пузырька (Оптимизированная)
    /// </summary>
    /// <param name="collection">Исходный массив</param>
    /// <returns>Отсортированный массив массив</returns>
   /* public static int[] SortBubbleOptimized(this int[] collection)
    {
        int size = collection.Length;

        for (int current = 0; current < size - 1; current++)
        {
            for (int i = 0; i < size - 1 - current; i++)
            {
                if (collection[i] > collection[i + 1])
                {
                    int temp = collection[i];
                    collection[i] = collection[i + 1];
                    collection[i + 1] = temp;
                }
            }
        }
        return collection;
    }*/
}
