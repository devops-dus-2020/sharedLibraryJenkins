package laura.details

import laura.devopsdus2020.*

class GeneratorService implements IGeneratorService {

int x = 0;
 //for (int i=0 ; i<2; i++) {
 	
	int generate() {
		int a = (Math.abs(new Random().nextInt() % 6)) + 1 ;
 		return a; 
	}
  
  	int calculate() { 
 		return x;
 	} 
// }

}

