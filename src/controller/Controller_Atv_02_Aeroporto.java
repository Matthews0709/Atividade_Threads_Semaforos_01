package controller;

import java.util.concurrent.Semaphore;

public class Controller_Atv_02_Aeroporto 
{
	private int Plane;
	private Semaphore semaforo; 
	
	public void Controll(int Plane) 
	{
      this.Plane = Plane;
      
	}
	
		public void run() 
		{
			try {
				semaforo.acquire();
				manobraN();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			manobraS();
			
			
			taxiagemN();
			taxiagemS();
			decolagem();
			afastamento();
		
		}

		private void manobraN() 
		{
			int i;
			int manobrando = 0; 
			int tempo;
	
				tempo =  (int)(Math.random()*701);
				
				while(manobrando < tempo) 
				{
					manobrando = manobrando + 1;
					
				}
			
				System.out.println("Área de manobra está limpa na pista norte " );	
	
		}
		
		private void manobraS() 
		{
			int i;
			int manobrando = 0; 
			int tempo;
	
				tempo =  (int)(Math.random()*701);
				
				while(manobrando < tempo) 
				{
					manobrando = manobrando + 1;
					
				}
			
					System.out.println("Área de manobra está limpa na pista sul" );	
	
		}


		private void taxiagemN() 
		{
			int i;
			int manobrando = 0; 
			int tempo;

			tempo =  (int)(Math.random()*1001);
			
				while(manobrando < tempo) 
				{
					manobrando = manobrando + 1;
				
				}
		
			System.out.println("Área de taxiagem está limpa na pista norte " );
			
			
		}
		private void taxiagemS() 
		{
			int i;
			int manobrando = 0; 
			int tempo;
	
				tempo =  (int)(Math.random()*1001);
				
				while(manobrando < tempo) 
				{
					manobrando = manobrando + 1;
					
				}
			
				System.out.println("Área de taxiagem está limpa na pista sul " );
			
			
		}

		private void decolagem() {
		
		}

		private void afastamento() {
		
		}

	
	
	
}
