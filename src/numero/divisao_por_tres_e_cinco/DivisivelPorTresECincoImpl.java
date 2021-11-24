package numero.divisao_por_tres_e_cinco;

import numero.DivivelPor;
import numero.Numeral;
import numero.divisao_por_cinco.DivisivelPorCinco;

public class DivisivelPorTresECincoImpl implements DivisivelPorTresECinco {
    public void setaDivisao(Numeral numeral) {
        if (numeral.getNumero()%3 == 0 && numeral.getNumero()%5 == 0) {
           numeral.setDivisivel(DivivelPor.CINCO_E_TRES);
        }

    }
}
