package stepDefinition;

public class SampleFile {

	public static void main(String[] args) {
		
		System.out.println("3");
		SampleFile obj = new SampleFile();
		int demo = obj.sumMethod(4, 5);
		System.out.println(demo);
		
	}
	
	public int sumMethod(int a, int b) {
		return a-b;
	}

}
