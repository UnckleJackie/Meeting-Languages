package program_005;

public class MyClass {
    public int numOne;
    public long numTwo;

    public void myMethod() {
        this.numOne = this.numOne + 1;
        numTwo++;
    }

    public boolean goCompare (MyClass mc) { return mc == this; }

    @Override
    public String toString() {
        return "program_005.MyClass { numOne = " + numOne + ", numTwo = " + numTwo + " }";
    }
}
