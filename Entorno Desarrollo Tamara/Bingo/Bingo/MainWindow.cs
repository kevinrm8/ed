using System;
using Gtk;
using Bingo;
public partial class MainWindow : Gtk.Window
{
    public Bolas Bola = new Bolas();

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Panel panel = new Panel(vBox);
        
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

}
