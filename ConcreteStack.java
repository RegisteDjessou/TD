public class ConcreteStack implements AStack {
	final static int TAILLE = 100;
	private static Object[] tableau;
	private int nombreElement;
	
	public ConcreteStack(){ 
		tableau = new Object[TAILLE];
		nombreElement = 0;
	}
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (nombreElement>=0);
	}

	@Override
	public void push(Object object) {
		// TODO Auto-generated method stub
		tableau[nombreElement++] = object;
		
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return tableau[nombreElement - 1];
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return tableau[--nombreElement];
	}

}
