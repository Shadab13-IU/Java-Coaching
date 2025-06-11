package mypkg;
/*class Data{
	private Object x;
	public Data(Object a){
		x=a;
	}
	public void setX(Object b){
		this.x=b;
	}
	public Object getX(){
		return x;
	}
}*/
// Generic class
class Data<T>{
	private T x;
	public Data(T a){
		x=a;
	}
	public void setX(T b){
		this.x=b;
	}
	public Object getX(){
		return x;
	}
}
