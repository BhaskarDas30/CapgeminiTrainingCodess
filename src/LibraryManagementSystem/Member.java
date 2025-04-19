package LibraryManagementSystem;

public class Member extends Person{
	private int memberId;
	private Book borrowed[];
	public Member(String name, String email, Book book) {
		super(name,email);
		borrowed=new Book[5];
	}
	public int getMemberId() {
		return this.memberId;
	}
	public void borrowBook(Book book) {
		for(int i=0;i<borrowed.length;i++) {
			
		}
	}
}
