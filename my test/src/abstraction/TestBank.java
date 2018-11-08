package abstraction;

public class TestBank {
	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.credit();
		s.debit();
		s.loan();
		s.cheque();
		
		bank b=new Sbi();
		b.credit();
		b.debit();
		b.loan();
	
	
	
	}
	
}
