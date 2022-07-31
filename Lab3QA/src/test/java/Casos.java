import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class Casos {
    Filtros filtros;

    @Parameters({"navegador"})
    @BeforeClass
    public void beforeClass(String navegador) {
        filtros = new Filtros();
    }
    @Parameters({"url"})
    @BeforeMethod
    public void beforeTest(String url) throws IOException {
        filtros.abrirUrl(url);
    }
    @Test
    public void TestSanJose() throws IOException {
        filtros.filtroSanjose();
    }
    @Test
    public void TestAlajuela() throws IOException {
        filtros.filtroAlajueja();
    }
    @Test
    public void TestCartago() throws IOException {
        filtros.filtroCartago();
    }
    @Test
    public void TestHeredia() throws IOException {
        filtros.filtroCartago();
    }
    @Test
    public void TestGuanacaste() throws IOException {
        filtros.filtroGuanacaste();
    }
    @Test
    public void TestPuntarenas() throws IOException {
        filtros.filtroPuntareanas();
    }
    @Test
    public void TestLimon() throws IOException {
        filtros.filtroLimon();
    }
    @AfterMethod
    public void afterTest() {
    }
    @AfterClass
    public void afterClass() {
        filtros.cerrarDriver();
    }
}
