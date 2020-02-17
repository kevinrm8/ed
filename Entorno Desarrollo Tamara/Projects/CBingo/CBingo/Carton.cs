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
        private IList<int> NCarton = new List<int>();
        private Random r = new Random();


        public Carton() :
                base(Gtk.WindowType.Toplevel)
        {
            for (int numero = 1; numero <= 90; numero++)
            { // CANTIDAD DE NUMEROS PARA EL CARTON
                NCarton.Add(numero);
            }

                Build();
            Table table = new Table(rows, columns, true);
            for (int row = 0; row < rows; row++)
                for (int column = 0; column < columns; column++)
                {
                    Button button = new Button();
                    table.Attach(button, (uint)column, (uint)column + 1, (uint)row, (uint)row + 1);
                    buttons.Add(button);
                    button.Label = NumeroCarton().ToString();
             
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
            buttons[numero - 1].ModifyBg(StateType.Normal, new Gdk.Color(0, 255, 0));
        }
    }
}



