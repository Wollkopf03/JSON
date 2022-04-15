package json;

public class JSONValue implements JSONData {

	private Object value;
	private ValueType type;

	public JSONValue(String value) {
		this.value = value;
		type = ValueType.String;
	}

	public JSONValue(int value) {
		this.value = value;
		type = ValueType.Integer;
	}

	public JSONValue(boolean value) {
		this.value = value;
		type = ValueType.Boolean;
	}

	@Override
	public String toString() {
		switch (type) {
		case Boolean:
			return "" + (boolean) value;
		case Integer:
			return "" + (int) value;
		case String:
			return "\"" + value + "\"";
		}
		return null;
	}

	enum ValueType {
		String, Integer, Boolean
	}
}
