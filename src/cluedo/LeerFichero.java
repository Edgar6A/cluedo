
package cluedo;



import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class LeerFichero {
    private String File;
    ArrayList<String> fileContent;

    /**
     * Constructor
     * @param mFile Fichero de entrada con la ruta completa. Utilizar en las rutas \\
     * @return nada
     */
    LeerFichero(String mFile) {
            this.File=mFile;
            this.fileContent=new ArrayList<String>();
    }
     /**
     * Getter
     * @return Nombre del fichero a leer con la ruta completa
     */
    public String getFile(){
            return this.File;
    }
     /**
     * Setter
     * @param Nombre del fichero a leer con la ruta completa. Utilizar en las rutas \\
     */
    public void setFile(String mFile) {
            this.File=mFile;
    }
     /**
     * Leer contenido. Lee todo el fichero de texto y lo guarda en una estructura interna.
     */
    public void readContent() throws FileNotFoundException, IOException {
	String linea;
        FileReader f = new FileReader(this.File);
        BufferedReader b = new BufferedReader(f);
        while((linea = b.readLine())!=null) {
            fileContent.add(linea);
        }
        b.close();
    }
     /**
     * Obtener contenido en un array de String.
     * @return Array de cadenas con todas las lineas leidas
     */
    public String[] getContent () {
            String[] res=new String[fileContent.size()];
            int i=0;
            Iterator<String> nombreIterator = fileContent.iterator();
            while(nombreIterator.hasNext()){
                    res[i] = nombreIterator.next();
                    i++;
            }
            return res;
    }
     /**
     * Obtener una cadena con el contenido de todos los elementos leidos del fichero.
     * @param String separator. Caracter que separa en la cadena cada elemento del array. 
     * @return String con el contenido del fichero separado por el catacter dado.
     */
    public String toString(String separator) {
            String res="";
            int i=0;
            Iterator<String> nombreIterator = fileContent.iterator();
            while(nombreIterator.hasNext()){
                if (i==0) {
                    res+= nombreIterator.next();
                    i++;
                } else {
                    res=res+separator+nombreIterator.next();
                }
            }
            return res;
    }
   
}
