package view;

import controller.Controller_Atv_02_Aeroporto;
import java.util.concurrent.Semaphore;

public class Main_Atv_02_Aeroporto 
{
	public static void main(String[]args) 
	{
		int permissao = 10;
		
		Semaphore semaforo = new Semaphore(permissao);
		
		for(int Plane = 0; Plane < 10; Plane ++) 
		{
			Thread TPlane = new Controller_Atv_02_Aeroporto(Plane,semaforo);
			TPlane.start();
			
		}
		
	}
	
}
