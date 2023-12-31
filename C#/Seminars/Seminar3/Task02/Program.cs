// Напишите программу, которая принимает на вход координаты двух точек и 
// находит расстояние между ними в 2D пространстве.

//A (3,6); B (2,1) -> 5,09
//A (7,-5); B (1,-1) -> 7,21
void Method()
{
System.Console.WriteLine("Input xa coord: ");
double xa = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Input ya coord: ");
double ya = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Input xb coord: ");
double xb = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Input yb coord: ");
double yb = Convert.ToInt32(Console.ReadLine());

double num = Math.Round(Math.Sqrt(Math.Pow(xa - xb ,2) + Math.Pow(ya - yb ,2)), 2);
System.Console.WriteLine($"A ({xa}, {ya}), B ({xb}, {yb} Расстояние между точками = {num}");
//Math.Round - ограничение кол-ва знаков после запятой
}
Method();

// System.Console.WriteLine("Input xa coord: ");
// int xa = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Input xb coord: ");
// int xb = Convert.ToInt32(Console.ReadLine());
// double xa1 = Math.Sqrt(xa);
// System.Console.WriteLine("Input ya coord: ");
// int ya = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Input yb coord: ");
// int yb = Convert.ToInt32(Console.ReadLine());
// double kat1 = Math.Pow(xa - xb, 2);
// System.Console.WriteLine($"Квадрат катета по x = {kat1}");


// int yb = Convert.ToInt32(Console.ReadLine());
// double xa1 = Math.Sqrt(xa);
// System.Console.WriteLine($"Квадратный корень xa = {xa1}");
// double xa2 = Math.Pow(xa, 2);
// System.Console.WriteLine($"Квадрат xa = {xa2}");
// double xa3 = Math.Sqrt(Math.Pow(xa, 2));
// System.Console.WriteLine($"Корень из Квадрата xa = {xa3}");
// double xb1 = Math.Sqrt(xb);
// System.Console.WriteLine($"Квадратный корень xb = {xb1}");
// double xb2 = Math.Pow(xb, 2);
// System.Console.WriteLine($"Квадрат xb = {xb2}");
// double xb3 = Math.Sqrt(Math.Pow(xb, 2));
// System.Console.WriteLine($"Корень из Квадрата xb = {xb3}");

// Напишите программу, которая принимает на вход координаты 
//двух точек и находит расстояние между ними в 2D пространстве.
// A (3,6); B (2,1) -> 5,09
// A (7,-5); B (1,-1) -> 7,21

//Если смотреть на плоскость, то увидим вот что:
//По теореме Пифагора квадрат расстояния = (x2 - x1)^2 + (y2 - y1)^2
//Соответственно, расстояние = корень из (x2 - x1)^2 + (y2 - y1)^2

// double FindDistance(double xa, double ya, double xb, double yb);
// {
//     return Math.Sqrt(Math.Pow(xa - xb ,2) + Math.Pow(ya - yb ,2));
// }

// System.Console.WriteLine("Input xA coord: ");
// int xa = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Input xB coord: ");
// int xb = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Input yA coord: ");
// int ya = Convert.ToInt32(Console.ReadLine());
// System.Console.WriteLine("Input yB coord: ");
// int yb = Convert.ToInt32(Console.ReadLine());

// System.Console.WriteLine(FindDistance(xa, ya, xb, yb));