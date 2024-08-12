package head_14.program_098;

public class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] o) {
        coords = o;
    }
    static void showXY(Coords<?> c) {
        System.out.println("Coords X Y: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Coords X Y Z:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " +
                    c.coords[i].y + " " + c.coords[i].z);
        System.out.println();
    }
    static void showAll(Coords<? extends FourD> c) {
        System.out.println("Coords X Y Z T: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " +
                    c.coords[i].z + " " + c.coords[i].t);
        System.out.println();
    }
    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };
        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        System.out.println("Content of tdlocs.");
        showXY(tdlocs);
        // showXYZ(tdlocs);
        // showAll(tdlocs);
        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };
        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        System.out.println("Content of fdlocs.");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
