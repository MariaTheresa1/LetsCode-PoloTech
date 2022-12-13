package projetos;

public class HelloWorld {
	
    public static final double FATORDECONVERSAO = 2.20462;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println("100kg são " + FATORDECONVERSAO * 100 + " lb");

    }
    
    public enum FasesDaLua{
    	NOVA, CHEIA, CRESCENTE, MINGUANTE
    }
    
    FasesDaLua luaHoje = FasesDaLua.CHEIA;
    
}