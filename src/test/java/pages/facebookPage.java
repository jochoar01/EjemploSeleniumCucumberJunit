package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BaseSelenium;

import static org.junit.Assert.assertEquals;

public class facebookPage extends BaseSelenium {

    public static final By BOTON_CREAR_CUENTA = By.id("u_0_2");
    public static final By INPUT_NOMBRE = By.id("u_1_b");
    public static final By INPUT_APELLIDO = By.id("u_1_d");
    public static final By INPUT_MAIL = By.id("u_1_g");
    public static final By CONTRASENA = By.id("password_step_input");
    public static final By BOTON_REGISTRAR = By.id("u_1_s");
    public static final By LETRERO = By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/div[1]");

    public facebookPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void ir_a_pagina_de_registro() throws InterruptedException {

        click(BOTON_CREAR_CUENTA);
        Thread.sleep(3000);
        type(INPUT_NOMBRE, "Juan");
        type(INPUT_APELLIDO, "OCHOA");
        type(INPUT_MAIL, "juan.ochoa@ceiba.com.co");
        type(CONTRASENA, "CONTRASENA");
        click(BOTON_REGISTRAR);





    }

    public void validar_letrero_y_cerrar() throws InterruptedException {


        click(BOTON_REGISTRAR);
        assertEquals(getText(LETRERO), "S2ign Up");




    }


}
