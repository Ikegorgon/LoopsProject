package loops.controller;

public class LoopsController {
	public void start() {
		boolean go = true;
		//while 1
		while(go) {
			//for 1
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			if(i == 9) {
				go = false;
			}
			}
		}
		String [] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z"};
		//for each 1
		for(String abcs : abc) {
			System.out.print(abcs);
			System.out.print(" ");
		}
		System.out.println("");
		//for 2
		for (int i = 1; i <= 5; ++i) {
			//nested
			for (int x = 1; x <= i; ++x) {
				System.out.print(x + " ");
			}
			System.out.println("");
			int w = 5;
			//while 2
				while (w == i) {
					System.out.println("abc ");
					w = w - 1;
				}
		}
		//for each 2
		int [] number = {4,2,7,5};
		for(int num : number) {
			System.out.println(num);
		}
	}
}
