package mypkg;
class FrequencyTester{
	// This code is in big O(n^2)
	/*public static void main(String[] args){
		String str="Lucknow Junction";
		int count=0;
		ab:
		for(int i=0; i<str.length(); i++){
			count=0;
			if(str.charAt(i)==' ')continue;
			for(int j=0; j<str.length(); j++){
				if(str.charAt(i)==str.charAt(j) && j>=i){
					count++;
				}else if(str.charAt(i)==str.charAt(j) && j<i){
					continue ab; //label continue
				}
			}
			System.out.println(str.charAt(i)+"-"+count);
		}
	}*/
	// Above similiar code is in o(n)
	public static void main(String[] args){
		String str=args[0];
		int[] ca=new int[58];// by default intialize with 0
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==' ')continue;
			ca[str.charAt(i)-65]++;
		}
		for(int i=0; i<58; i++){
			if(ca[i]>0){
				System.out.println((char)(i+65)+"--"+ca[i]);
			}
		}
	}
}
