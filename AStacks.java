public class AStacks {
	
	int[] arr= new int[4];
	
	int top=0;
	
	
	public void push(int value){
		
		if(top==4){
		    System.out.println("Stack is full, you can't add anything from the top!");
	    }
		    else{
		        arr[top]= value;
		        top++;
		
		}
	
	
	}
	public void show(){
		for(int i : arr){
			
			System.out.print(i +" ");
		}
		System.out.println();
	} 
	
	public int pop(){
		int value=0;
		
		if(top==0){
			
			System.out.println("Stack is Empty, there is nothing to remove!");
		}	
			else{
				top--;
		        value= arr[top];
		        arr[top]= 0;
			}
		
		return value;
	}
	
	public static void main(String[] args){
		
		AStacks item= new AStacks();
		item.pop();
		item.push(24);
		item.push(60);
		item.push(14);
		item.push(256);
		item.show();
		item.push(11);
		item.pop();
		item.show();
		item.pop();
		item.show();
		item.push(99);
		item.show();
	}
	
}