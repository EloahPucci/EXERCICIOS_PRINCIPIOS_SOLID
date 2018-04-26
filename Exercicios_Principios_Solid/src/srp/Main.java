package srp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo veiculo = new Veiculo(100);
		
		for(int i = 0; i < 50; i++) {
			veiculo.acelerar();
			System.out.println(veiculo.getQuantidadeCombustivel());
		}
		
		veiculo.reabastecer(veiculo.getQuantidadeCombustivel(), veiculo.getCapacidadeTanqueCombustivel());
		
		System.out.println(veiculo.getQuantidadeCombustivel());
		
		

	}

}
