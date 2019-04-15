package edu.neu.csye6200.command;

//command design pattern

public abstract class Command {
	
	protected StringBuffer doc = null; //strings are mutable, hence used here
	
	//constructor
	public Command (StringBuffer doc) {
		this.doc =doc;
	}
	
	abstract public void execute();
	abstract public void undo();
}
