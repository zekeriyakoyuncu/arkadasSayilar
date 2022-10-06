package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		int total =0;
		
		for(int index=1 ; index<number1 ;index++) {
			if(number1%index == 0) {
				total += index;
			}
		}
		if(total == number2) {
			total = 1;
			for(int index=2 ; index<number2 ;index++) {
				if(number2 % index ==0) {
					total += index;
				}
			}
			if(total == number1) {
				System.out.println("Arkadaş sayidirlar.");
			}
			else {
				System.out.println("Arkadaş sayi değildirler.");
			}
		}
		else {
			System.out.println("Arkadaş sayi değildirler.");
		}

	}

}
