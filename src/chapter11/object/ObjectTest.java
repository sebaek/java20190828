package chapter11.object;

class Member {
	int i = 0;
	String name = "홍길동";
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (i != other.i)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

public class ObjectTest {
	public static void main(String[] args) {
		String s = "링링";
		String t = new String("링링");
		
		Member m1 = new Member();
		Member m2 = new Member();
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m1.equals(m2));
		
		System.out.println(s.hashCode());
		System.out.println(t.hashCode());
		
		System.out.println(s == t);
		System.out.println(s.equals(t));
		
		
		
//		Member m1 = new Member();
//		Member m2 = new Member();
		m1.setI(3);
		m1.setName("고길동");
		
		m2.setI(3);
		m2.setName("고길동");
		
		System.out.println(m1 == m2);
		
		System.out.println(m1.equals(m2));
		
		
	}
}















