
public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		smartTv.diminuirVolume();
		System.out.println("Tv Ligada? "+ smartTv.ligada);
		System.out.println("Canal Atual: "+ smartTv.canal);
		System.out.println("Volume Atual: "+ smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Tv Ligada? "+ smartTv.ligada);
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume Atual: "+ smartTv.volume);
		
		smartTv.MudarCanal(15);
		System.out.println("Canal Atual: "+ smartTv.canal);
		
		smartTv.desligar();
		System.out.println("Tv Ligada? "+ smartTv.ligada);
		
		
	}

}
