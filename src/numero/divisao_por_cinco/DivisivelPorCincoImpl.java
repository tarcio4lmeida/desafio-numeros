package numero.divisao_por_cinco;

import numero.DivivelPor;
import numero.Numeral;

public class DivisivelPorCincoImpl  implements DivisivelPorCinco {
    public void setaDivisao(Numeral numeral) {
        if (numeral.getNumero()%5 == 0)
            numeral.setDivisivel(DivivelPor.CINCO);

    }

}
