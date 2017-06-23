package examenii_ricardosanchez;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class AdministrarRusos {
    private File archivo;
    private ArrayList<Rusos> EjercitoR = new ArrayList();

    public AdministrarRusos(String Path) {
        archivo = new File(Path);
    }
    public File getArchivo() {
        return archivo;
    }
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public ArrayList<Rusos> getEjercitoR() {
        return EjercitoR;
    }
    public void setEjercitoR(ArrayList<Rusos> EjercitoR) {
        this.EjercitoR = EjercitoR;
    }  
    public void escribitArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Rusos R : EjercitoR) {
                bw.writeObject(R);
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
            EjercitoR= new ArrayList();
            Rusos temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Rusos)objeto.readObject()) != null){
                        EjercitoR.add(temp);
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
