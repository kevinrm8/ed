using System;
using Gtk;
using CBingo;
using System.Collections.Generic;



public partial class MainWindow : Gtk.Window
{
    Panel panel;
    Bombo bombo = new Bombo();

    private IList<Carton> Boleto = new List<Carton>();
    

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

        for(int i = 0; i < Boleto.Count; i++) {
            Boleto[i].Marcar(numero);
        }

    }

    protected void OnClickBCarton(object sender, EventArgs e)
    {
        Carton carton = new Carton();
        Boleto.Add(carton);
    }
}
