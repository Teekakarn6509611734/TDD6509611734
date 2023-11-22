package core;

import java.util.ArrayList;

public class Stack implements IStack {
	
	private ArrayList <Object> elms;
	public Stack(){
		elms=new ArrayList <Object>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(elms!=null) {
			if(elms.size()==0) {
				return true;
			}else {
				return false;
			}
		}else
			return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return elms.size();
	}
	
	public boolean isFuLL() {
		if(elms.get(elms.size()-1)!=null) {
			return false;
		}else {
			return true;
		}
		
		
	}
	
	public void push(Object s) {
		if(isFull()==false) {
			elms.add(s);
		}		
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return elms.get(elms.size()-1);
	}
	
	
	@Override
	public void pop() {
		// TODO Auto-generated method stub
		elms.remove(elms.size()-1);
	}
	
	
	
	
}
