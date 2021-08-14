

class shape{
    
    public double width;
    public double height;
    
    void disp(){
        System.out.println("width="+width+"  "+"height ="+height);
    }
}

class triangle extends shape{
    
    void disp(){
        System.out.println("width="+width+"  "+"height="+height+ " of a triangle");
    }
    void area(){
        System.out.println("area of triangle= "+(width*height/2));
        
    }
}

class rectangle extends shape{
    void area(){
        System.out.println("area of triangle= "+(width*height));
        
    }
}
class Figures
{
   public static void main(String args[])
   {
       triangle t = new triangle();
       rectangle r = new rectangle();
       t.width=10;
       t.height=20;
       r.width=10;
       r.height=20;
	/*try{
       Thread.sleep(100000);}
	catch(InterruptedException ie)
{
	System.out.println("scanning");}*/

       t.disp();
       t.area();
       r.disp();
       r.area();
       
   }
}