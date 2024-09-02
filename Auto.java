
package DataClumb;

public class Auto{
    private Duenio duenio;
    private String modelo;
    private String placa;
    private String color;
    private String marca;
    
    public Auto(String modelo, String placa, String color, String marca){
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
    }
    
    public void algo(){
        duenio.getNombre();
        Systema.out.println("hola mundo");
    }
}
