using System;
using System.Windows.Forms;

class MyButtonClass: Form
{
    private Button mrButton;
    //�����-�����������
    public MyButtonClass()
    {
        mrButton = new Button();
        mrButton.Text = "Press me!";
        mrButton.Top = 100;
        mrButton.Left = 100;
        mrButton.Height = 50;
        mrButton.Width = 80;
        mrButton.Click += new System.EventHandler(MyButtonClickEventHandler);
        this.Controls.Add(mrButton);
    }
    //�������� �����
    static void Main()
    {
        Application.Run(new MyButtonClass());
    }
    // �����-���������� �������
    void MyButtonClickEventHandler(object sender, EventArgs e)
    {
        mrButton.Text = "You pressed me! Fucks!!!";
    }
}