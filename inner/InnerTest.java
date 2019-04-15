package edu.neu.csye6200.inner;

public class InnerTest {

	private int key = 20; //my secret key

	//an inner class
	public class InnerProc{
		public String encode(String input) {
			StringBuffer sb = new StringBuffer();
			for(char c :input.toCharArray()) {
				char c2 = (char) (c ^ key); //Xor for each char//XOR-exclusive OR used because when i use xor once it is like encoding the text and then if i perform xor again then itll b like decode the text
				sb.append(c2); //add the encoded character
			}
			return sb.toString();
		}
	}

	/*
	 * constructor - this is the constructon of my class
	 * @param key the secret encryption key
	 * @author Harshitha
	 * 
	 */
	public InnerTest(int key) {
		this.key = key;

		InnerProc iProc = new InnerProc();

		String str0 = "My secret message 123";//original msg
		System.out.println("Str0 : " + str0);

		String str1 = iProc.encode(str0);
		System.out.println("Str1 : " + str1);//encoded msg
		
		String str2 = iProc.encode(str1);
		System.out.println("Str1 : " + str2);//decode message
	}

	public static void main(String[] args) {
		InnerTest inTest = new InnerTest(20);
	}

}
