class static_demo

{

    static

    {

       System.out.println("Static block called"); 
    }

    static_demo()

    {

        System.out.println("Constructor called");

    }


}


public class static_block

{

    public static void main(String args[])

    {
 
       static_demo obj1 = new static_demo();

    }

}