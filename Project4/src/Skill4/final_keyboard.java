package Skill4;

public class final_keyboard {
	
		private final int blank_final_variable;

	    public final_keyboard(int value) {
	    	blank_final_variable = value;
	    }

	    public final void Final_Method() {
	        System.out.println("This is the Final Keyword.");
	    }

	    public static void main(String[] args) {
	    
	        final_keyboard fnl = new final_keyboard(42);       
	        fnl.Final_Method();
	        System.out.println("Blank final variable value: " + fnl.blank_final_variable);
	        final StringBuilder sb = new StringBuilder("Final keyword");
	        System.out.println("Before append: " + sb);
	        sb.append(" skill-4");
	        System.out.println("Updated StringBuilder content: " + sb);
	    }

	}


