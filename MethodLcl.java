package mypkg;
class MethodLcl{
	int x=10;
	void m1(){
		int y=20;
		class MthInner{
			int z=30;
			void m2(){
				System.out.println(z+" "+y+" "+x);
			}
		}
		MthInner ir = new MthInner();
		ir.m2();
	}
}

