package controller;

import java.util.concurrent.Semaphore;

public class Controller_Atv_01_Cavaleiros extends Thread {
	public Controller_Atv_01_Cavaleiros() {
		super();
	}
	
	private int knight;
	private Semaphore intersection;
	private static boolean vv = false;
	private static boolean T = true;
	private static boolean P = true;
	private static boolean Porta = true;

	public void KnightController(int knight, Semaphore intersection) 
	{
		this.knight = knight;
		this.intersection = intersection;
	}
	
		
			public void run () 
			{
				
				try {
					intersection.acquire();
					 distancia();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					intersection.release();
				}
				porta();
	
			}

			private void distancia() 
			{
	            int distanciaTotal = 2500;
				
				int velocidade = 0;
				int tocha = 2; 
				int pedra = 2;
				
				int t;
				int p;
				
				while(velocidade < distanciaTotal) 
				{
					
					velocidade = velocidade + (int) (Math.random()*5);
					
					if( T = true) 
					{
						t = (int)(Math.random()*5);
						if(t==1) 
						{		
						velocidade += tocha + (int)(Math.random()*5);
						T = false;
						}
					}
					
					if(velocidade == 1200) 
					{
						if(P = true) 
						{
							p = (int)(Math.random()*5);
							if(p==1) 
							{
								velocidade += pedra + (int)(Math.random()*5);
								P = false;
							}
						}
					}
						
				}		
				
			}
			
			private void porta() 
			{
			   int vive;
	
			   if(Porta = true) 
			   {
				  vive = (int)(Math.random()*5);
				  if(vive ==1) 
				  {
					  vv = true;
					  System.out.println("O unico cavaleiro que sobreviveu � " + knight);
					  Porta = false;
				  }
			   }
			   System.out.println("O cavaleiro morreu " + knight );
			  
			}

			
	
	
	
}
