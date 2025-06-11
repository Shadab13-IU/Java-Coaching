package mypkg;
class Employee{
	public static void main(String[] args){
		int stock[]={42,40,38,42,45,35,38,50,48,32};
		int max=0,smax=0;
		for(int i=0; i<stock.length; i++){
			if(stock[i]>max){
				smax=max;
				max=stock[i];
			}else if(stock[i]>smax){
				smax=stock[i];
			}
		}
		System.out.println(max+" "+smax);
		/*int[] stock=new int[10];
		stock[0]=42;
		stock[1]=40;
		stock[2]=38;
		stock[3]=42;
		stock[4]=45;
		stock[5]=35;
		stock[6]=38;
		stock[7]=50;
		stock[8]=48;
		stock[9]=32;
		int max=stock[0];
		int day=0;
		for(int i=1; i<stock.length; i++){
			if(stock[i]>max){
				int temp;
				temp=stock[i];
				stock[i]=max;
				max=temp;
				day=i;
			}
		}
		System.out.println(max+" "+day);
		int secondmax=42;
		int dayforsecondmax=0;
		for(int i=1; i<stock.length; i++){
			if(stock[i]>secondmax && stock[i]!=max){
				secondmax=stock[i];
				dayforsecondmax=i;
			}
		}	
		System.out.println(secondmax+" "+dayforsecondmax);
		/*float salaryin2018=10.0f;
		float[] salary=new float[5];
		salary[0]=salaryin2018;
		for(int i=1; i<salary.length; i++){
			salary[i]=salary[i-1]*1.1f;
		}
		float total=0.0f;
		for(int i=0; i<salary.length; i++){
			total=total+salary[i];
		}
		System.out.println("total="+total);*/
	}
}
