package sample3;
/* 팩토리 패턴 */
public class BeanFactory {
	public MessageBean getBean(String beanName) {
		MessageBean bean = null;
		if(beanName.equals("en")) {				// like mvc 패턴
			bean = new MessageBeanEn();
		} else if(beanName.equals("kr")) {
			bean = new MessageBeanKr();
		}
		return bean;
	}
}
