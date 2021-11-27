package by.academy.lesson10.annotations;

@Version(info = "qweqwe")
public class B extends A {

	@Deprecated
	@Version(info = "qweqwe")
	public void test() {

	}

	public void test1(@Version(info = "[qwe]*") String s) {

	}
}
