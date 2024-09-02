
package DataClumb;


public class Garaje{
    //Atributos
    private String nombreEncargado;
    private String apellidoEncargado;
    private int edadEncargado;
    private int ci;
    private Auto[] espacios;
    
    //Contructor
    public Garaje(String nombreEncargado, String apellidoEncargado, int edadEncargado, int ci){
        this.nombreEncargado = nombreEncargado;
        this.apellidoEncargado = apellidoEncargado;
        this.edadEncargado = edadEncargado;
        this.ci = ci;
        espacios = new Auto[3];//definimos el tamanio
    }
    
    //Metodos
    
    public int verificarEspacioDisponible(){
        int numEspacioDisponible = -1;
        for(int i = 0; i < espacios.length; i++){
            //  0      1     2
            //[null, Auto, null]
            Auto auto = espacios[i];
            if(auto == null){
                numEspacioDisponible = i;
                i = espacios.length;
            }
        }
        return numEspaciosDisponibles;
    }
    
    
    
}

