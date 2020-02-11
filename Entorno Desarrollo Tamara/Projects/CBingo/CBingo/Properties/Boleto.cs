using System;
using System.Collections.Generic;
using Gtk;

namespace CBingo
{ 
    public class Boleto {

        private static uint rows = 2;
        private static uint columns = 2;

        private IList<Button> buttons = new List<Button>();


        public Boleto(VBox vbox2)
        {
            Table table = new Table(rows, columns, true);
            int index = 0;

            for (int row = 0; row < rows; row++)
                for (int column = 0; column < columns; column++)
                {
                    index++;
                    Button button = new Button();
                    table.Attach(button, (uint)column, (uint)column + 1, (uint)row, (uint)row + 1);
                    buttons.Add(button);
                    button.Label = index.ToString();
                }
            vbox2.Add(table);
            table.ShowAll();
        }


    }

}