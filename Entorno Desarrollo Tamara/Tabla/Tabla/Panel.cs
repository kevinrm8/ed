using System;
using Gtk;
namespace Tabla
{

    public class Panel
    {

        public Panel(VBox vBox)
        {
            int index = 0;
            Table table = new Table(3, 3, true);
            for (uint row = 0; row < 3; row++)
            {
                for (uint col = 0; col < 3; col++)
                {

                    index++;
                    Button button = new Button();
                    table.Attach(button, col, col + 1, row, row + 1);

                    button.Label = "Button " + index.ToString();
                    button.Clicked += delegate
                    {
                        button.ModifyBg(StateType.Normal, new Gdk.Color(100, 200, 250));
                    };

                }
            }
            vBox.Add(table);
            table.ShowAll();
        }
    }

}