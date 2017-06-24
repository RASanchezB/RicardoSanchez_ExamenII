package examenii_ricardosanchez;

import java.io.Serializable;

public class Alemanes implements Serializable{
    private static final long SerialVersionUID = 888L;
    String Alias;
    int edad;
    String Casta;
    int resistencia;
    String TipoDArma;
    int Poder;

    public Alemanes() {
    }
    public Alemanes(String Alias, int edad, String Casta, int resistencia, String TipoDArma, int Poder) {
        this.Alias = Alias;
        this.edad = edad;
        this.Casta = Casta;
        this.resistencia = resistencia;
        this.TipoDArma = TipoDArma;
        this.Poder = Poder;
    }
    public String getAlias() {
        return Alias;
    }
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCasta() {
        return Casta;
    }
    public void setCasta(String Casta) {
        this.Casta = Casta;
    }
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public String getTipoDArma() {
        return TipoDArma;
    }
    public void setTipoDArma(String TipoDArma) {
        this.TipoDArma = TipoDArma;
    }
    public int getPoder() {
        return Poder;
    }
    public void setPoder(int Poder) {
        this.Poder = Poder;
    }
    
    @Override
    public String toString() {
        return Alias;
    }
    
    
}
