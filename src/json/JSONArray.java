package json;

import java.util.HashMap;

public class JSONArray extends HashMap<String, JSONData> implements JSONData {

	public JSONData put(String key, String value) {
		return put(key, new JSONValue(value));
	}

	public JSONData put(String key, int value) {
		return put(key, new JSONValue(value));
	}

	public JSONData put(String key, boolean value) {
		return put(key, new JSONValue(value));
	}

	@Override
	public String toString() {
		String string = "{";
		for (Entry<String, JSONData> data : this.entrySet())
			string += "\"" + data.getKey() + "\":" + data.getValue() + ",";
		return (size() > 0 ? string.substring(0, string.length() - 1) : string.substring(0, string.length())) + "}";
	}
}
