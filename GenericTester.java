package mypkg;
class GenericsTester{
	public static void main(String[] args){
		Data<String> data=new Data<>("Lucknow");
		System.out.println(data.getX());
		data.setX("Kanpur");
		System.out.println(data.getX());
		//	//*/
		/*Data data=new Data(10);
		System.out.println(data.getX());*/
		//data.setX(new Integer(20));
		//System.out.println(((Integer)data.getX()).intValue());
	}
}
