using System;

namespace PRUEBA
{
    class MainClass
    {
        public static void Main(string[] args)
        {

            /* NOMBRE */
            Console.Write("Introduce tu nombre: ");
             String nombre = Console.ReadLine();
             Console.WriteLine("Hola " + nombre);

             Console.WriteLine("Dime tu edad:");
             int edad = int.Parse(Console.ReadLine());
             Console.WriteLine("tu edad es: " + edad);

             Console.WriteLine("Escribe un numero: ");
             double n = double.Parse(Console.ReadLine());

              for(int i = 1; i <= 10; i++) {
                 Console.WriteLine(n + " * "+i+" = " + (n*i) + "\t\t" +n+ " / "+i+" = "+(n/i));

             }

              /* RANDOM */

            Random r = new Random();

            int[] vector = new int[10];

            for(int i = 0; i < 10; i++) {
                vector[i] =(int)(r.NextDouble()*90) + 10;
                Console.WriteLine(vector[i]);
            }

            Array.Sort(vector);
            Console.WriteLine(" Ordenar: ");

            for(int i = 0; i < 10; i++)
            {
                Console.WriteLine(vector[i]);

            }




        }
    }
}
