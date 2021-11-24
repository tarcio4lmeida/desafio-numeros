package numero;

public enum DivivelPor implements ImprimeDivisao {
    CINCO {
        @Override
        public void imprimeNumero(int valor) {
            if (valor%5 == 0)
                System.out.println(valor + " eh divisivel por 5");
        }
    },
    TRES{
        @Override
        public void imprimeNumero(int valor) {
            if (valor%3 == 0)
                System.out.println(valor + " eh divisivel por 3");
        }
    },
    CINCO_E_TRES{
        @Override
        public void imprimeNumero(int valor) {
            if (valor%5 == 0 && valor%3 == 0)
                System.out.println(valor + " eh divisivel por 5 e 3");
        }
    },
    SEM_CLASSIFICACAO{
        @Override
        public void imprimeNumero(int valor) {
                System.out.println(valor + " sem classificacao");
        }
    }

}
