package lessons;

public class Methods {
    public static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    public static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object)((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object)((Integer) a + (Integer) b);
        } else return 0;
    }

    public static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
