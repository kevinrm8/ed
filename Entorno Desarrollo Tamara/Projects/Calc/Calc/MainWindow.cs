using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    //Cuando le damos a operacion +-*/ guardamos operando1, borramos el display
    //entonces escribimos segundo numero, al darle al = lo guardamos en oeprando2
    //Con switch case sabemos que operacion tenemos que hacer y mostramos resultado 
    public double operando1,operando2;
    public String operacion;

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnClickedpunto(object sender, EventArgs e)
    {
        if (Pantalla.Text.IndexOf(",") < 0) {
            String Display = Pantalla.Text;
            Pantalla.DeleteText(0, Pantalla.Text.Length);
            Pantalla.InsertText(Display + ",");
        }

    }

    protected void OnClicked0(object sender, EventArgs e)
    {

       String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0,Pantalla.Text.Length);
        Pantalla.InsertText(Display + "0");
    }

    protected void OnClickedIgual(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        
        operando2 = double.Parse(Pantalla.Text);
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        calcula();

    }

    protected void OnClickedSuma(object sender, EventArgs e)
    {
        String Display = Pantalla.Text;
        operacion = "+";
        //Pasar el texto a int para poder trabajar con el
        operando1 = double.Parse(Pantalla.Text);
        // Borramos lo que hay en pantalla
        Pantalla.DeleteText(0, Pantalla.Text.Length); 
    }

    protected void OnClicked1(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "1");
    }

    protected void OnClicked2(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "2");
    }

    protected void OnClicked3(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "3");
    }

    protected void OnClickedResta(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        operacion = "-";
        //Pasar el texto a int para poder trabajar con el
        operando1 = double.Parse(Pantalla.Text);
        // Borramos lo que hay en pantalla
        Pantalla.DeleteText(0, Pantalla.Text.Length);


    }

    protected void OnClicked4(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "4");
    }

    protected void OnClicked5(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "5");
    }

    protected void OnClicked6(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "6");
    }

    protected void OnClickedMulti(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        operacion = "*";        
        //Pasar el texto a int para poder trabajar con el
        operando1 = double.Parse(Pantalla.Text);
        // Borramos lo que hay en pantalla
        Pantalla.DeleteText(0, Pantalla.Text.Length);

    }


    protected void OnClicked7(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "7");
    }

    protected void OnClicked8(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "8");
    }

    protected void OnClicked9(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "9");
    }

    protected void OnClickedDivision(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        operacion = "/";
        //Pasar el texto a int para poder trabajar con el
        operando1 = double.Parse(Pantalla.Text);
        // Borramos lo que hay en pantalla
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }

    protected void OnClickedReset(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        operacion = "";
        operando1 = 0;
        operando2 = 0;
    }

    protected void OnClickedC(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText((Pantalla.Text.Length-1), Pantalla.Text.Length);
    }

    public void calcula ()
    {
        double resultado;
        switch (operacion) {
            case "+":
             resultado = operando1 + operando2;
             Pantalla.Text = resultado.ToString();
             break;
            
            case "-":
            resultado = operando1 - operando2;
            Pantalla.Text = resultado.ToString();
            break;

            case "*":
                resultado = operando1 * operando2;
                Pantalla.Text = resultado.ToString();
                break;
            case "/":
                resultado = operando1 / operando2;
                Pantalla.Text = resultado.ToString();
                break;
        }
    }
}
