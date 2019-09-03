package chapter06.section13;

import chapter06.section13.newpkg.Person;

public class ChildDiffPkg extends Person {
	void method2() {
		System.out.println(protectedField);
	}
}
