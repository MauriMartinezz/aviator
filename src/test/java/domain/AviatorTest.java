package domain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AviatorTest {
    private Avion avionAtacante;
    private Avion avionAtacado;

    private Arma ametralladora;

    @Before
    public void init(){
        this.avionAtacante = new Avion("Furtivo", "pacifista", 200);
        this.avionAtacado = new Avion("Bombardero", "terrorista", 250);

        this.ametralladora = new Arma("Ametralladora", 260);
    }

    @Test
    public void avionAtacaOtroAvion(){
            this.avionAtacante.dispararACon(avionAtacado, ametralladora);
            Assert.assertEquals(-10, this.avionAtacado.getPuntosDeVida().intValue());
    }
}