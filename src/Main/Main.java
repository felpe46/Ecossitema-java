package Main;

import setings.Mapa;
import Animal.*;
import FenomenoNatural.FenomenoNatural;
import Terreno.Terreno;
import Planta.Planta;
public class Main {
    public static void main(String[] args) {

        Lobo lobo = new Lobo("Lobo");
        Coelho coelho = new Coelho("Coelho", 'C');
        Planta carvalho = new Planta("Carvalho");
        Terreno floresta = new Terreno("Floresta");
        FenomenoNatural tempestade = new FenomenoNatural("Tempestade");

        lobo.Comer();
        coelho.Comer();
        carvalho.Crescer();
        floresta.Descricao();
        tempestade.Ocorrer();
        Mapa c = new Mapa();


        c.map(5);



    }
}