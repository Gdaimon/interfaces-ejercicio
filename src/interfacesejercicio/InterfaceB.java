package interfacesejercicio;

public interface InterfaceB {
    public void mostarMensaje();
    
    public default void saludar(){
        System.out.println("Hola desde una interface");
    }
    
}
