class Outer
{
    void hello()
    {
        System.out.println("Helo World");
        class Inner3
        {
            void hi()
            {
                System.out.println("HI");
            }
        }
        Inner3 i3 = new Inner3();
        i3.hi();
    }
    static class Inner
    {
        void yo()
        {
            System.out.println("Yo");
        }
    }
    class Inner2
    {
        void now(){};
    }
    
}

public class Inner
{
    public static void main(String args[])
    {
        Outer o = new Outer();
        o.hello();
        
        Outer.Inner i = new Outer.Inner();
        i.yo();
        
        Outer.Inner2 i2 = o.new Inner2()
        {
            @Override 
            public void now()
            {
                System.out.println("Hey There");
            }
        };
        i2.now();
    }
}











