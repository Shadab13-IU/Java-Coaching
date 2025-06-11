package mypkg;
class BitWise{
	static byte a=-10;
	byte b=(byte)(a>>1);
	byte c=(byte)(a>>2);
	byte d=(byte)(a>>3);
	public static void main(String[] args){
		BitWise bw=new BitWise();
		System.out.println(+(a>>>1)+" "+bw.b+" "+bw.c+" "+bw.d);
	}
};

