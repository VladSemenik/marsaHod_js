import java.util.Scanner;



public class main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int position;
        position = in.nextInt();
        
        main L = new main();
        int col = 0;
        int p;
        
    	if(position == 0 || position == 1){
    		if(position == 0)
    			System.out.println("\r\nномер итерации = "+col);
    		else{
    			System.out.print("A");
    			System.out.println("\r\nномер итерации = "+col);
    		}
    	}else{
    		if(position < 0){
    			position *=-1;
    			System.out.print("R");
    		}
	        for(int v = 1; v < Math.abs(position); v=1+v*2){
				if(Math.abs(position) >= v && Math.abs(position) <= 1+v*2){
					p = Math.abs(position)-v;
					if(Math.abs(position) == v)
						L.a(1, 0, position, position, col);
					else{
						if(Math.abs(position)-v > 1+v*2-Math.abs(position)){
							L.a(1, 0, position, position, col);
						}else
							 L.a(1, 0, p, position, col);
						}
					}
			}
    	}
       
        
	}
	public void a(int v, int curP, int position, int imaginary, int col){
		
		if(((curP > position && v > 0) || (curP < position && v < 0) || Math.ceil(Math.abs(v/2)) >= Math.abs(position-curP)) && (Math.abs(position-curP) < Math.abs(position-(curP + v)))){
			int k = v;
				if(v>=0){
					v=-1;
				}else {
					v=1;
				}
			col++;
			System.out.print('R');
			a(v, curP, position, imaginary, col);
			
		}else{
        	curP += v;
    		v *= 2;
    		col++;
    		System.out.print("A");
    		if(position == curP){
    			if(position == curP &&  curP == imaginary)
    			System.out.println("\r\nномер итерации = "+col);
    			else{
	    			position = imaginary;
	    			a(v, curP, position, imaginary, col);
	    		}
    		}else
    		a(v, curP, position, imaginary, col);
    	}
		
		
	}
	
}
