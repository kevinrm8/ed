using System;
using Gtk;
using CBingo;
using System.Collections.Generic;



public partial class MainWindow : Gtk.Window
{
    Panel panel;
    Bombo bombo = new Bombo();

    private IList<Carton> Boleto = new List<Carton>();
    public Carton cart;
    

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
        cart.Marcar(numero);

        // Boleto[1].Marcar(numero);

      //  clickcarton(numero);


         for(int i = 0; i < Boleto.Count; i++) {
           Boleto[i].Marcar(numero);
         }
        for (int i = 15; i < 20; i++)
        {
            cart.Marcar(i);
        }

    }

    protected void OnClickBCarton(object sender, EventArgs e)
    {
        cart = new Carton();
        Boleto.Add(cart);      

    }

}
