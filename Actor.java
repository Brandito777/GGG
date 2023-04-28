public class Actor extends Persona {
    private int id;
    public Actor(String nombre, String fechaNacimiento, String nacionalidad, int id) {
        super(nombre, fechaNacimiento, nacionalidad);
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
