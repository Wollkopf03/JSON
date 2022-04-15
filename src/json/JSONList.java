package json;

import java.util.ArrayList;

public class JSONList extends ArrayList<JSONData> implements JSONData {

	public boolean add(String value) {
		return add(new JSONValue(value));
	}

	public boolean add(int value) {
		return add(new JSONValue(value));
	}

	public boolean add(boolean value) {
		return add(new JSONValue(value));
	}

	@Override
	public String toString() {
		String string = "[";
		for (JSONData data : this)
			string += data + ",";
		return string.substring(0, string.length() - 1) + "]";
	}
}
