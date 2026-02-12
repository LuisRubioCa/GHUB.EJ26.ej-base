package miPrincipal;

public class punto {
    //Atributos
    private int x; //coordenada x
    private int y; //coordenada y
    //metodos contructores
    public punto(){
        x = 0;
        y = 0;

    }
    public punto(int x_, int y_){
        x = x_;
        y = y_;

    }
    public void fijarX(int valorX){
        x = valorX;

    }
    public void fijarY(int valorY){
        y = valorY;
    }
    public int leerX(){
        return x;
    }
    public int leerY(){
        return y;
    }

    public String obtenerDetalles(){
        return " x = "+x+" y = "+y;
        
    }
}
