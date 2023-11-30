public class Monitor {
    //Atributos de la clase
    private String modelo;
    private int brillo;
    private boolean encendido;
    
    //Constructor de la clase
    public Monitor (String marca, int porcentajeBrillo) {
        modelo = marca;
        brillo = porcentajeBrillo;
        encendido = true;
    }
    
    //Métodos de la clase
    public String getModelo() {
        return modelo;
    }
    
    public int getBrillo () {
        return brillo;
    }
    
    public boolean getEncendido () {
        return encendido;
    }
    
    public void setModelo (String newModelo) {
        modelo = newModelo;
    }
    
    public void setBrillo (int sumarBrillo) {
        brillo = brillo + sumarBrillo;
    }
    
    //Solo cuando esta encendido
    public void setEncendido () {
        encendido = false;
    } 
    
    public void imprimirDetalles() {
        System.out.println("El brillo es " + brillo + "| La marca es " + modelo + "| El monitor está encendido " + encendido);
    }
    
    public String getDetalles() {
        return "El brillo es " + brillo + "| La marca es " + modelo + "| El monitor está encendido " + encendido;
    }


























}