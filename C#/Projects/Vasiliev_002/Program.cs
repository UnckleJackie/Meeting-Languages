// ���������� ������� Visual Basic:
using Microsoft.VisualBasic;
using System.Windows.Forms;
class InputDialogDemo
{
    static void Main()
    {
        // ��������� ����������:
        string name;
        // ����������� ���� � ����� �����:
        name = Interaction.InputBox(
            "��� ��� �����?", // ����� ��� ����� �����
            "������� ������������..."); // �������� ����
        // ��� ���� ��������� ����������:
        string txt = "����� �������, " + name + "!";
        // ���� � ����������:
        MessageBox.Show(txt, "���������� ����������");
    }
}