using System;
using System.Collections.Generic;
using CBingo;
using Gtk;


namespace CBingo
{

    public partial class Carton : Gtk.Window
    {

        /* Tamaño de la raiz*/
        private static uint rows = 4; // CANTIDAD DEL BOMBO
        private static uint columns = 7;

        private IList<Button> buttons = new List<Button>();
        private int[] hastalos = new int[90];
        private int[] botones = new int[28];
        private Button[] but = new Button[28];
        private IList<int> NCarton = new List<int>();
        private Random r = new Random();


        public Carton() :
                base(Gtk.WindowType.Toplevel)
        {
            Build();
            for (int numero = 0; numero < 90; numero++)
            { // CANTIDAD DE NUMEROS PARA EL CARTON
                NCarton.Add(numero+1);
                hastalos[numero] = numero+1;

            }

            for(int i = 0; i < botones.Length; i++)
            {
                botones[i] = NumeroCarton();
            }
            for (int i = 0; i < botones.Length; i++)
            {
                but[i] = new Button();
                but[i].Label = botones[i].ToString();

            }
            int k = 0;
            //int index;

            Table table = new Table(rows, columns, true);
            for (int row = 0; row < rows; row++)
                for (int column = 0; column < columns; column++)
                {
                    //index = botones[k];
                    //Button button = new Button();

                    table.Attach(but[k], (uint)column, (uint)column + 1, (uint)row, (uint)row + 1);
                    buttons.Add(but[k]);
                    //button.Label = index.ToString();
                    k++;
                
                }
                
            vbox1.Add(table);
            table.ShowAll();

        }


        public int NumeroCarton()
        {
            int Aleatorio = r.Next(NCarton.Count);
            int N = NCarton[Aleatorio];
            NCarton.RemoveAt(Aleatorio);
            return N;
        }

        public void Marcar(int numero)
        {
            but[numero].ModifyBg(StateType.Normal, new Gdk.Color(0, 255, 0));

        }
    }
}



