package Algorithms;

public class RunCode {

	public static void main(String[] args) {
		int N = 10; // ������� ����� ��������� ������� � ������ �� 2 �� 30, ������� 10
		
		int previousNumber = 1; 
		int currentNumber = 1; // ������ � ������ ����� ���
		int sum; // ���������� ��� ������ �����
	
		int A[] = new int[N]; // ��������� ������ � ������� �������� � N
		A[0] = 1;
		A[1] = 1; // ���������� � ���� ������ ��� ����� ���
		
		System.out.println(A[0]);
		System.out.println(A[1]); // ������� � ������� ������ 2 �����
		
		for(int i = 2;i < N;i++){ 
			
			sum = previousNumber+currentNumber;
			System.out.println(sum);
			previousNumber = currentNumber;
			currentNumber=sum;
			if(currentNumber == 0){
				currentNumber++;
			}
		}
		
		
		
		}
	}


