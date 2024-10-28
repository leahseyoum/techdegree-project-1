import java.util.Random;

public class Jar {
	private String itemName;
	private int maxItems;
	private int currentNumberOfItems;
	
	public Jar(String itemName, int maxItems) {
		this.itemName = itemName;
		this.maxItems = maxItems;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public int getMaxItems() {
		return maxItems;
	}
	
	public void fill() {
		Random random = new Random();
		currentNumberOfItems = random.nextInt(maxItems) + 1;
	}
	
	public int getCurrentNumberOfItems() {
		return currentNumberOfItems;
	}
}