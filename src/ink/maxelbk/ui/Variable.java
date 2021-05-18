package ink.maxelbk.ui;

public class Variable<T> {
	private T value;

	public Variable() {
		this(null);
	}
	public Variable(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}

	public void set(T value) {
		this.value = value;
	}

	public boolean setIfDifferent(T value) {
		if (this.value.equals(value)) return false;
		set(value); return true;
	}
}
