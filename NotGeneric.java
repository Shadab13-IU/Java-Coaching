package mypkg;
class NotGeneric{
	public<T> T getModifiedData(T t){
		return (T)t.toString();
	}
}
class NtgTester{
	public static void main(String[] args){
		NotGeneric ng=new NotGeneric();
		System.out.println(ng.getModifiedData("Lucknow"));
	}
}

