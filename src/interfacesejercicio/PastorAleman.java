
package interfacesejercicio;

// Implementacion multiples interfaces
public class PastorAleman implements Canino, Mascota{

    @Override
    public void aullar() {
        System.out.println("El perro aulla");
    }

    @Override
    public void estarVivo() {
        System.out.println("El perro esta vivo");
    }

}
