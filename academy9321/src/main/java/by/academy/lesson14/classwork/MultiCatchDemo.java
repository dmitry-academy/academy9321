package by.academy.lesson14.classwork;

public class MultiCatchDemo {
	public static void main(String... args) {
//		try {
//
//			throw new A();
//			throw new B();
//			throw new C();
//
//		} catch (C e) {
//			System.out.println("A." + e);
//		} catch (B e) {
//			System.out.println("B." + e);
//		} catch (A e) {
//			System.out.println("C." + e);
//		}
	}

	class A extends Exception {
	}

	class B extends A {
	}

	class C extends B {
	}
}
