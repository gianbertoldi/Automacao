package utils;

public enum TipoBrahma {

    Chopp1Lt("Growler Chopp Brahma 1L"),
    DuploMalte350ml("Brahma Duplo Malte 350ml"),
    DuploMalteTrigo350ml("Brahma Duplo Malte Trigo 350ml");

    private final String tipo;

    TipoBrahma(String tipo) {
        this.tipo = tipo;
    }

    public String getMilliliters() {
        return tipo;
    }
}
