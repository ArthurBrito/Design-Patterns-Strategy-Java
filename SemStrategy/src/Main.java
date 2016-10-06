
public class Main {
	public static void main(String[] args) {
		TipoFrete f1 = new FreteSedex();
		f1.peso = 11;
		f1.fragilidade = "fragil";
		f1.distancia = 100;
		Frete frete = new Frete(f1);
		
		TipoFrete f2 = new FreteSedex();
		f1.peso = 11;
		f1.fragilidade = "fragil";
		f1.distancia = 100;
		Frete frete2 = new Frete(f2);
		
		frete.calculaFrete();
	}
}
