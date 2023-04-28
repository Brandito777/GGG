public class Persona{
    private String nombre;
    private String fechaNacimiento;
    private String nacionalidad;
    public Persona(String nombre, String fechaNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}