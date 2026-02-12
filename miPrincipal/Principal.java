package miPrincipal;

import logica.Alumno;

public class Principal {

    public static void main(String[] args) {
       // System.out.println("Hola mundo");
       punto p1 = new punto();
       punto p2 = new punto(1,1);
       punto p3 = new punto(4,5);
       p1.fijarX(3);
       p1.fijarY(4);

       System.out.print("x = "+p1.leerX()+"  ");
       System.out.println("y = "+p1.leerY());

       System.out.print("x = "+p2.leerX()+"  ");
       System.out.println("y = "+p2.leerY());

       p3.fijarY(4);
       
       System.out.print("x = "+p3.leerX()+"  ");
       System.out.println("y = "+p3.leerY());

       System.out.println(p1.obtenerDetalles());
       System.out.println(p2.obtenerDetalles());
       System.out.println(p3.obtenerDetalles());

       System.out.println("Prueba de la clase Alumno:");

       Alumno alu1 = new Alumno(567,"Luz","Lopez");
       Alumno alu2 = new Alumno(601,"Juan","Perez");
       Alumno alu3 = new Alumno();

       alu1.saludar();
       alu2.saludar();
       alu3.saludar();

       alu3.fijarid(792);
       alu3.fijarnombre("Lucia");
       alu3.fijarapellido("Mendez");

       alu2.fijarnombre("Juana");
       
       alu1.saludar();
       alu2.saludar();
       alu3.saludar();
    
       System.out.println(alu1.obtenerdetalle());
       System.out.println(alu2.obtenerdetalle());
       System.out.println(alu3.obtenerdetalle());

       System.out.println(alu1.leerid());
       System.out.println(alu1.leerNombre());
       System.out.println(alu1.leerapellido());

    }
}