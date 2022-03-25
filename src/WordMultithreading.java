//Daemon Thread - Supporting threads for the main threads
class MSWord extends Thread{
	public void run() {
		if(getName().equals("Typing")) {
			typing();
		}
		else if(getName().equals("AutoSave")) {
			autoSave();
		}
		else if(getName().equals("SpellCheck")) {
			spellCheck();
		}
	}
	
	void typing() {
		for(int i=0; i<5; i++) {
			System.out.println("Typing.........");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void autoSave() {
		//Infinite loop
		for(;;) {
			System.out.println("Autosaving.........");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void spellCheck() {
		//Infinite loop
		for(;;) {
			System.out.println("Checking.........");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class WordMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Typing thread
		MSWord typing = new MSWord();
		typing.setName("Typing");
		//Autosaving thread - Supporting thread
		MSWord autoSave = new MSWord();
		autoSave.setName("AutoSave");
		autoSave.setDaemon(true);
		autoSave.setPriority(9);
		//Spellcheck thread - Supporting thread
		MSWord spellCheck = new MSWord();
		spellCheck.setName("SpellCheck");
		spellCheck.setDaemon(true);
		autoSave.setPriority(8);
		
		//Daemon thread - Supporting thread
		//1. setDaemon thread to true
		//2. give DaemonThread a higher priority (Anything above 5)
		//3. Must be in an infinite loop
		
		typing.start();
		autoSave.start();
		spellCheck.start();
	}

}
