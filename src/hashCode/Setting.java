package hashCode;
import java.util.ArrayList;

public class Setting {

	    public int totalBook;
	    public int totalLibrary;
	    public int totalDay;
	    public ArrayList<Book> allBooks;
	    public ArrayList<Library> allLibraries;
		public int getTotalBook() {
			return totalBook;
		}
		public void setTotalBook(int totalBook) {
			this.totalBook = totalBook;
		}
		public int getTotalLibrary() {
			return totalLibrary;
		}
		public void setTotalLibrary(int totalLibrary) {
			this.totalLibrary = totalLibrary;
		}
		public int getTotalDay() {
			return totalDay;
		}
		public void setTotalDay(int totalDay) {
			this.totalDay = totalDay;
		}
		public ArrayList<Book> getAllBooks() {
			return allBooks;
		}
		public void setAllBooks(ArrayList<Book> allBooks) {
			this.allBooks = allBooks;
		}
		public ArrayList<Library> getAllLibraries() {
			return allLibraries;
		}
		public void setAllLibraries(ArrayList<Library> allLibraries) {
			this.allLibraries = allLibraries;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	    
	    
	
}
