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
    
    public void setEncenderApagar() {
        if(encendido == true){
            encendido = false;
        }
        else {
            encendido = true;
        }
    } 
    
    public void imprimirDetalles() {
        String estadoMonitor = "";
        if (encendido == true){
            estadoMonitor = "encendido";
        }
        else {
            estadoMonitor = "apagado";
        }
        System.out.println("El brillo es '" + brillo + "'| La marca es '" + modelo + "'| El monitor está '" + estadoMonitor + "'");
    }
    
    public String getDetalles() {
        String estadoMonitor = "";
        if (encendido == true){
            estadoMonitor = "encendido";
        }
        else {
            estadoMonitor = "apagado";
        }
        return "El brillo es '" + brillo + "'| La marca es '" + modelo + "'| El monitor está '" + estadoMonitor + "'";
    }


























}