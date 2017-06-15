package examen;

import org.junit.Test;

public class Ejercicio3Test
{
  public Ejercicio3Test() {}
  
  @Test
  public void testDatosBuenos1()
  {
    org.junit.Assert.assertEquals(300L, examenejercicio1.Datos("100", "Diego Alvarez", "01", "SI"));
  }
  

  @Test
  public void testDatosBuenos2()
  {
    org.junit.Assert.assertEquals(500L, examenejercicio1.Datos("101", "Alba Gomez", "07", "NO"));
  }
  

  @Test(expected=Exception.class)
  public void testCod000NoValido()
  {
	  examenejercicio1.Datos("000", "Jesus Garcia", "10", "SI");
  }
  

  @Test(expected=Exception.class)
  public void testCodDemasiadoLargo()
  {
	  examenejercicio1.Datos("1001", "Carmen Ruiz", "09", "NO");
  }
  

  @Test(expected=Exception.class)
  public void testCodNoValido()
  {
	  examenejercicio1.Datos("abc", "Sandra Lopez", "02", "SI");
  }
  

  @Test(expected=Exception.class)
  public void testNombreLargo()
  {
	  examenejercicio1.Datos("123", "Juan Gonzalez Fernandez", "03", "SI");
  }
  

  @Test(expected=Exception.class)
  public void testAntiguedadNegativa()
  {
	  examenejercicio1.Datos("123", "Carmen Ruiz", "-1", "SI");
  }
  

  @Test(expected=Exception.class)
  public void testAntiguedadLarga()
  {
	  examenejercicio1.Datos("123", "Carmen Ruiz", "111", "NO");
  }
  

  @Test(expected=Exception.class)
  public void testAntiguedadMal()
  {
	  examenejercicio1.Datos("123", "Carmen Ruiz", "ab", "NO");
  }
  

  @Test(expected=Exception.class)
  public void testPlusError()
  {
	  examenejercicio1.Datos("123", "Carmen Ruiz", "08", "*");
  }
}
