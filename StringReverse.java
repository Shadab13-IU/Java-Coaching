package mypkg;
class StringReverse{
	public static void main(String[] args){
		String s1="Lucknow";
		System.out.println(s1);
		char[] ca=s1.toCharArray();
		int i=0,j=ca.length-1;
		char temp;
		while(i<j){
			temp=ca[i];
			ca[i]=ca[j];
			ca[j]=temp;
			i++;
			j--;
		}
		s1=new String(ca);
		System.out.println(s1);
		String s2="Lucknow-kanpur-unnao-jaunpur";
		String[] sa=s2.split("-");
		for(int k=0; k<sa.length; k++){
			System.out.println(sa[k]);
		}
	}
}
