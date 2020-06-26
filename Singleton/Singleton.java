public class Singleton {

    public static void main(String[] args) {
		
        EagerSingleton es1 = EagerSingleton.getInstance();
        System.out.println(es1.toString());
		
		EagerSingleton es2 = EagerSingleton.getInstance();
        System.out.println(es2.toString());
	}
}
