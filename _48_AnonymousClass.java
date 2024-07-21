class A
{
	public void show() 
	{
		System.out.println("in A show");
	}
}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}



public class _48_AnonymousClass {
    public static void main(String[] args) {
    	
    	//A obj=new B();
    	
        // if we want to create only one class which inherits base class and overrides method then we can create anonymous class for the same
        
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};

    	obj.show();
    }
}
