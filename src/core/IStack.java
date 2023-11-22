package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	boolean isFull();
	void push(Object o);
	Object top();
	void pop();
}
