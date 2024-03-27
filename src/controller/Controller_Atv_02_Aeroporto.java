package controller;

import java.util.concurrent.Semaphore;

public class Controller_Atv_02_Aeroporto 
{
	private int Plane;
	private Semaphore semaforo; 
	
	public Controller_Atv_02_Aeroporto(int Plane) 
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
			}finally {
				manobraS();
				semaforo.release();
			}
			
			
				try {
					semaforo.acquire();
					taxiagemN();
				}catch (InterruptedException e1) {
				
					e1.printStackTrace();
				}finally {
					taxiagemS();
					semaforo.release();
				}
			
					try {
						semaforo.acquire();
						decolagemN();
					} catch (InterruptedException e2) {
			
						e2.printStackTrace();
					}finally {
						semaforo.release();
						decolagemS();
					}
					
					try {
						semaforo.acquire();
						afastamentoN();
					} catch (InterruptedException e3) {
					
						e3.printStackTrace();
					}finally {
						semaforo.release();
						afastamentoS();
					}
					
		}

		private void manobraN() 
		{
			int manobrando = 0; 
			int tempo;
	
				tempo =  (int)((Math.random()*601) + 100);
				
				while(manobrando < tempo) 
				{
					manobrando = manobrando + 1;
					
				}
			
				System.out.println("Área de manobra está limpa na pista norte " );	
	
		}
		
			private void manobraS() 
			{
				int manobrando = 0; 
				int tempo;
	
					tempo =  (int)((Math.random()*601) + 100);
				
				while(manobrando < tempo) 
				{
					manobrando = manobrando + 1;
					
				}
			
					System.out.println("Área de manobra está limpa na pista sul" );	
	
			}

			private void taxiagemN() 
			{
				int manobrando = 0; 
				int tempo;

				tempo =  (int)((Math.random()*801) + 200);
			
				while(manobrando < tempo) 
				{
					manobrando = manobrando + 1;
				
				}
		
			System.out.println("Área de taxiagem está limpa na pista norte " );
			
			}
			
			private void taxiagemS() 
			{
				int manobrando = 0; 
				int tempo;
	
				tempo =  (int)((Math.random()*801) + 200);
				
				while(manobrando < tempo) 
				{
					manobrando = manobrando + 1;
					
				}
			
				System.out.println("Área de taxiagem está limpa na pista sul " );
			
			}

		private void decolagemN() 
		{ 
			int decolagem = 0 ;
			int tempo; 
			
			tempo = (int)((Math.random()*701) + 100);
			
			while(decolagem < tempo) 
			{
				decolagem = decolagem + 1;
			
			}
			
			System.out.println("Área de decolagem está limpa na pista norte ");
			
		}
		
			private void decolagemS() 
			{
				int decolagem = 0 ;
				int tempo; 
			
				tempo = (int)((Math.random()*701) + 100);
			
				while(decolagem < tempo) 
				{
				decolagem = decolagem + 1;
			
				}
			
				System.out.println("Área de decolagem está limpa na pista sul ");
			
			}

		private void afastamentoN() 
		{
			int afastamento = 0;
			int tempo;
		
			tempo = (int)((Math.random()*701) + 100);
			
			while(afastamento < tempo)
			{
				afastamento = afastamento + 1;
				
			}
			
			System.out.println("Área de afastamento esta limpa na pista norte ");
			
		}
		
			private void afastamentoS() 
			{
				int afastamento = 0;
				int tempo;
			
				tempo = (int)((Math.random()*701) + 100);
				
				while(afastamento < tempo)
				{
					afastamento = afastamento + 1;
					
				}
				
				System.out.println("Área de afastamento esta limpa na pista sul ");
				
			}

}
