//Paul Hidalgo
public class libros {
    //Se declaran las variables a utilizar para los datos de los objetos, con su tipo de dato a almacenar
    String nombre, autor, editorial;
    int anio, edicion, tomo;

    //Se crea el constructor
    public libros(String nombre, String autor, String editorial, int anio, int edicion, int tomo) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.edicion = edicion;
        this.tomo = tomo;
    }

    //Se crean los setters y getters de cada dato a guardar
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getTomo() {
        return tomo;
    }

    public void setTomo(int tomo) {
        this.tomo = tomo;
    }

    //Se crea una funcion para poder imprimir los valores que se almacenaron dentro de las variables de cada objeto
    public void imprimir() {
        System.out.println("Nombre del libro: " + this.nombre);
        System.out.println("Autor " + this.autor);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("Año: " + this.anio);
        System.out.println("Edicion: " + this. edicion);
        System.out.println("Tomo: " + this.tomo);
    }
}
