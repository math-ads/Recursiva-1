package view;
import controller.SomaNaturais;
public class Principal {

	public static void main( String[] args) {
		SomaNaturais somNat= new SomaNaturais();
		int soma=0;
		int limite=7;
		int num=1;
				int resp= somNat.soma(soma, limite, num);
		System.out.println(resp);
		
	}

}
