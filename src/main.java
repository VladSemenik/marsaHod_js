import java.util.Scanner;



public class main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int position;
        position = in.nextInt();
        
        main L = new main();
        int col = 0;
        
        L.a(1, 0, position, col);
        
	}
	public void a(int v, int curP, int position, int col){
		
		if((curP > position && v > 0) || (curP < position && v < 0) || Math.ceil(Math.abs(v/2)) >= Math.abs(position-curP)){
		
			if(v>=0){
				v=-1;
			}else v=1;
			col++;
			System.out.print('R');
			a(v, curP, position, col);
			
		}else{
        	curP += v;
    		v *= 2;
    		col++;
    		System.out.print("A");
    		if(position == curP){
    			
    			System.out.println("\r\nномер итерации = "+col);
    		
    		}else
    		a(v, curP, position, col);
    	}
		
		
	}
}
