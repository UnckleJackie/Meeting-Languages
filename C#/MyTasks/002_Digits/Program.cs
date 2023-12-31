// Напишите программу, которая выводит случайное число из отрезка 
//[10, 99] и показывает наибольшую цифру числа.
//78 -> 8
//12-> 2
//85 -> 8

int FindBiggestDigit(int num)
    // называем метод с англ "ИщемМаксимальныйРазряд" 
    // Почему int? Потому что метод ВОЗВРАЩАЕТ целые числа, и их надо куда-то 
    //записать или передать!
{
   int hunTh = num / 100000;
   int decTh = ( num - hunTh * 100000) / 10000;
   int th = ( num - hunTh * 100000 - decTh * 10000) / 1000;
   int hun = ( num - hunTh * 100000 - decTh * 10000 - th * 1000) / 100; 
   int dec = ( num - hunTh * 100000 - decTh * 10000 - th * 1000 - hun * 100 ) / 10; //Ура! Я вычислил, как десятки находить
   int ed = num % 10;
   int max = ed;
//     if(dec > ed) max = dec;
//     if(hun > dec) max = hun;
//    string str = Convert.ToString(num); str[0]; int ed = Convert.ToInt32(str[1]); int dec = Convert.ToInt32(str[0]);
   if(dec > max) max = dec;
   if(hun > max) max = hun;
   if(th > max) max = th;
   if(decTh > max) max = decTh;
   if(hunTh > max) max = hunTh;
       return max;
}


int num = new Random().Next(1,999999+1);
int hun = num / 100;
int dec = ( num - hun * 100 ) / 10;
int ed = num % 10;
int result = FindBiggestDigit(num); 
System.Console.WriteLine(" - Хозяин, я слышал, что мерзкие бюрократы помешали твоему спокойствию и решили проверить твои несомненно наипрекраснейшие знания по математике и логике.");
System.Console.WriteLine("Я взял на себя смелость выбрать двух лучших рабов, один спец по загадыванию небольших чисел, а другой хорошо играл в карты до попадания в кабалу:");
System.Console.WriteLine(" - Босс, я раб Джимми, буду сейчас принимать число от другого раба, для того, чтобы сделать с ним операции, которые позволят решить твою задачу");
System.Console.WriteLine(" - Масса, я раб Гжушпешт. И сейчас я загадываю число от 1 до миллиона.....");
System.Console.WriteLine(" - Загадал?");
System.Console.WriteLine(" - Да");
System.Console.WriteLine(" - Так говори, сам-то он не отгадает!!!");
System.Console.WriteLine($" - А, простите, это число {num}");
System.Console.WriteLine($" - Босс, смотри, число этого ничтожества включает в себя много разных цифр, но очевидно, что наибольшим является {result}");
System.Console.WriteLine();
System.Console.WriteLine("[Босс]:   Хм... А вы весьма и весьма неглупые ребята... И как можно было так попасть с вашей-то сообразительностью...");
System.Console.WriteLine();
System.Console.WriteLine();
System.Console.WriteLine();



// int FindBiggest Digit(int arg1, int arg2, int arg3)
// {
//     int result = arg1; //Таким образом у нас появляется вспомогательный механизм,
//     if (arg2 > result) result = arg2; //который ищет максимум из трех чисел
//     if (arg3 > result) result = arg3;
//     return result;
// }

// int a1 = 15;
// int b1 = 21;
// int c1 = 39;
// int a2 = 12;
// int b2 = 323;
// int c2 = 33;
// int a3 = 13;
// int b3 = 23;
// int c3 = 33;
//заводим отдельные переменные "полуфиналистов"
//int max1 = Max(a1, b1, c1);
//int max2 = Max(a2, b2, c2);
//int max3 = Max(a3, b3, c3); //далее устраиваем окончательный финал:
//int max = Max(max1, max2, max3);//выводим в консоль:

// int max = Max(Max(a1, b1, c1), Max(a2, b2, c2), Max(a3, b3, c3));

// System.Console.WriteLine(max);