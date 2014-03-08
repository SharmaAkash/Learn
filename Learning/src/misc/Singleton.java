package misc;

public class Singleton {
	
	/* Singleton implementation NOT thread safe*/
	private static Singleton instance = null;	
	private Singleton(){		
	}

	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	/* ************************************************************************* */	
	/* Singleton implementation thread safe but with performance overhead due to synchronized
	 * with each getter call*/
	/*
	private static Singleton instance = null;	
	private Singleton(){		
	}

	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	*/
	
	/* ************************************************************************* */	
	/* Singleton implementation thread safe but with performance overhead due to synchronized
	 * with each getter call*/
	/*
	private static Singleton instance = null;	
	private Singleton(){		
	}

	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	*/

}
