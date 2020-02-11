using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnSaludarClicked(object sender, EventArgs e)
    {
        MessageDialog md = new MessageDialog(null, DialogFlags.Modal, MessageType.Info, ButtonsType.Ok, "HOLA");
        md.Run();
        md.Destroy(); /* para cuando le demos Aceptar se cierre la ventana*/
    }

    protected void OnBSalirClicked(object sender, EventArgs e)
    {
        this.Destroy();
    }


}
