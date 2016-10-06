
public class CalculaFreteSedex implements CalculaFrete{
	
	public double calculaFrete(TipoFrete tf){
		double valor = 0;
			if(tf.fragilidade == "fragil")
				valor += 20;
			if(tf.peso > 10)
				valor +=25;
			return valor +=tf.distancia * 1.25 + tf.taxa;
	}
}
