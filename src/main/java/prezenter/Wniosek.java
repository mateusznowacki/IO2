package prezenter;
import java.util.HashMap;

public abstract class Wniosek {

	private HashMap<String,String> data;

	public Wniosek() {
		data = new HashMap<String,String>();
	}
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void setkey(String key, String value) {
		data.put(key, value);
	}

	/**
	 * 
	 * @param key
	 */
	public String getkey(String key) {
		return data.get(key);
	}

	public String[] getkeys() {
		return data.keySet().toArray(new String[0]);
	}

	@Override
	public String toString() {
		return "Wniosek{" +
				"data=" + data +
				'}';
	}
}