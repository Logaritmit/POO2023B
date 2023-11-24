public class Estudiantes2{
    // Atributos
    public String nombre;
    public int edad;

    public Estudiantes2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("NOMBRE: "+ nombre);
        System.out.println("EDAD: "+ edad);




    }

    public static void main(String[] args){
        Estudiantes2 estudiante_desarrollo = new Estudiantes2("JHON", 22);
        Estudiantes2 estudiante_redes =new Estudiantes2("LUIS", 20);
        estudiante_desarrollo.saludar();
        estudiante_redes.saludar();
    }



}

