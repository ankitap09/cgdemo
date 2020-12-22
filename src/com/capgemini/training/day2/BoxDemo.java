package com.capgemini.training.day2;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 =  new Box();
        box1.setWidth(2.5);
        box1.setHeight(3.2);
        box1.setDepth(1.8);
        
        System.out.println("box1 Dimensions :");
        System.out.println(box1.getWidth()+" "+box1.getHeight()+" "+box1.getDepth() );
        
        Box box2 = new Box();
        box2.setWidth(1.0);
        box2.setHeight(1.0);
        box2.setDepth(1.0);
        
        System.out.println("box2 Dimensions :");
        System.out.println(box2.getWidth()+" "+box2.getHeight()+" "+box2.getDepth() );
        
        
        Box box3 = new Box(1.0,1.0,1.0);
        System.out.println("box3 Dimensions :");
        System.out.println(box3.getWidth()+" "+box3.getHeight()+" "+box3.getDepth() );
        
        
        
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        System.out.println(box3.hashCode());
        
        //All wrapper classess having overidden tostring method
        String s1 = new String("welcome");
        System.out.println(s1);
        Integer n1 = new Integer(100);
        System.out.println(n1);
        
        //for wrapper class
        //we does not require overidden hashcode and equals method explicitly, they are already implicitly overidden 
        String s2 = new String("welcome");
        System.out.println(s1.equals(s2));
        
        
        // we require overidden hashcode and equals method for normal class
        System.out.println(box2.equals(box3));
        
        BoxManager manager = new BoxManager();
        System.out.println("Volume of Box1:"+manager.calculateVolume(box1));
        System.out.println("Volume of Box2:"+manager.calculateVolume(box2));
        System.out.println("Volume of Box3:"+manager.calculateVolume(box3));
        
        
        System.out.println("---------------------------------------");       
        System.out.println("Number of boxes created : (count of object by using static)");
        System.out.println(Box.getCounter());
        
        
        
	}

}
