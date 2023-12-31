class Person
{
    // Поля
    string firstName;
    string lastName;
    // Метод-конструктор для класса Person
    public Person()
    {
        firstName = "Johnny";
        lastName = "Rocket";
    }
    // Второй метод-конструктор
    public Person(string f, string l)
    {
        this.firstName = f;
        this.lastName = l;
    }
}

Person p = new Person("Petr", "Ivanov");
Console.WriteLine(p.lastName);