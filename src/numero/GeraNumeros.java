package numero;

import numero.divisao_por_cinco.DivisivelPorCincoImpl;
import numero.divisao_por_tres.DivisivelPorTresImpl;
import numero.divisao_por_tres_e_cinco.DivisivelPorTresECincoImpl;

import java.util.ArrayList;
import java.util.List;

public class GeraNumeros {


    private static GeradorDeNumeral geradorDeNumeral = new GeradorDeNumeral();
    static List<Numeral> numeros = new ArrayList<Numeral>();


    public static void imprimeNumeros(){
        for (Numeral numero: numeros) {
            numero.getDivisivel().imprimeNumero(numero.getNumero());
        }
    }

    public static void main(String[] args) {
       numeros = geradorDeNumeral.populaLista();
       imprimeNumeros();
    }
}
