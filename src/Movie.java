
public class Movie {

	private String title;
	private String category;
	
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public Movie() {
		//no args
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	
	public String toString() {
		return String.format(title + "|" + category, title, category);
	}
	
	
	
}
