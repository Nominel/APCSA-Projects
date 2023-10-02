package notebook;

public class NoteBook {
    //1. A instance variables
    private int numPages;
    private String brand;

    //2. Methods

    //constructor
    public NoteBook(){//default constructor = no parameter

    }

    public NoteBook(int np, String b){ //constructor with parameters
        numPages=np;
        brand=b;
    }

    public NoteBook(String b){ //constructor with parameters
        brand=b;
    }

    public NoteBook(int np){ //constructor with parameters
        numPages=np;
    }

    //3. setter methods or mutators

    public void setNumPages(int np){
        numPages=np;
    }

    public void setBrand(String b){
        brand=b;
    }

    //4. getter methods or accessors

    public int getNumPages() {
        return numPages;
    }

    public String getBrand() {
        return brand;
    }

    //5. auxiliary/helper methods : toString()
    public String toString(){
        String ans = "Number of pages: "+getNumPages()+"\n"+
                     "          brand: "+getBrand();
        return ans;
    }
}
