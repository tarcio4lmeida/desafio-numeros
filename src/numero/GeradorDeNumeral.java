package numero;

import numero.divisao_por_cinco.DivisivelPorCincoImpl;
import numero.divisao_por_tres.DivisivelPorTresImpl;
import numero.divisao_por_tres_e_cinco.DivisivelPorTresECincoImpl;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeNumeral {
    private  DivisivelPorCincoImpl divisivelPorCinco = new DivisivelPorCincoImpl();
    private  DivisivelPorTresImpl divisivelPorTres = new DivisivelPorTresImpl();
    private  DivisivelPorTresECincoImpl divisivelPorTresECinco = new DivisivelPorTresECincoImpl();
    static List<Numeral> numeros = new ArrayList<Numeral>();

    public void geraNumeral(){
        int qtdNumero = 100;
        for (int i=0; i<qtdNumero; i++) {
            Numeral numero = new Numeral(i, DivivelPor.SEM_CLASSIFICACAO);
            numeros.add(numero);
        }
    }

    public List<Numeral> populaLista(){
        geraNumeral();

        for (int i=0; i<numeros.size(); i++) {
            Numeral numero = numeros.get(i);
            divisivelPorTres.setaDivisao(numero);
            numeros.get(i).setDivisivel(numero.getDivisivel());

            divisivelPorCinco.setaDivisao(numero);
            numeros.get(i).setDivisivel(numero.getDivisivel());

            divisivelPorTresECinco.setaDivisao(numero);
            numeros.get(i).setDivisivel(numero.getDivisivel());
        }

        return numeros;
    }

}
