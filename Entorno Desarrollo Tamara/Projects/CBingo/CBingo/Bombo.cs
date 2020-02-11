using System;
using System.Collections.Generic;
using Gtk;

namespace CBingo {

    public class Bombo{

        private IList<int> bolas = new List<int>();
        private Random r = new Random();

        public Bombo() { 
        
            for(int bola = 1; bola <= 90; bola++) { // CANTIDAD DE BOLAS
                bolas.Add(bola);

            }//FIN DEL FOR
        }
        public int sacarBola()
        {
            int Aleatorio = r.Next(bolas.Count);
            int bola = bolas[Aleatorio];
            bolas.RemoveAt(Aleatorio);
            return bola;
        }

    }

}