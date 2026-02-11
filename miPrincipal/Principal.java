package miPrincipal;

public class Principal {

    public static void main(String[] args) {
       // System.out.println("Hola mundo");
       punto p1 = new punto();
       punto p2 = new punto(1,1);
       punto p3 = new punto(4,5);
       p1.fijarX(3);
       p1.fijarY(4);

       System.out.print("x ="+p1.leerX()+"  ");
       System.out.println("y ="+p1.leerY());

       System.out.print("x ="+p2.leerX()+"  ");
       System.out.println("y ="+p2.leerY());

       p3.fijarY(4);
       
       System.out.print("x ="+p3.leerX()+"  ");
       System.out.println("y ="+p3.leerY());



    }
}