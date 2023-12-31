using System;

namespace _077_Конструктор_В_Классе_Building
{ // Добавить конструктор в класс Building

    class Building
    {
        public int Floors;      // количество этажей
        public int Area;        // общая площадь здания
        public int Occupants;   // количество жильцов

        // Параметризированный конструктор для класса Building
        public Building(int f, int a, int o)
        {
            Floors = f;
            Area = a;
            Occupants = o;
        }

        // Возвратить площадь на одного человека
        public int AreaPerPerson()
        {
            return Area / Occupants;
        }

        // Возвратить макс кол-во чел, исходя из заданной мин площади на человека
        public int MaxOccupant(int minArea)
        {
            return Area / minArea;
        }
    }

    // Использовать параметризированный конструктор класса Building
    class BuildingDemo
    {
        static void Main()
        {
            Building house = new Building(2, 2500, 4);
            Building office = new Building(3, 4200, 250);

            Console.WriteLine("Максимальное количество человек в доме\n" +
                "если на каждого должно приходиться " +
                300 + " кв. футов: " + house.MaxOccupant(300));

            Console.WriteLine("Максимальное количество человек в учреждении\n" +
                "если на каждого должно приходиться " +
                300 + " кв. футов: " + office.MaxOccupant(300));
        }
    }
}
