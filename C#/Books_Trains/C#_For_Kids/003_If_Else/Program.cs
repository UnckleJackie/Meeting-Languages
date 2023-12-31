int NumberOfLegs(string animalName)
{
    if (animalName == "elephant") //Если название животного - слон
    {
        // Возвращаемое значение 4
        return 4;
    }
    else if (animalName == "hen") // Иначе, если животное - курица
    {
        // Возвращаемое значение 2
        return 2;
    }
    else if (animalName == "oister") // Иначе, если животное - устрица
    {
        // Возвращаемое значение 1
        return 1;
    }
    else // Иначе (при всех других условиях)
    {
        // Возвращаемое значение 0
        return 0;
    }
}

int i; // Переменная "i" будет хранить значение числа конечностей.
i = NumberOfLegs("hen");
    // Теперь i = 2, получив значение, возвращенное методом NumberOfLegs
Console.WriteLine("Hen has legs - " + i);
i = NumberOfLegs("monkey");
    // Теперь i = 0. Догадайтесь, почему!
Console.WriteLine("monkey has legs - " + i);
