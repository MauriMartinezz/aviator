package domain;

public class Avion {

    private Integer puntosDeVida;
    private String nombre;
    private String equipo;

    //Constructor
    public Avion(String nombre, String equipo, Integer puntosDeVida){
        this.nombre = nombre;
        this.equipo = equipo;
        this.puntosDeVida = puntosDeVida;
    }

    //Getters
    public Integer getPuntosDeVida() {
        return puntosDeVida;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEquipo() {
        return equipo;
    }

    //Methods
    public void disminuirVida(Integer damage){
        this.puntosDeVida -= damage;
    }
    public void dispararACon(Avion avion, Arma arma){
        arma.dispararA(avion);
    }
}
