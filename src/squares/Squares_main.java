package squares;

public class Squares_main {

	public static void main(String[] args) {
		double x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
		double y[] = { 1.1, 1.8, 3.3, 4.2, 4.9, 6.0, 7.3 };
		double theta[] = new double[2];
		
		Squares_lib slib = new Squares_lib(x,y);
		
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getRx());
		}
	}

}

//利用データdouble x[] = { 0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2 };
//        double y[] = { 1.1, 1.8, 3.3, 4.2, 4.9, 6.0, 7.3 };
//計算結果99 : theta[0] = 1.0219381533143468
//　　　　　　99 : theta[1] = 5.106390187901021
//　　　　　　99 : Objective function = 0.10785747186931527
//理論値　y=5.1071x+1.0214(Excel)
