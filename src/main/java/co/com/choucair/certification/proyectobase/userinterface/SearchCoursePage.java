package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {


    public static final Target BUTTON_UC = Target.the("Seleccionar la universidad Choucair")
            .located(By.xpath("//*[@id=\'universidad\']/div[1]/a/h4/strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Dar click en el boton ir")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Seleccionar el curso Recursos Automatizacion Bancolombia")
            .located(By.xpath("//div[@class='course-title']"));


    public static final Target NAME_COURSE = Target.the("Obtener Palabra traducida")
            .located(By.xpath("//div[@class='page-header-headings']"));


}

