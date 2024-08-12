package StructuresAndAlgoritmes_Lafore.Head_04.Stack;

public class StackX3 {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX3(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
