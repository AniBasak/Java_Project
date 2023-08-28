class Parametrizedcons_2
{
	int id;
	String name;
	Parametrizedcons_2(int i, String n)
	{
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		Parametrizedcons_2 ob1 = new Parametrizedcons_2(11,"Ani");
		Parametrizedcons_2 ob2 = new Parametrizedcons_2(22,"Basak");
		//These two calls the constructor in this case Parametrized 
	
		ob1.display();
		ob2.display();
	}
}