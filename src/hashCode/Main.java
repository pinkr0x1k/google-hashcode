package hashCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map; 

	
		public class Main {
			
			HashMap<String, String> Book = new HashMap<String, String>();
			HashMap<String, String> Library = new HashMap<String, String>();
			 
	   
		    static String path = "src/a_example.txt";
	
		    
		    
		    public static void main(String[] args) throws IOException {

		
		        String lineData;
		        int rowCount = 0;
		        Setting setting = new Setting();

		        while (lineData != null){
		            int columnCount = 0;
		            String[] line = lineData.split(" ");
		            if (rowCount == 0) {
		                for (String data : line) {
		                    if (columnCount == 0) {
		                        setting.totalBook = Integer.parseInt(data);
		                    } else if (columnCount == 1) {
		                        setting.totalLibrary = Integer.parseInt(data);
		                    } else if (columnCount == 2) {
		                        setting.totalDay = Integer.parseInt(data);
		                    }
		                    columnCount++;
		                }
		            } else if (rowCount == 1) {
		                for (String data : line) {
		                    int figure = Integer.parseInt(data);
		                    Book book = new Book(figure);
		                    allBooks.add(book);
		                    columnCount++;

		                }
		            } else {
		                Library library = new Library();
		              
		                for (String data : line) {
		                    switch (columnCount){
		                        case 0:
		                            library.maxBookCount = Integer.parseInt(data);
		                            break;
		                        case 1:
		                            library.signUpProcessDay = Integer.parseInt(data);
		                            break;
		                        case 2:
		                            library.shipPerDay = Integer.parseInt(data);
		                            break;
		                    }
		                    columnCount++;
		                }
		                lineData;
		                line = lineData.split(" ");
		                rowCount++;
		                for (String data : line) {
		                    boolean isLibrary = false;
		                    int bookFigure;
		                    int figure = Integer.parseInt(data);
		                    for (Library lib : allLibraries){
		                        ArrayList<Book> books = lib.books;
		                        for (Book book : books){
		                            if (book.figure == figure){
		                                isLibrary = true;
		                                break;
		                            }
		                        }
		                    }
		                    if (!isLibrary){
		                        Book book = new Book(figure);
		                        allLibraryBooks.add(book);
		                    }
		                    columnCount++;
		                }
		            }
		            lineData;
		            rowCount++;
		        }
		        close();

		    }
		
	}


