package _16_01;

//regular expression
//intern
//String is faster
public class ReverseNumber {
	public Integer addAll(int i,int j) {
		int SumAll=(j*(j+1))/2;
		return SumAll;
	}

	public static void main(String[] args) {
		ReverseNumber obj=new  ReverseNumber();
		Integer addAll = obj.addAll(1, 100);
		System.out.println(addAll);//5050
		
	}

}
