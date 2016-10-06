
public class Frete {
	TipoFrete tipo;
	
	Frete(TipoFrete tipo){
		this.tipo = tipo;
	}
	public double calculaFrete(){
		double valor = 0;
		if(tipo instanceof FreteNormal){
			if(tipo.fragilidade == "fragil")
				valor += 10;
			if(tipo.peso > 10)
				valor +=15;
			valor += tipo.distancia * 1.15 + tipo.taxa;
		} else if(tipo instanceof FreteSedex){
			if(tipo.fragilidade == "fragil")
				valor += 20;
			if(tipo.peso > 10)
				valor +=25;
			valor += tipo.distancia * 1.25 + tipo.taxa;
		}
		System.out.println(valor);
		return valor;
	}
}
