using System;
using System.Collections.Generic;
using CBingo;
using Gdk;


namespace CBingo
{
    public partial class Carton : Gtk.Window
    {
        public Carton() :
                base(Gtk.WindowType.Toplevel)
        {
            this.Build();
        }
    }
}
