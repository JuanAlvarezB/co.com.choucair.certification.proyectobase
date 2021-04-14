package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {


    public static final Target BUTTON_UC = Target.the("Seleccionar Cursos y Certificaciones")
            .located(By.id("certificaciones"));

    public static final Target BANNER_CURSO = Target.the("Seleccionar Cursos y Certificaciones")
            .located(By.xpath("//*[@id='category-course-list']/div/div[2]/div/div[1]/div/div/a/div[2]"));

    public static final Target NAME_COURSE = Target.the("Obtener Palabra traducida")
            .located(By.xpath("//*[@id='page-header']/div/div/div[2]/div[1]/div[1]/a/div/div"));

/*

    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Dar click en el boton ir")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Seleccionar el curso Recursos Automatizacion Bancolombia")
            .located(By.xpath("//div[@class='course-title']"));



*/

}

