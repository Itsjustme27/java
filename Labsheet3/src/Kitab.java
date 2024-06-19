public class Kitab {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    
    public void displayInfo() {
			System.out.println("Title: "+ getTitle());
			System.out.println("Author: "  + getAuthor());
	}
	
	public static void main(String[] args) {
		Kitab book1 = new Kitab();
		book1.setTitle("No longer Human");
		book1.setAuthor("Osamu Dazai");
		book1.displayInfo();
	}
}
