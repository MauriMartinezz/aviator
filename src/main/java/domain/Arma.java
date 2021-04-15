package domain;

public class Arma {
    private String nombre;
    private Integer damage;

    public Arma(String nombre, Integer damage){
        this.nombre = nombre;
        this.damage = damage;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDamage() {
        return damage;
    }

    public void dispararA(Avion avionAtacado){
        avionAtacado.disminuirVida(this.damage);
    }
}
