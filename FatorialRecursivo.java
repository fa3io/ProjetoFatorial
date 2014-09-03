public class FatorialRecursivo{

	public static int calcularFatorialRecursivo(int numero) throws IllegalArgumentExeption{
	if(n == 0)
		return 1;
	return numero * calculoFatorialRecursivo(numero -1);
	}

	public static void main(String[] args){
		System.out.println(calcularFatorialRecursivo(5));
	}
}