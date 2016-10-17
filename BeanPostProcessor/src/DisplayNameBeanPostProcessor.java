import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/* most common and recommended usage is extend the functionality of a framework */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In after initialization bean name is "+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In before initialization bean name is "+beanName);
		return bean;
	}

}
