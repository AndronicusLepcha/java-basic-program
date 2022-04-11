import java.util.*;
class A{
	void show(){
	System.out.println("This is the method of class A");
	}	
	
}
class B extends A{
		int x=90;
		void show(){
		System.out.println("\nThis is the method of class B ");
		}			
}
class C extends  B{
		void show(){
		System.out.println(super.x);
		super.show();
		System.out.println("\nThis is the method of class C");
		}	
}

class SuperClassReferenceVariable{
	public static void main(String args[]){
			A aob = new A();//Super class for B
			B bob = new B();//Super class for C and derived class for A
			C cob =new C();//Derived class fro B
			//Super Class Variable Creating as ar
			A ar;
			ar=cob;
			ar.show();
			//cob.show();
			//super.show(); This is not allowed here
			}
}

