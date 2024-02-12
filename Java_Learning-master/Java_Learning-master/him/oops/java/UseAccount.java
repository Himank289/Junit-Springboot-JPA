package him.oops.java;

public class UseAccount {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		Account a=new Account();
		
		Account A =new Account(385467,"shiv",9000);
//		System.out.println(A);
//		System.out.println(A.getBalance());
//		System.out.println(A.getAcno());
//		System.out.println(A.getName());
		A.setBalance(-90);
		System.out.println(A.getBalance());
		int r=	A.deposit(90);
		System.out.println(r);
		int p=A.withdraw(70);
		System.out.println(p);
		System.out.println(A.getBalance());
	}

}
