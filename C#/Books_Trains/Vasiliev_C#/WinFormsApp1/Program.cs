using System;
using System.Windows.Forms;
using Microsoft.VisualBasic;
class HundredsDemo
{
    static void Main()
    {
        int number, hundreds; // ������������� ����������, ���������� ������ �����
        number = Int32.Parse(
            Interaction.InputBox( // ������� ��� ����� �����:
                "������� ����� �����: ", "���������� �����")); // ��������� ����
        hundreds = number / 100 % 10; // ������� ��� ���������� ���������� �����
        string txt = "� ���� ����� " + hundreds + " �����!";
        MessageBox.Show(txt, "�����"); // ����������� ���� � ����������
    }
}