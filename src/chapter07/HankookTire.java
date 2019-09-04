package chapter07;

public class HankookTire extends Tire{
	@Override
	public void stop() {
		System.out.println("보조 브레이크 작동되었습니다.");
	}
}
