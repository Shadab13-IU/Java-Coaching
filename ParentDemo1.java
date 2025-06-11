package mypkg;
public class ParentDemo1{
	public int sum(int x,int y){
		return x+y;
	}
	/*public int sum(int x,int y,int z){
		return x+y+z;
	}*/
	public static void main(String[] args){
		ParentDemo1 pd = new ParentDemo1();
		System.out.println(pd.sum(2,5));
		System.out.println(pd.toString());

	}
}

