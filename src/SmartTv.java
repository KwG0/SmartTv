public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 02;
	
	public void ligar() {
		ligada= true;
	}
	
	public void desligar() {
		ligada=false;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public void avancarCanal() {
		canal++;
	}
	
	public void retornarCanal() {
		canal--;
	}
	
	public void MudarCanal (int novoCanal) {
		canal=novoCanal;
		}
}
