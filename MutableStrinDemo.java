package mypkg;
class MutableStringDemo{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder("Lucknow");
		/*System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		/*StringBuilder sb2=sb.append(" Junction");
		System.out.println(sb==sb2);
		System.out.println(sb);
		System.out.println(sb2);*/

		//StringBuilder sb=new StringBuilder();
		/*sb.append("Lucknow Junction");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(" East");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		//sb.ensureCapacity(50);
		//System.out.println(sb.capacity());
		System.out.println(sb);
		//sb.reverse();
		//System.out.println(sb);
		sb.insert(4,"for");
		System.out.println(sb);
		sb.delete(4,7);
		System.out.println(sb);
		sb.replace(4,7,"for later");
		System.out.println(sb);
	}
}
