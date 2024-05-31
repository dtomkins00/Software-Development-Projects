package lab4;

	/**
	 * A class that maintains information on a book.
	 * This might form part of a larger application such
	 * as a library system, for instance.
	 *
	 * @author Drew Tomkins
	 * @date 1st November 2018
	 */
	public class Book
	{
	    // The fields.
	    private String author;
	    private String title;
	    private int pages;
	    private String refNumber;

	    /**
	     * Set the author and title fields when this object
	     * is constructed.
	     */
	    public Book(String bookAuthor, String bookTitle, String ref, int numberOfPages)
	    {
	        author = bookAuthor;
	        title = bookTitle;
	        pages = numberOfPages;
	        refNumber = ref;
	    }

	    // Methods are listed here.
	    public String getAuthor()
	    {
	     return author;
	    }
	    
	    public String getTitle()
	    {
	     return title;
	    }
	    
	    public int getPages()
	    {
	     return pages;
	    }
	    
	    public void setRefNumber(String ref)
	    {
	    	if(ref.length() >= 3) {
	           refNumber = ref;
	    	}
	    	else {
	    		System.out.println("The reference number is under 3 characters");
	    	}
	    }
	    
	    public String getRefNumber()
	    {
	     return refNumber;
	    }
	    
	    public void PrintAuthor()
	    {
	     System.out.println("The author of the book is " + author);
	    } 
	    
	    public void PrintTitle()
	    {
	     System.out.println("The title of the book is " + title);
	    }
	    
	    public void PrintRefNumber()
	    {
	     System.out.println("The reference number of the book is " + refNumber);
	    } 
	    
	    public void PrintPages()
	    {
	     System.out.println("The number of pages the book has is " + pages);
	    } 
	    
	    //Prints out details for the class.
	    public static void main( String[] args ){
	    	Book p=new Book("Mario Puzo", "The Godfather", "978-3-16-148410-0", 446);
	    	p.PrintAuthor();
	    	p.PrintTitle();
	    	p.PrintRefNumber();
	    	p.PrintPages();
	    	}
}

