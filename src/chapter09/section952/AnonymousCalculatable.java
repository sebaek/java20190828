package chapter09.section952;

public class AnonymousCalculatable {
	private int field;

	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
//		var1 =1;
		
		field = 10;
		
		Calculatable cal = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(cal.sum());
	}
}
