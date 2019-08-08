package Spring.OI.Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Draw {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("OI.xml");
		    Triangle triangle = (Triangle)cont.getBean("triangle");
			triangle.Draw();

	}

}
