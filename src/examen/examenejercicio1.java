package examen;



import java.util.Scanner;

public class examenejercicio1 {
  public examenejercicio1() {}
  
  public static int Datos(String cod, String nombre, String anti, String plus) {
    if ((cod.length() > 3) || (cod.length() < 3) || (cod == "000"))
    {
      throw new RuntimeException();
    }
    

    int cod2 = Integer.valueOf(cod).intValue();
    
    if ((nombre.length() > 20) || (nombre.length() == 0))
    {
      throw new RuntimeException();
    }
    

    if ((anti.length() > 2) || (anti.length() < 2))
    {
      throw new RuntimeException();
    }
    

    int anti2 = Integer.valueOf(anti).intValue();
    
    if (anti2 < 0)
    {
      throw new RuntimeException();
    }
    

    if (plus.equalsIgnoreCase("SI"))
    {
      if (anti2 >= 5) {
        return 1000;
      }
      return 300;
    }
    
    if (plus.equalsIgnoreCase("NO"))
    {
      if (anti2 >= 5) {
        return 500;
      }
      return 100;
    }
    
    if ((!plus.equalsIgnoreCase("SI")) || (!plus.equalsIgnoreCase("NO"))) {
      throw new RuntimeException();
    }
    







    return -1;
  }
  

  public static void Separar(String Empresa)
  {
    if (Empresa.length() > 27) {
      throw new RuntimeException();
    }
    
    Scanner escaner = new Scanner(Empresa);
    escaner.useDelimiter(";");
    String codigo = escaner.next();
    String nombre = escaner.next();
    String antiguedad = escaner.next();
    String plus = escaner.next();
    
    if (Datos(codigo, nombre, antiguedad, plus) == 0) {
      throw new RuntimeException();
    }
  }
  
  public static void main(String[] args) {}

public static void Datos1(String cod, String nombre, String anti, String plus) {
	// TODO Auto-generated method stub
	
}


}