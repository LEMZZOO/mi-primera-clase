public class Monitor {

    private String modelo;
    private int brillo;
    private boolean encendido;
    
    public Monitor (String marca, int porcentajeBrillo) {
        modelo = marca;
        brillo = porcentajeBrillo;
        encendido = true;
    }
    
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



























}