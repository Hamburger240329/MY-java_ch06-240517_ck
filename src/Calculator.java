
public class Calculator {

	int firstNum;  // 인스턴스 맴버
	int secondNum;  // 인스턴스 맴버
	
	static int thirdNum;  // 정적 맴버 - 스태틱으로 지정해두면 글씨체가 변경됨 - 기울림꼴
	
	static final double PI = 3.141592;	// 한번 선언 될 때 초기화 되면 그 값은 변경 불가
	
	static final double SALERATE = 0.7; // 상수 선언 - 상수는 변하지 않는 값, 변수는 변하는 값
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub	
	}
	public Calculator(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
		
	public int add() {
		return this.firstNum + this.secondNum;
		
	}
	
	public static int minus(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}
		
		
	}
	
