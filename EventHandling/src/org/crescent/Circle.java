package org.crescent;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware {

	private Point center;
	private ApplicationEventPublisher publisher;
	@Autowired
	private MessageSource messageSource;
	
		
	public Point getCenter() {
		return center;
	}
/*
 * @Resource is one of the way to Inject the object
 */
   // @Resource(name="pointC")
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {
		//System.out.println("Drawing from circle");
		System.out.println(this.messageSource.getMessage("drawing.circle",null,"Default drawing message",null));
		
		
		//System.out.println("Circle point is "+getCenter().getX()+" "+getCenter().getY());
		System.out.println(this.messageSource.getMessage("drawing.point",new Object[]{center.getX(),center.getY()},"Default point message",null));
		
        String message = this.messageSource.getMessage("greeting",null,"Default greeting",null);
		
		System.out.println(message);
		
		DrawEvent drawEvent=new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	
	}
	
	@PostConstruct
    public void initializeCircle()
    {
    	System.out.println("Init from circle");
    }
	@PreDestroy
    public void destroyCircle()
    {
    	System.out.println("Destroy from circle");
    }
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}

}
