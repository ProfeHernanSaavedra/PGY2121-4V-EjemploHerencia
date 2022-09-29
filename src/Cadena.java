/**
 *
 * @author USRVI-LC2
 */
public class Cadena extends Joya{
    
    protected int largoCadena;

    public Cadena() {
    }

    public Cadena(int largoCadena) {
        this.largoCadena = largoCadena;
    }

    public Cadena(int largoCadena, int codigo, String nombre, String material) {
        super(codigo, nombre, material);
        this.largoCadena = largoCadena;
    }

    public int getLargoCadena() {
        return largoCadena;
    }

    public void setLargoCadena(int largoCadena) {
        this.largoCadena = largoCadena;
    }

    @Override
    public String toString() {
        return super.toString() + " Cadena{" + "largoCadena=" + largoCadena + '}';
    }

    
   
}
