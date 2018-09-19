public class Complejo
{
  private double parte_real;
  private double parte_imaginaria;

  Complejo(){}

  public Complejo(double real, double imag){
     this.parte_real=real;
     this.parte_imaginaria=imag;
  }

  public double modulo(){
    return Math.sqrt(parte_real*parte_real+parte_imaginaria*parte_imaginaria);
  }

  public static Complejo sumar(Complejo a, Complejo b){
    Complejo suma = new Complejo();
    suma.parte_real = a.parte_real + b.parte_real;
    suma.parte_imaginaria = a.parte_imaginaria + b.parte_imaginaria;
    return suma;
  }
  public static Complejo restar(Complejo a, Complejo b){
    Complejo resta = new Complejo();
    resta.parte_real = a.parte_real - b.parte_real;
    resta.parte_imaginaria = a.parte_imaginaria - b.parte_imaginaria;
    return resta;
  }
  public static Complejo multiplicar(Complejo a, Complejo b){
    Complejo multiplicacion = new Complejo();
    multiplicacion.parte_real =a.parte_real*b.parte_real-a.parte_imaginaria*b.parte_imaginaria;
    multiplicacion.parte_imaginaria = a.parte_real*b.parte_imaginaria+a.parte_imaginaria*b.parte_real;
    return multiplicacion;
  }
  public static Complejo dividir(Complejo a, Complejo b){
    Complejo division = new Complejo();
    double aux;
     if(b.modulo()==0.0)
     {
          System.out.println("Division entre cero no existe");
     }
     else
     {
          aux=b.parte_real*b.parte_real+b.parte_imaginaria*b.parte_imaginaria;
          division.parte_real=(a.parte_real*b.parte_real+a.parte_imaginaria*b.parte_imaginaria)/aux;
          division.parte_imaginaria=(a.parte_imaginaria*b.parte_real-a.parte_real*b.parte_imaginaria)/aux;
     }
    return division;
  }
 
  public static double ang(Complejo a)
  {
    double angulo = Math.atan2(a.parte_imaginaria,a.parte_real);  
    if(angulo<0){   
      angulo=2*Math.PI+angulo;
      }
      angulo=angulo*180/Math.PI;

  return angulo;
  }
  
  public static double magnitud(Complejo a)
  {
    double mag=Math.sqrt(Math.pow(a.parte_real,2)+Math.pow(a.parte_imaginaria,2));
    return mag;
  }

  public static void cambiarNumeros(Complejo a, Complejo b){
    Complejo aux = new Complejo();
    aux.parte_real = a.parte_real;
    a.parte_real = b.parte_real;
    b.parte_real = aux.parte_real;
    aux.parte_imaginaria = a.parte_imaginaria;
    a.parte_imaginaria = b.parte_imaginaria;
    b.parte_imaginaria = aux.parte_imaginaria;
  }



  public static void main(String[] args) 
  {
    Complejo uno = new Complejo(1,3);
    Complejo dos = new Complejo(5,8);
    Complejo ax = new Complejo();
    
    System.out.println("Numero uno: 1+3i");
    System.out.println("Numero dos: 5+8i");
    ax=Complejo.sumar(uno,dos);
    System.out.println("La suma es " +ax.parte_real + " + " + ax.parte_imaginaria+"i");
    ax = Complejo.restar(uno,dos);
    System.out.println("La resta es " + ax.parte_real  + ax.parte_imaginaria+"i");
    ax = Complejo.multiplicar(uno,dos);
    System.out.println("La multiplicacion es " + ax.parte_real + " + " + ax.parte_imaginaria+"i");
    ax = Complejo.dividir(uno,dos);
    System.out.println("La division es " + ax.parte_real + " + " + ax.parte_imaginaria+"i");
    System.out.println("El angulo de 1+3i es: "+Complejo.ang(uno)+"°");
    System.out.println("El angulo de 5+8i es: "+Complejo.ang(dos)+"°");
    System.out.println("La magnitud del numero uno es: "+(int)Complejo.magnitud(uno));
    System.out.println("La magnitud del numero dos es: "+(int)Complejo.magnitud(dos));
    Complejo.cambiarNumeros(uno,dos);
    System.out.println("Ahora uno es: " +uno.parte_real + " + " + uno.parte_imaginaria+"i");
    System.out.println("Ahora dos es: " +dos.parte_real + " + " + dos.parte_imaginaria+"i");
  }
}