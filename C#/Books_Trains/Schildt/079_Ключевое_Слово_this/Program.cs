using System;

namespace _079_Ключевое_Слово_this
{ // однако, в данной программе this можно опустить и ничего не изменится
    class Rect
    {
        public int Width;
        public int Height;

        public Rect(int w, int h)
        {
            this.Width = w;
            this.Height = h;
        }

        public int Area()
        {
            return this.Width * this.Height;
        }
    }
    class UseRect
    {
        static void Main()
        {
            Rect r1 = new Rect(4, 5);
            Rect r2 = new Rect(7, 9);

            Console.WriteLine("r1: " + r1.Area());
            Console.WriteLine("r2: " + r2.Area());
        }
    }
}
