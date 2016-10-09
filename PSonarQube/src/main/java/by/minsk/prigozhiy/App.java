package by.minsk.prigozhiy;

/**
 * Hello world!
 *
 */
public class App 
{
	
    /**
     * 
     */
    private Integer count=0;


	/**
	 * 
	 */
	private App() {
		super();
    }

    
	/**
	 * @param args
	 */
	public static void main( String[] args )
    {
	App app = new App();
		app.getCount();
    }


	/**
	 * @return
	 */
	public Integer getCount() {
		return count;
	}


	/**
	 * @param count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
}
