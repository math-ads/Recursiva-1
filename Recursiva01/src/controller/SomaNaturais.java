package controller;

public class SomaNaturais {

	 public SomaNaturais(){
		 super();
	 }
	 
	 public int soma(int soma, int limite, int num) {	 
		 if( num+1 >limite) {
/* Como o primeiro numero natural e zero foi necessario adicionar 1 para que
 * o mesmo numero da soma pudesse ser utilizado como "indice" */
			 return 0;
		 } else {
			
		return num + soma(soma, limite, num+1);
	 }
	}
} 
		 

/* a variavel limite foi utilizada para a condicao de parada, a variavel soma
 * como agregador e o num 1 como a quantia que ia ser somada e indice de parada */
