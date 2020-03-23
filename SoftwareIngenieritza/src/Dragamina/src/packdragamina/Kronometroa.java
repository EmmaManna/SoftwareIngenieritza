package Dragamina.src.packdragamina;
import java.util.Observable;


public class Kronometroa{
	
	//Atributuak
	private long zeroMomentua;
	private static Kronometroa nireKronometroa = null;
	
	
	//Eraikitzailea
	private Kronometroa() {
		
		
	}
	 //Singleton patroia
	public static synchronized Kronometroa getKronometroa(){
		if(nireKronometroa == null){
			nireKronometroa = new Kronometroa();
		}
		return nireKronometroa;
	}
	
	public void zeroanJarri(){
	 zeroMomentua = System.currentTimeMillis();
	}
	
	public long hasierakoDenb(){
		return zeroMomentua;
	}
	
	public int pasaDirenSegunduakLortu(){
		return (int) (System.currentTimeMillis() - zeroMomentua) / 1000;
	}
	
	public void segundoBat(){
		while(pasaDirenSegunduakLortu() == 0){
			//Ez da segundu bat pasa
		}
	}

}