void WriteHello1(string someName)
{
    Console.WriteLine("Hello, " + someName);
}

void WriteHello2(string firstName, string lastName)
{
    Console.WriteLine("Hi, " + firstName + " " + lastName);
}

WriteHello1("Joe");
WriteHello1("Mary");
WriteHello2("Uncle", "Jackie! :)");