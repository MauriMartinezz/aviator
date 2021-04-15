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
        this.avionAtacante = new Avion("Furtivo", "terrorista", 200);
        this.avionAtacado = new Avion("Bombardero", "pacifista", 250);

        this.ametralladora = new Arma("Ametralladora", 60);
    }
    @Test
    public void avionAtacaAOtro(){
        this.avionAtacante.dispararACon(avionAtacado, ametralladora);
        Assert.assertEquals(190, this.avionAtacado.getPuntosDeVida().intValue());
    }
}