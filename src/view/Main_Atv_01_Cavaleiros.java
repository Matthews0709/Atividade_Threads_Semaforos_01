package view;

import java.util.concurrent.Semaphore;
import controller.Controller_Atv_01_Cavaleiros;

public class Main_Atv_01_Cavaleiros 
{

	public static void main(String[]args) 
	{
		int permissao = 4;
		
		Semaphore semaforo = new Semaphore(permissao);
		
		for(int knight = 0; knight < 4; knight ++) 
		{
			Thread Tknight = new Controller_Atv_01_Cavaleiros(knight,semaforo);
		    Tknight.start();
		  
		} 
		
	}
		
}
		

		
		
