package domain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AviatorTest {
    private Avion avionAtacante;
    private Avion avionAtacado;

    private Avion avionConPocaVida;
    private Avion avionAliado;

    private Arma ametralladora;

    @Before
    public void init(){
        this.avionAtacante = new Avion("Furtivo", "pacifista", 200);
        this.avionAliado = new Avion("Bombardero", "pacifista", 250);
        this.avionAtacado = new Avion("Bombardero", "terrorista", 250);
        this.avionConPocaVida = new Avion("Bombardero", "terrorista", 50);

        this.ametralladora = new Arma("Ametralladora", 60);
    }

    @Test
    public void avionAtacaOtroAvion(){
            this.avionAtacante.dispararACon(this.avionAtacado, this.ametralladora);
            Assert.assertEquals(190, this.avionAtacado.getPuntosDeVida().intValue());
            // Derribar avion enemigo
//        this.avionAtacante.dispararACon(this.avionAtacado, this.ametralladora);
//        this.avionAtacante.dispararACon(this.avionAtacado, this.ametralladora);
//        this.avionAtacante.dispararACon(this.avionAtacado, this.ametralladora);
//        this.avionAtacante.dispararACon(this.avionAtacado, this.ametralladora)
//        Para evitar esa asquerosidad, cree un nuevo hipotetico avion con poca vida
        this.avionAtacante.dispararACon(this.avionConPocaVida, this.ametralladora);

        //Testear fuego amigo
        this.avionAtacante.dispararACon(this.avionAliado, this.ametralladora);
    }

//    @Test
//    public void avionSinVida(){
//        this.avionAtacante.dispararACon(this.avionConPocaVida, this.ametralladora);
//
//        Assert.assertEquals(-10, avionConPocaVida.getPuntosDeVida().intValue());
//    }

}