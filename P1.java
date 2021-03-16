class ExampleStatic{
	void display(int x,int y){
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
	}

public static void main(String args[]){
		int x=9;
		int y=19;
		ExampleStatic es=new ExampleStatic();
		es.display(x,y);
	}
}