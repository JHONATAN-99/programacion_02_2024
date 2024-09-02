
package DataClumb;

public class Duenio{
    private String nombre;
    private String apellido;
    private int edad;
    private int ci;
    
    public Duenio(String nombre, String apellido, int edad, int ci){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
    }
    
    //getters = es un metodo que te devuelve un atributo
    
    public String getNombre(){
        return nombre;
    }
    
    //setter = metodo para establecer un nuevo valor a un atributo
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}