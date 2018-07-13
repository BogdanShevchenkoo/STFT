package Algorithms;

public class RunCode {

	public static void main(String[] args) {
		int N = 10; // сколько чисел Фибоначчи вывести в задаче от 2 до 30, выбрали 10
		
		int previousNumber = 1; 
		int currentNumber = 1; // Первое и второе число Фиб
		int sum; // переменная для записи суммы
	
		int A[] = new int[N]; // обьявляем массив А который размером с N
		A[0] = 1;
		A[1] = 1; // записываем в него первые два числа Фиб
		
		System.out.println(A[0]);
		System.out.println(A[1]); // выводим в консоль первые 2 числа
		
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


