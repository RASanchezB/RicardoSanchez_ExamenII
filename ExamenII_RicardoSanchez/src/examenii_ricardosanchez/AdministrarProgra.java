package examenii_ricardosanchez;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class AdministrarProgra {
    private File archivo;
    private ArrayList<AlumnosD_Progra> EjercitoP = new ArrayList();
    
    public AdministrarProgra(String Path) {
        archivo = new File(Path);
    }
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public File getArchivo() {
        return archivo;
    }
    public ArrayList<AlumnosD_Progra> getEjercitoP() {
        return EjercitoP;
    }
    public void setEjercitoP(ArrayList<AlumnosD_Progra> EjercitoP) {
        this.EjercitoP = EjercitoP;
    }
    public void AgregarP(AlumnosD_Progra P){
        this.EjercitoP.add(P);
    }
    public void escribitArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (AlumnosD_Progra P : EjercitoP) {
                bw.writeObject(P);
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
            EjercitoP = new ArrayList();
            AlumnosD_Progra temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (AlumnosD_Progra)objeto.readObject()) != null){
                        EjercitoP.add(temp);
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
    @Override
    public String toString() {
        return "AdministrarProgra{" + "archivo=" + archivo + ", EjercitoP=" + EjercitoP + '}';
    }
    
}
