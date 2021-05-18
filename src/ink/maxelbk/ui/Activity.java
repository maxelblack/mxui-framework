package ink.maxelbk.ui;

public class Activity {
	public Variable<String> title = new Variable<>() {
		@Override
		public void set(String value) {
			super.set(value);
			//TODO repaint
		}
	};
}
