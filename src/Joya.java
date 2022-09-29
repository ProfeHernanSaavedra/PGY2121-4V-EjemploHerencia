/**
 *
 * @author USRVI-LC2
 */
public class Joya {
    
    private int codigo;
    private String nombre,material;

    public Joya() {
    }

    public Joya(int codigo, String nombre, String material) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.material = material;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Joya{" + "codigo=" + codigo + ", nombre=" + nombre + ", material=" + material + '}';
    }

    

   
    
    
    
}
