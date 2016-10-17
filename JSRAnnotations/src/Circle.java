import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//JSR Java Specification Request
public class Circle implements Shape {

	Point center;
		
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
		System.out.println("Drawing from circle");
		
		System.out.println("Circle point is "+getCenter().getX()+" "+getCenter().getY());
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

}
