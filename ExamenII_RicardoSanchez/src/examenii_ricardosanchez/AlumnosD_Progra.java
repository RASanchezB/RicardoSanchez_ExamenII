package examenii_ricardosanchez;
public class AlumnosD_Progra {
    String Apodo;
    String NumCuenta;
    int edad;
    int recistencia;
    String TipoDArma;
    String GradoAcademico;
    int Poder;

    public AlumnosD_Progra() {
    }

    public AlumnosD_Progra(String Apodo, String NumCuenta, int edad, int recistencia, String TipoDArma, String GradoAcademico, int Poder) {
        this.Apodo = Apodo;
        this.NumCuenta = NumCuenta;
        this.edad = edad;
        this.recistencia = recistencia;
        this.TipoDArma = TipoDArma;
        this.GradoAcademico = GradoAcademico;
        this.Poder = Poder;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRecistencia() {
        return recistencia;
    }

    public void setRecistencia(int recistencia) {
        this.recistencia = recistencia;
    }

    public String getTipoDArma() {
        return TipoDArma;
    }

    public void setTipoDArma(String TipoDArma) {
        this.TipoDArma = TipoDArma;
    }

    public String getGradoAcademico() {
        return GradoAcademico;
    }

    public void setGradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }

    @Override
    public String toString() {
        return Apodo;
    }
    
}
