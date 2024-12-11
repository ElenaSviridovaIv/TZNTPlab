import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileReader;
public class Task2 {
    
public static void main(String[] args) {
   
  BufferedReader br = null;
  //создание файла1 с коорд и радиусом окружности-------------------------
    try {
  File CentrRadius = new File("CentrRadius.txt"); 
  if (!CentrRadius.exists())
      CentrRadius.createNewFile();
  
 // запись данных, введеных с консоли, в файл, данную часть можно опустить и тогда прога будет
// считывать из заранее созданного файла------------------------------ 
System.out.println("Введите координаты центра окружности через пробел, нажмите Enter");
Scanner input = new Scanner(System.in);
String a0b0 = input.nextLine();
System.out.println("Введите значение радиуса, нажмите Enter");
String R0 = input.nextLine();
  PrintWriter CR = new PrintWriter(CentrRadius);
  CR.println(a0b0);
  CR.println(R0+"\r\n");
  CR.close();
     
Scanner scanner = new Scanner(CentrRadius);
String Line = scanner.nextLine();
//переворачиваем 
String[] numbers = Line.split(" ");
int[] Coordinaty = new int[2];
int counter = 0;
// преобразовываем в числовой формат
for (String number : numbers){
    Coordinaty[counter++] = Integer.parseInt(number);}
  int aa = Coordinaty[0];
  int bb = Coordinaty[1];   
 int R = Integer.parseInt(R0);
 //int f = a+b+R;           
//System.out.println(f);

} catch(IOException e) {System.out.print("Error" + e);  } 

//-------------------------------------------------------------------------------------
//создание файла2 с координатами точек
try {
 File Tochka = new File("Tochka.txt"); 
 if (!Tochka.exists())
 Tochka.createNewFile();
 PrintWriter TT = new PrintWriter(Tochka);
 Scanner input2 = new Scanner(System.in); 
  
  Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во точек, нажмите Enter");
        int N = in.nextInt(); //Введите число с клавы(кол-во строк)
        int M = 2; //
        int[][] mass = new int[N][M]; //Создаем двухмерный массив
        System.out.println(); //Вывод на экран пустую строку
 

        
        for (int i = 0; i < mass.length; i++) { //создаем цикл
            for (int j = 0; j < mass[i].length; j++) { //создаем цикл в цикле
                System.out.print("Enter number in massive - "); //Вывод на экран
                int a = in.nextInt(); //Вводим число с клавы
                mass[i][j] = a; //Добаляем число в двухмерный массив
            }
        }
  for (int i = 0; i < mass.length; i++) { //создаем цикл
            for (int j = 0; j < mass[i].length; j++) { //создаем цикл в цикле
                //TT.println(mass[i][j] + " ");
                System.out.print(mass[i][j] + " "); //Вывод на экран массив через пробел
            }
            System.out.println(); //Вывод на экран
        }
  
    } catch(IOException e) 
            {System.out.print("Error" + e);  } 
  
}}
// P.S.: хотелось сделать красиво, чтобы прога была универсальная: могла создавать файл и в него же записывала данные,
// в противном случае это бы опускалось и данные считывались из уже готовых файлов, но не хватило времени




    
  
            
        
  

    
  



 