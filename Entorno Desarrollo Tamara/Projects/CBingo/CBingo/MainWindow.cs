using System;
using Gtk;
using CBingo;

public partial class MainWindow : Gtk.Window
{
    Panel panel;
    Bombo bombo = new Bombo();

    public MainWindow(): base(Gtk.WindowType.Toplevel)
    {
    Build();

        panel = new Panel(vbox1);
        //Bombo bombo = new Bombo();

        BJugar.Clicked += delegate {

            int numero = bombo.sacarBola();
            panel.Marcar(numero);
        }; 
    }


    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnBJugarClicked(object sender, EventArgs e)
    {
        int numero = bombo.sacarBola();
        panel.Marcar(numero);

    } 
}
