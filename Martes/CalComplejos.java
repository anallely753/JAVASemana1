import java.util.Scanner;

public class CalComplejos{
	Scanner teclado = new Scanner(System.in);
	double realuno;
	double realdos;
	double imaguno;
	double imagdos;
	double realt;
	double imagt;

	public void Ingresar1(){
		System.out.println("**********Primer numero complejo (Z1)************\n");
		System.out.println("Ingrese la parte real");
		this.realuno= this.teclado.nextDouble();
		System.out.println("Ingrese la parte imaginaria");
		this.imaguno = this.teclado.nextDouble();
	}

	public void PedirZ2(){
		System.out.println("**********Segundo numero complejo (Z2)************\n");
		System.out.println("Ingrese la parte real: ");
		this.realdos= this.teclado.nextDouble();
		System.out.println("Ingrese la parte imaginaria: ");
		this.imagdos = this.teclado.nextDouble();
	}

	public void Result(){
		if(this.imagt < 0){
			System.out.println("Resultado: " + this.realt + " " + this.imagt + "i");
			}else{
				System.out.println("Resultado: " + this.realt + "+" + this.imagt + "i");
			}
	}

	public void Suma(){
		this.realt = this.realuno + this.realdos;
		this.imagt = this.imaguno + this.imagdos;
	}

	public void Resta(){
		this.realt = this.realuno - this.realdos;
		this.imagt = this.imaguno - this.imagdos;
	}

	public void Mult(){
		this.realt = (this.realuno*this.realdos) - (this.imaguno*this.imagdos);
		this.imagt = (this.realuno*this.imagdos) + (this.imaguno*this.realdos); 
	}

	public void Div(){
		this.realt = ((this.realuno*this.realdos) + (this.imaguno*this.imagdos)) / (Math.pow(realdos,2) + Math.pow(imagdos,2));
		this.imagt = ((this.imaguno*this.realdos) - (this.realuno*this.imagdos)) / (Math.pow(realdos,2) + Math.pow(imagdos,2));
	}

	public double Ang(){
		return ((Math.atan2(this.imaguno, this.realuno)*180)/Math.PI);
	}

	public double Mod(){
		return Math.sqrt(Math.pow(this.realuno,2) + Math.pow(imaguno,2));
	}
}