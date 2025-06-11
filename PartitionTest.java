package mypkg;
class PartitionTest{
	public static void main(String[] args){
		int[] a={5,7,3,2,8,4,1,6};
		PartitionAlgo pr=new PartitionAlgo();
		pr.printarray(a);
		pr.partition(a,0,a.length);
		pr.printarray(a);
	}
}
