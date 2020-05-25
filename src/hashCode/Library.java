package hashCode;

import java.util.ArrayList;

public class Library {

	    private int libraryCount;
	    public int id;
	    public int maxBookCount;
	    public int signUpProcessDay;
	    public int shipPerDay;
	    public ArrayList<Book> books;
	    
	    
	    public Library()
	    {
	    	
	        this.id = libraryCount;
	        libraryCount++;
	        
	    }
	    
	    
	    public int getLibraryCount() {
			return libraryCount;
		}


		public void setLibraryCount(int libraryCount) {
			this.libraryCount = libraryCount;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getMaxBookCount() {
			return maxBookCount;
		}


		public void setMaxBookCount(int maxBookCount) {
			this.maxBookCount = maxBookCount;
		}


		public int getSignUpProcessDay() {
			return signUpProcessDay;
		}


		public void setSignUpProcessDay(int signUpProcessDay) {
			this.signUpProcessDay = signUpProcessDay;
		}


		public int getShipPerDay() {
			return shipPerDay;
		}


		public void setShipPerDay(int shipPerDay) {
			this.shipPerDay = shipPerDay;
		}


		public ArrayList<Book> getBooks() {
			return books;
		}


		public void setBooks(ArrayList<Book> books) {
			this.books = books;
		}


		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
}
