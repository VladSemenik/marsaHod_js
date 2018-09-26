import java.util.Scanner;



public class main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int position;
        position = in.nextInt();
        
        main C = new main();
        
        int col = 0;
        int p = 0;
        
    	C.min(C.combo(p, position, col));
    	
    	

	}
	
	public void min(int[] arr){
		int min;
		if(arr.length == 1) min = 0;
		else
		min = 99999999;
    	for (int j=1; j< arr.length; j++){
    		if(arr[j] < min){
    			min = arr[j];
    		}
    		
    	}
    	System.out.println("Минимальное число итераций = "+min);
	}
	
	public int[] combo(int p,int position,int col){
		int[] arr = new int[Math.abs(position)+1];
		if(position == 0 || position == 1 || position == -1){
    		if(position == 0){
    			//System.out.println("\r\nномер итерации = "+0);
    		}
    		else{
    			if(position == 1){
    				//System.out.print("A");
        			//System.out.println("\r\nномер итерации = "+1);
        			arr[1] = 1;
    			}else{
    				//System.out.print("RA");
        			//System.out.println("\r\nномер итерации = "+2);
        			arr[1] = 2;
    			}
    		}
    	}else{
    		if(position < -1){
    			position *=-1;
    			//System.out.print("R");
    			col++;
    		}
    		arr[position] = 999999;
    		for(int i = 1; i < position; i++){
					p = i;
					arr[i] = a(1, 0, p, position, col);
			}
    	}
		return arr;
	}
	
	public int a(int v, int curP, int position, int imaginary, int col){
		if(((curP > position && v > 0) || (curP < position && v < 0) || Math.ceil(Math.abs(v/2)) >= Math.abs(position-curP)) && (Math.abs(position-curP) < Math.abs(position-(curP + v)))){
				if(v>=0){
					v=-1;
				}else {
					v=1;
				}
			col++;
			//System.out.print('R');
			return a(v, curP, position, imaginary, col);
		}else{
        	curP += v;
    		v *= 2;
    		col++;
    		//System.out.print("A");
    		if(position == curP){
    			if(position == curP &&  curP == imaginary){
    				//System.out.println("\r\nномер итерации = "+col);
    				return col;
    			}
    			else{
	    			position = imaginary;
	    			return a(v, curP, position, imaginary, col);
	    		}
    		}else{
    			return a(v, curP, position, imaginary, col);
    		}
    	}
		
	}
	
	
}
