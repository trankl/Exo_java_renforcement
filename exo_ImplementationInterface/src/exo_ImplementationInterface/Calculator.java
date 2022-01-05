package exo_ImplementationInterface;

public class Calculator implements ICalcul {
	
	private int x;
	private int y;
	
	

	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int additionner(int x, int y) {
	
		int som = x+y;		
		System.out.println(" Somme de x + y = "+ som);
		return som;
	}

	@Override
	public int soustraire(int x, int y) {
		int soustrais = x-y;
		System.out.println(" soustrais de x - y = "+ soustrais);
		return 0;
	}

	@Override
	public int multiplier(int x, int y) {
		int multi = x*y;
		System.out.println(" Multiplication de x * y = "+ multi);
		return multi;
	}

	@Override
	public double diviser(int x, int y) throws Exception {
		double div =0;
		try {
			div = x/y;
			System.out.println(" Divise de x / y = "+ div);
		} catch (Exception e) {
			throw new Exception("Erreur: ne peut pas diviser à 0 " + e.toString());
		}
		return div;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
