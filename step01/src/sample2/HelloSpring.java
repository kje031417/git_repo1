package sample2;

public class HelloSpring {
	public static void main(String[] args) {
		MessageBean beanEn = new MessageBeanEn();
		beanEn.sayHello();
		
		MessageBean beanKr = new MessageBeanKr();
		beanKr.sayHello();
	}
}
