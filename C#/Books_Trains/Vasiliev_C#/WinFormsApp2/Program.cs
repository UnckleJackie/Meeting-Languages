using System;
class NestedIfDemo
{
    static void Main()
    {
        string txt;
        Console.WriteLine("������� �����: ");
        txt = Console.ReadLine();

        if (txt != "")
        {
            Console.WriteLine("�������, ��� ����� �����!");
            if (txt.Length > 10)
            {
                Console.WriteLine("���, ��� ����� ����� �����!");
            }
            else
            {
                Console.WriteLine("� �� ��� ����, ����!?");
            }
        }
        else
        {
            Console.WriteLine("��, ������ ����?");
        }
    }
}