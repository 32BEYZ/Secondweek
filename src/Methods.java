
public class Methods {

	public static void main(String[] args) {
		sayıBulmaca ();
		sayıBulmaca ();
	}
	




    public static void sayıBulmaca () {
    	 
    	
    		int [] sayılar = new int []{1,2,5,7,9,0};
    		int aranacak = 9;
    		boolean varMı = false ;
    		 
    		for (int sayı  :  sayılar) {
    			
    		if (sayı==aranacak)	{
    			
    		varMı = true;
    		 
    		break ;
    		
    		
    			
    			
    			
    			
    		}
    			
    		}
    			
    		if (varMı) {
    			mesajVer("sayı mevcuttur:"+aranacak);
    			
    		}else {
    			mesajVer("sayı mevcut değildir:"+aranacak);
    		}
    			
    			
    			
    			
    			
    		}

    public static void mesajVer (String mesaj){
    	System.out.println(mesaj);
    }
    
    
    
    
    	}
	
    	
    	
    	
    	
    


















