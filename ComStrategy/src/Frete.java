
public class Frete {
	TipoFrete tipo;
	CalculaFrete calculaFrete;
	
	Frete(TipoFrete tipo){
		this.tipo = tipo;
	}
	public double calculaFrete(){
		double valor = 0;
		if(tipo instanceof FreteNormal){
			System.out.println("Frete Normal");
			calculaFrete = new CalculaFreteNormal();
			valor = calculaFrete.calculaFrete(tipo);
		} else if(tipo instanceof FreteSedex){
			System.out.println("Frete Sedex");
			calculaFrete = new CalculaFreteSedex();
			valor = calculaFrete.calculaFrete(tipo);
		}
		System.out.println(valor);
		return valor;
	}
}
