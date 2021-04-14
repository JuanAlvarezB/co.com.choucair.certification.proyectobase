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



}

