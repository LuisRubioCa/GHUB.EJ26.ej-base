package logica;

public class Alumno {
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    //Metodos
    //Constructores
    public Alumno(){

    }
    public Alumno(int id_, String nombre_,String apellido_){
        id = id_;
        nombre = nombre_;
        apellido = apellido_;

    }
    public void saludar(){
        System.out.println("Hola, soy " +nombre+ " "+apellido+" y se saludar");
    }
    public void fijarid(int id_){
       id = id_;

    }
    public int leerid(){
        return id;
    }
    public void fijarnombre(String nombre_){
        nombre = nombre_;
    }
    public String leerNombre(){
        return nombre;
    }
    public void fijarapellido(String apellido_){
        apellido = apellido_;
    }
    public String leerapellido(){
        return apellido;
    }
    public String obtenerdetalle(){
    return id+" "+nombre+" "+apellido;
    }
}
