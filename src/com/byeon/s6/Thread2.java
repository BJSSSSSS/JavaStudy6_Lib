

package com.byeon.s6;

public class Thread2 extends Thread{
	
	@Override
	public void run() {
		
		for(int i='a'; i<'z'+1; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Alphabet : " + (char)i);
		}
	}
	
	
	

}


