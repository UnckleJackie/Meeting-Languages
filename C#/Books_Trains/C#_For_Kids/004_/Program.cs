class animalName
{
    // Поля
    public string kindOfAnimal;
    public string name;
    public int numberOfLegs;
    public int height;
    public int length;
    public string color;
    bool hasTail;
    protected bool isMammal;
    private bool spellingCorrect;
    // Методы
    // Открытый метод, получающий информацию о том, чем питается животное
    public string GetFoodInfo()
    {
        // Представим, что здесь расположен код для проверки правописания
        ...
    }
    // Защищенный метод, определяет существование данного вида животного
    protected bool IsValidAnimalType()
    {
        // код для проверки существующих видов животных
        ...
    }
}

class Zoo
{
    Animal a = new Animal ();
    a.name = "Kangaroo";
    string food;
    bool animalExists;
    // Следующий код будет выполнен успешно, поскольку классу "Zoo" разрешено 
    // обращаться к открытым методам в классе "Animal"
    food = a.GetFoodInfo(); // Вызов открытого метода
    // Обе следующие строки НЕ будут выполнены, поскольку классу "Zoo"
    // не разрешено обращаться к закрытым или защищенным методам
    a.spellingCorrect(); // Попытка вызова закрытого метода
    animalExists = a.IsValidAnimalType(); // Попытка вызова защищенного метода
}
