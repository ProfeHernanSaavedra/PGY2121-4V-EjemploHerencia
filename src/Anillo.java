
/**
 *
 * @author USRVI-LC2
 */
public class Anillo extends Joya{
    
    protected int medida;

    public Anillo() {
    }

    public Anillo(int medida, int codigo, String nombre, String material) {
        super(codigo, nombre, material);
        this.medida = medida;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return super.toString() + " Anillo{" + "medida=" + medida + '}';
    }
    
    
    
}
