package com.viresor.hibernetApp;

/**
 * Hello world!
 *
 */
public class App 
{
	
    /**
     * @param args
     */
    public static void main( String[] args )
    {	
    	Parent p = new Parent();
    	p.pid = 100;
    	p.pname = "alien";
    	p.pwork = "creator";
    	System.out.println(p.pid+" "+p.pname+" "+p.pwork);
    	
    	Parent pr = new Parent();
//    	p = pr;    	
    	pr.pid = 101;
    	pr.pname = "warlord";
    	pr.pwork = "distructor";
    	p = pr;
    	System.out.println(pr.pid+" "+pr.pname+" "+pr.pwork);
//    	System.out.println( "Hello World!" );
    }

	@Override
	public String toString() {
		return "App [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
