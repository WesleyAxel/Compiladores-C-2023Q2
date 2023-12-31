package symbols;

public class Identifier {
    private String text;
    private DataType type;
    private Object value;
    private boolean isUsed = false;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public Identifier(String text, DataType type) {
        super();
        this.text = text;
        this.type = type;
    }

    public Identifier() {
        super();
    }

    @Override
    public String toString() {
        return "Identifier [text=" + text + ", type=" + type + ", value=" + value + "]";
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean used) {
		this.isUsed = used;
	}
    
   
}
