using System;
using Microsoft.VisualBasic;
using System.Windows.Forms;
class EnteringInteger
{
    static void Main()
    {
        string res, txt; // ��������� ����������
        int year = 2023, age, born; // ������������� ����������
        res = Interaction.InputBox("� ����� ���� �� ��������?", "��� ��������");
        // ����������� ���� � ����� �����
        born = Int32.Parse(res); // �������������� ������ � �����
        age = year - born; // ���������� ��������
        txt = "����������, ��� ��� " + age + " ���"; // ���� � ����������:
        MessageBox.Show(txt, "�������");
    }
}
