// Напишите программу, которая принимает на вход координаты 
//двух точек и находит расстояние между ними в 2D пространстве.
// A (3,6); B (2,1) -> 5,09
// A (7,-5); B (1,-1) -> 7,21

//Если смотреть на плоскость, то увидим вот что:
//По теореме Пифагора квадрат расстояния = (x2 - x1)^2 + (y2 - y1)^2
//Соответственно, расстояние = корень из (x2 - x1)^2 + (y2 - y1)^2

// double FindDistance(double xa, double ya, double xb, double yb);
// {
//     //System.Console.WriteLine("Подумаем, как нам прописать здесь данную формулу, а именно - квадратный корень из суммы разниц координат каждой точки");
//     return Math.Sqrt(Math.Pow(xa - xb ,2) + Math.Pow(ya - yb ,2));
// }

System.Console.WriteLine("Input xa coord: ");
int xa = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Input xb coord: ");
int xb = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Input ya coord: ");
int ya = Convert.ToInt32(Console.ReadLine());
System.Console.WriteLine("Input yb coord: ");
int yb = Convert.ToInt32(Console.ReadLine());

// System.Console.WriteLine(FindDistance(xa, ya, xb, yb));

