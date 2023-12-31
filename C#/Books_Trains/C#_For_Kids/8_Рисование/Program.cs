using System;
using System.Windows.Forms;
using System.Drawing;

namespace _8_Рисование
{
    class PictureDisplayer : Form
    {
        Bitmap image1;
        PictureBox pictureBox1;
        public PictureDisplayer()
        { // Метод-конструктор нашего класса
            // Указываем размеры и заголовок окна
            this.Text = "Алтай. Чуйский тракт";
            this.Size = new Size(320, 240);
            // Подготавливаем поле для размещения изображения
            pictureBox1 = new PictureBox();
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox1.BorderStyle = BorderStyle.Fixed3D;
            pictureBox1.ClientSize = new Size(300, 196);

            // Добавляем изображение в элемент PictureBox
            image1 = new Bitmap(@"C:\Дядя Женя\Деньги\Цели\01 Места Алтай Чуйский тракт.jpg");
            pictureBox1.Image = (Image)image1;

            // Добавляем PictureBox (с изображением) на форму 
            this.Controls.Add(pictureBox1);
        }
        /// <summary>
        ///  The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            // Создаем и запускаем форму
            Application.Run(new PictureDisplayer());
        }
    }
}