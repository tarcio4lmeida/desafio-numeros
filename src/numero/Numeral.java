package numero;

public class Numeral {
    int numero;
    DivivelPor divisivel;

    public Numeral(int numero, DivivelPor divisivel) {
        this.numero = numero;
        this.divisivel = divisivel;
    }

    public Numeral() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public DivivelPor getDivisivel() {
        return divisivel;
    }

    public void setDivisivel(DivivelPor divisivel) {
        this.divisivel = divisivel;
    }
}
