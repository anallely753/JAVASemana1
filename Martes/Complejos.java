import java.util.Scanner;

public class Complejos{

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		CalComplejos c1 = new CalComplejos();
		int opc=1;

		while(opc!=7){

		System.out.println("\n\t\t\tCALCULADORA DE NUMEROS COMPLEJOS. \n\t\t1)Suma\n\t\t2)Resta\n\t\t3)Multiplicacion\n\t\t4)Division\n\t\t5)Angulo\n\t\t6)Modulo\n\t\t7)Salir\n\t\tElige una opcion: ");
		opc = teclado.nextInt();

		switch(opc) {
			case 1:
			System.out.println("\n\t\tSUMA\n");

			c1.PedirZ1();
			c1.PedirZ2();
			c1.Suma();
			c1.impRes();

			break;

			case 2:
			System.out.println("\n\t\tRESTA\n");
			c1.PedirZ1();
			c1.PedirZ2();
			c1.Resta();
			c1.impRes();
			break;

			case 3:
			System.out.println("\n\t\tMULTIPLCACION\n");
			c1.PedirZ1();
			c1.PedirZ2();
			c1.Mult();
			c1.impRes();
			break;

			case 4:
			System.out.println("\n\t\tDIVISION\n");
			c1.PedirZ1();
			c1.PedirZ2();
			c1.Div();
			c1.impRes();
			break;			

			case 5:
			System.out.println("\n\t\tANGULO\n");
			c1.PedirZ1();
			System.out.println("Arguento = " + c1.Ang());
			break;

			case 6:
			System.out.println("\n\t\tMODULO\n");
			c1.PedirZ1();
			System.out.println("Modulo = " + c1.Mod());
			break;

			case 7:
			//opc=0;
			break;

			default: System.out.println("\t\tOpcion incorrecta");
		}

		}
	}
}