public class Alumno {
    public String nombre;
    public String apellidos;
    public int edad;
    public String dni;
    public Clase clase;

    public Alumno (String nombre,String apellidos,int edad,String dni,Clase clase){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
    this.dni=dni;
    this.clase=clase;
    }
public String getNombre(){
        return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public Clase getclase(){
        return clase;
    }
    public void setClase(Clase Clase){
        this.clase=clase;
    }


    @Override public String toString(){
        return "Nombre:"+nombre +"\nApellidos: " +apellidos  +"\nEdad"+edad +"\nDNI" +dni;
    }
}