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
        //Fuego amigo
        if(avion.getEquipo() == this.getEquipo()){
            System.out.println("No podes atacar a tu compañero de equipo.");

            //Si no es del mismo equipo procede a atacar
        }else{
            arma.dispararA(avion);
            //Si la vida es igual o menor a 0 el avion se destruye
            if(avion.getPuntosDeVida() <= 0 ){
                System.out.println("Atacaste a " + avion.getNombre() + " con " + arma.getNombre() + ". -" + arma.getDamage() + " puntos de vida");
                System.out.println("Has derribado a " + avion.getNombre() + "!!!! ");
//                Si podes sacarle vida sin destruirlo procede a decir cuanta vida restante le queda al enemigo
            }else{
                System.out.println("Atacaste a " + avion.getNombre() + " con " + arma.getNombre() + " -" + arma.getDamage());
                System.out.println("Vida restante: "+ avion.getPuntosDeVida());
            }
        }
    }
}
