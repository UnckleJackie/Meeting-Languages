/*
Это простая программа на C#.
Назовем ее Example.cs
*/

using System;
//class Example 
//{
//	// Любая программа на C# начинается с вызова метода Main().
//	static void Main()
//	{
//		Console.WriteLine("Первая программа на C#.");
//	}
//}
class Circle
{
	static void Main()
	{
		double radius;
		double area;
		radius = 10.0;
		area = radius * radius * 3.1416;
		Console.WriteLine("Площадь круга равна " + area);
	}
}