package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {

    public static final Target BUTTON_CC=Target.the("Cursos y certificaciones")
            .located(By.id("certificaciones"));
    public static final Target SELECT_COURSE= Target.the("selecciona el curso")
            .located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div[1]/div/div/a/div[2]/h4"));
    public static final Target QUESTION= Target.the("Confirma curso")
            .located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));


}
