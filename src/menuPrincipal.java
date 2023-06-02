import java.util.Scanner;//Es la declaracion de la libreria Scanner
//Paul Hidalgo
public class menuPrincipal {
    public static void main(String[] args) {

        //Se declara una variable para guardar el año nuevo para el libro
        int anio_nuevo;
        //Se crea un Scanner para el ingreso de valores
        Scanner sc = new Scanner(System.in);

        //literatura, 5 instancias de una clase setters getters constructor, codigo en github

        //Se crean las 5 instancias que son 5 libros diferentes, cada uno con sus propias caracteristicas
        libros Romeo_y_julieta = new libros("Romeo Y Julieta","Alan Castillo", "Editamos", 1995, 3, 2);
        libros Odisea = new libros("La Odisea", "Homero", "Editalo_tu", 1850, 6, 5);
        libros Baldomera = new libros("Baldomera", "Juan Pablo Almachi", "ECU_edits", 1942, 2, 6);
        libros perro = new libros("Los ojos del perro ciberiano", "Franco Roberto", "Edu_libros", 2003, 5, 1);
        libros Los_juegos_del_hambre = new libros("Los juegos del hambre", "Roger Miles", "World_edits", 2006, 12, 8);

        //Vamos a imprimir los datos de un libro y vamos a suponer que el año esta incorrecto por lo que vamos a cambiar la fecha

        System.out.println("\n\t *** Libro 1 *** \n");
        //Se imprime por medio de la funcion imprimir ya creada en la parte de libros
        Odisea.imprimir();
        System.out.print("\nIngrese el nuevo año del libro: ");
        //Se ingresa el nuevo valor a almacenar
        anio_nuevo = sc.nextInt();
        //Se guarda ese valor por medio de un setter
        Odisea.setAnio(anio_nuevo);
        //Se imprime el nuevo año con la ayuda de un getter
        System.out.println("\nAño modificado a: " + Odisea.getAnio());

        //Impresion de todas las instancias almacenadas con la ayuda de la funcion imprimir

        System.out.println("\n\t\t *** LIBRO 1 *** \n");
        Romeo_y_julieta.imprimir();
        System.out.println("\n\t\t *** LIBRO 2 *** \n");
        Odisea.imprimir();
        System.out.println("\n\t\t *** LIBRO 3 *** \n");
        Baldomera.imprimir();
        System.out.println("\n\t\t *** LIBRO 4 *** \n");
        perro.imprimir();
        System.out.println("\n\t\t *** LIBRO 5 *** \n");
        Los_juegos_del_hambre.imprimir();

    }
}
