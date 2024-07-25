package pkg3.dto;

// 인터페이스 상속 키워드 : implements (구현하다)

public class KHJCalculator implements Calculator{

	@Override
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	@Override
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	@Override
	public int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	@Override
	public int div(int a, int b) {
		int result = a / b;
		return result;
	}

	@Override
	public int mod(int a, int b) {
		int result = a % b;
		return result;
	}

	@Override
	public int pow(int a, int x) {
		
		int result = 1;
		for(int i=0; i<x; i++) {
			result *=a ;
		}
		
		return result;
	}

	@Override
	public double areaOfCircle(double r) {
		return Calculator.PI * r * r;
	}

	@Override
	public String toBinary(int num) {
		return null;
	}

	@Override
	public String toHexadecimal(int num) {
		return null;
	}


	}



