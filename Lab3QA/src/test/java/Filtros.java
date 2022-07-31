import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Filtros {
    private WebDriver driver = null;
    private static Adaptador adaptador = null;
    private String rutaEvidencia = "";

    public Filtros() {
        adaptador = new Adaptador();
    }

    public void abrirUrl(String url) throws IOException {
        adaptador.abrirURL(url);
    }

    public void filtroSanjose()throws IOException {
        adaptador.findElementById(("ProvinceId")).click();
        adaptador.findElementXpath(("//option[. = 'San José']")).click();
        adaptador.findElementById(("CantonId")).click();
        adaptador.findElementById(("CantonId"));
        adaptador.findElementXpath(("//option[. = 'Escazú']")).click();
        adaptador.findCssSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findElementById(("DistrictId")).click();
        adaptador.findElementXpath(("//option[. = 'Escazú']")).click();
        adaptador.findElementById(("PropertyTypeId")).click();
        adaptador.findElementById(("PropertyTypeId"));
        adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
        adaptador.findElementById(("MinPrice")).click();
        adaptador.findElementById(("MinPrice")).sendKeys("0");
        adaptador.findElementById(("MaxPrice")).click();
        adaptador.findElementById(("MaxPrice")).sendKeys("2000000000");
        adaptador.findCssSelector((".btn-filter")).click();
        adaptador.findCssSelector((".property-item-title > strong")).click();
    }

    public void filtroAlajueja()throws IOException {
        adaptador.findElementById(("ProvinceId")).click();
        adaptador.findElementXpath(("//option[. = 'Alajuela']")).click();
        adaptador.findElementById(("CantonId")).click();
        adaptador.findElementById(("CantonId"));
        adaptador.findElementXpath(("//option[. = 'Grecia']")).click();
        adaptador.findCssSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findElementById(("DistrictId")).click();
        adaptador.findElementById(("PropertyTypeId")).click();
        adaptador.findElementById(("PropertyTypeId"));
        adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
        adaptador.findElementById(("MinPrice")).click();
        adaptador.findElementById(("MinPrice")).sendKeys("0");
        adaptador.findElementById(("MaxPrice")).click();
        adaptador.findElementById(("MaxPrice")).sendKeys("6000000000");
        adaptador.findCssSelector((".btn-filter")).click();
        adaptador.findCssSelector((".property-item-title > strong")).click();
    }

    public void filtroCartago()throws IOException {
        adaptador.findElementById(("ProvinceId")).click();
        adaptador.findElementXpath(("//option[. = 'Cartago']")).click();
        adaptador.findElementById(("CantonId")).click();
        adaptador.findElementById(("CantonId"));
        adaptador.findElementXpath(("//option[. = 'occidental']")).click();
        adaptador.findCssSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findElementById(("DistrictId")).click();
        adaptador.findElementById(("PropertyTypeId")).click();
        adaptador.findElementById(("PropertyTypeId"));
        adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
        adaptador.findElementById(("MinPrice")).click();
        adaptador.findElementById(("MinPrice")).sendKeys("0");
        adaptador.findElementById(("MaxPrice")).click();
        adaptador.findElementById(("MaxPrice")).sendKeys("9000000000");
        adaptador.findCssSelector((".btn-filter")).click();
        adaptador.findCssSelector((".property-item-title > strong")).click();
    }
    public void filtroHeredia()throws IOException {
        adaptador.findElementById(("ProvinceId")).click();
        adaptador.findElementXpath(("//option[. = 'Heredia']")).click();
        adaptador.findElementById(("CantonId")).click();
        adaptador.findElementById(("CantonId"));
        adaptador.findElementXpath(("//option[. = 'Barva']")).click();
        adaptador.findCssSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findElementById(("DistrictId")).click();
        adaptador.findElementXpath(("//option[. = 'Barva']")).click();
        adaptador.findElementById(("PropertyTypeId")).click();
        adaptador.findElementById(("PropertyTypeId"));
        adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
        adaptador.findElementById(("MinPrice")).click();
        adaptador.findElementById(("MinPrice")).sendKeys("0");
        adaptador.findElementById(("MaxPrice")).click();
        adaptador.findElementById(("MaxPrice")).sendKeys("9000000000");
        adaptador.findCssSelector((".btn-filter")).click();
        adaptador.findCssSelector((".property-item-title > strong")).click();
    }

    public void filtroGuanacaste()throws IOException {
        adaptador.findElementById(("ProvinceId")).click();
        adaptador.findElementXpath(("//option[. = 'Guanacaste']")).click();
        adaptador.findElementById(("CantonId")).click();
        adaptador.findElementById(("CantonId"));
        adaptador.findElementXpath(("//option[. = 'Nicoya']")).click();
        adaptador.findCssSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findElementById(("DistrictId")).click();
        adaptador.findElementById(("PropertyTypeId")).click();
        adaptador.findElementById(("PropertyTypeId"));
        adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
        adaptador.findElementById(("MinPrice")).click();
        adaptador.findElementById(("MinPrice")).sendKeys("0");
        adaptador.findElementById(("MaxPrice")).click();
        adaptador.findElementById(("MaxPrice")).sendKeys("6000000000");
        adaptador.findCssSelector((".btn-filter")).click();
        adaptador.findCssSelector((".property-item-title > strong")).click();
    }

    public void filtroPuntareanas()throws IOException {
        adaptador.findElementById(("ProvinceId")).click();
        adaptador.findElementXpath(("//option[. = 'Puntarenas']")).click();
        adaptador.findElementById(("CantonId")).click();
        adaptador.findElementById(("CantonId"));
        adaptador.findElementXpath(("//option[. = 'Osa']")).click();
        adaptador.findCssSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findElementById(("DistrictId")).click();
        adaptador.findElementXpath(("//option[. = 'Palmar']")).click();
        adaptador.findElementById(("PropertyTypeId")).click();
        adaptador.findElementById(("PropertyTypeId"));
        adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
        adaptador.findElementById(("MinPrice")).click();
        adaptador.findElementById(("MinPrice")).sendKeys("0");
        adaptador.findElementById(("MaxPrice")).click();
        adaptador.findElementById(("MaxPrice")).sendKeys("4000000000");
        adaptador.findCssSelector((".btn-filter")).click();
        adaptador.findCssSelector((".property-item-title > strong")).click();
    }
    public void filtroLimon()throws IOException {
        adaptador.findElementById(("ProvinceId")).click();
        adaptador.findElementXpath(("//option[. = 'Limón']")).click();
        adaptador.findElementById(("CantonId")).click();
        adaptador.findElementById(("CantonId"));
        adaptador.findElementXpath(("//option[. = 'Talamanca']")).click();
        adaptador.findCssSelector((".btn-filter"));
        adaptador.findTagName(("body"));
        adaptador.findElementById(("DistrictId")).click();
        adaptador.findElementXpath(("//option[. = 'Bratsi']")).click();
        adaptador.findElementById(("PropertyTypeId")).click();
        adaptador.findElementById(("PropertyTypeId"));
        adaptador.findElementXpath(("//option[. = 'Terrenos']")).click();
        adaptador.findElementById(("MinPrice")).click();
        adaptador.findElementById(("MinPrice")).sendKeys("0");
        adaptador.findElementById(("MaxPrice")).click();
        adaptador.findElementById(("MaxPrice")).sendKeys("1000000000");
        adaptador.findCssSelector((".btn-filter")).click();
        adaptador.findCssSelector((".property-item-title > strong")).click();
    }
    public void cerrarDriver() {
        adaptador.cerrarDriver();
    }
}
