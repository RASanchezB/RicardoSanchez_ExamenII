package examenii_ricardosanchez;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class AdministrarArchivo {
    private File archivo;
    private ArrayList<Alemanes> EjercitoA = new ArrayList();
    
    public AdministrarArchivo(String Path) {
        archivo = new File(Path);
    }
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public File getArchivo() {
        return archivo;
    }
    public ArrayList<Alemanes> getEjercitoA() {
        return EjercitoA;
    }
    public void setEjercitoA(ArrayList<Alemanes> EjercitoA) {
        this.EjercitoA = EjercitoA;
    }
    public void AgregarA(Alemanes A){
        this.EjercitoA.add(A);
    }
    public void escribitArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Alemanes A : EjercitoA) {
                bw.writeObject(A);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
    public void cargarArchivo(){
        try {
            EjercitoA= new ArrayList();
            Alemanes temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Alemanes)objeto.readObject()) != null){
                        EjercitoA.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
