package Githubpractise.gitcode;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logic  {


@Test
	public void execute(){
		// TODO Auto-generated method stub
Hello h=new Hello(2);
System.out.println(h.basic());

}

@BeforeMethod
public void step1() {
	System.out.println("one");
	System.out.println("two");
	System.out.println("three");
}


}