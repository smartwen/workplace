package AnnotationDemo;

class Foo<T>
{
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	
	public void showVar()
	{
		System.out.println(this.getVar());
	}
}
public class SupperessWaringsDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Foo f=new Foo();
		Foo<String> f = new Foo<String>();
		f.setVar("china");
		f.showVar();
	}
}
