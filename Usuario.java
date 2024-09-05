import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String genero;
    private List<IMC> listaIMC;

    public Usuario(String nombre, String apellido, String cedula, String email, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.genero = genero;
        this.listaIMC = new ArrayList<>();
        }
        //get: obtienes el valor de un atributo privado
        public String getNombre() {
            return nombre;
        }
        //set: permite modifcar el valor de un atributo privado
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getApellido() {
            return apellido;
        }
    
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    
        public String getCedula() {
            return cedula;
        }
    
        public void setCedula(String cedula) {
            this.cedula = cedula;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getGenero() {
            return genero;
        }
    
        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void agregarIMC(IMC imc) {
        this.listaIMC.add(imc);
        }

        public void mostrarIMC(){
            for(IMC imc : listaIMC){
                System.out.println(imc);
            }
        }
    }