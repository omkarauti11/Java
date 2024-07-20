class Human
{
	private int age;
	private String name;
	
    //default constructor
	public Human()
	{
		age=12;
		name="John";
	}

	public Human(String name) {
		this.name=name;
	}

    //Parameterized constructor
	public Human(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	
	public int getAge(){
		return age;
	}

	public void SetAge(int age)
	{
		this.age=age;
	}	

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
}





public class _32_DefaultAndParameterizedConstructor {
    public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		Human obj1=new Human(18, "Navin");
        
		System.out.println(obj.getName()+" : "+obj.getAge());
		System.out.println(obj1.getName()+" : "+obj1.getAge());
		
		obj.SetAge(30);
		obj.setName("Reddy");
		

		System.out.println(obj.getName()+" : "+obj.getAge());
	}
}
