package ocp;

public class ModoDirecao {
	private int potencia;
	private int alturaSuspensao;
	
	public ModoDirecao(int potencia, int alturaSuspensao) {
		super();
		this.potencia = potencia;
		this.alturaSuspensao = alturaSuspensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAlturaSuspensao() {
		return alturaSuspensao;
	}

	public void setAlturaSuspensao(int alturaSuspensao) {
		this.alturaSuspensao = alturaSuspensao;
	}
	
}
