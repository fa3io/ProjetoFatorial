public class Fatorial{
	
	//Vers�o iterativa do calculo Fatorial
		public int calcularFatorial(int n)throws IllegalArgumentException{
			if(n < 0){
				throw new IllegalArgumentException("N�o existe Fatorial de numero negativo !!!");
			}else{
				int resultado = 1;

				for (int i = 2; i<=n; i++){
					resultado *=i;
				}
				return resultado;
			}
			
		}
	
	
}