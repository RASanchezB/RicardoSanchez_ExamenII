package examenii_ricardosanchez;
public class Rusos {
    String Nombre;
    String ID;
    int edad;
    String Rango;
    int resistencia;
    String TipoDArma;
    int Poder;

    public Rusos() {
    }

    public Rusos(String Nombre, String ID, int edad, String Rango, int resistencia, String TipoDArma, int Poder) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.edad = edad;
        this.Rango = Rango;
        this.resistencia = resistencia;
        this.TipoDArma = TipoDArma;
        this.Poder = Poder;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
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

    @Override
    public String toString() {
        return Nombre;
    }
    
}
