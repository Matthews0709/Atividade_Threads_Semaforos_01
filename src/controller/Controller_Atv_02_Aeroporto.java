package controller;

import java.util.concurrent.Semaphore;

public class Controller_Atv_02_Aeroporto 
{
	private int Plane;
	private Semaphore semaforo; 
	
	public Controller_Atv_02_Aeroporto(int Plane, Semaphore semaforo) 
	{
      this.Plane = Plane;
      this.semaforo = semaforo;
	}
	
		public void run() 
		{
			try {
				semaforo.acquire();
				manobraN();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
				try {
					semaforo.acquire();
					manobraS();
				}catch(InterruptedException ee){
					
					ee.printStackTrace();
				}
			finally {
				semaforo.release();
			}
			
			
				try {
					semaforo.acquire();
					taxiagemN();
				}catch (InterruptedException e1) {
				
					e1.printStackTrace();
				}
				try {
					semaforo.acquire();
					taxiagemS();
				}catch(InterruptedException ee1){
					
					ee1.printStackTrace();
				}finally {
					semaforo.release();
				}
			
					try {
						semaforo.acquire();
						decolagemN();
					} catch (InterruptedException e2) {
			
						e2.printStackTrace();
					}
					try {	
						semaforo.acquire();
						decolagemS();
					}catch(InterruptedException ee2) {
					
						ee2.printStackTrace();
					}finally {
						semaforo.release();
					}
					
					try {
						semaforo.acquire();
						afastamentoN();
					} catch (InterruptedException e3) {
					
						e3.printStackTrace();
					}
					try {
						semaforo.acquire();
						afastamentoS();
					}catch(InterruptedException ee3) {
						
						ee3.printStackTrace();
					}finally {
						semaforo.release();
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
