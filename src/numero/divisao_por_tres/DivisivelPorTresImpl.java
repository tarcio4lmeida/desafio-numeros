package numero.divisao_por_tres;

import numero.DivivelPor;
import numero.Numeral;
import numero.divisao_por_cinco.DivisivelPorCinco;

public class DivisivelPorTresImpl implements DivisivelPorTres {
    public void setaDivisao(Numeral numeral) {
        if (numeral.getNumero()%3 == 0) {
            numeral.setDivisivel(DivivelPor.TRES);
        }
    }
}
