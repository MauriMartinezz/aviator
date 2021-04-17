package domain;

public class Arma {
//    Atributes
    private String nombre;
    private Integer damage;

    public Arma(String nombre, Integer damage){
        this.nombre = nombre;
        this.damage = damage;
    }
// Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getDamage() {
        return damage;
    }
// Methods
    public void dispararA(Avion avionAtacado){

        avionAtacado.disminuirVida(this.damage);
    }
}
