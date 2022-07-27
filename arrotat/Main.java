package arrotat;

public class Main
{
	public static void main(String[] args) 
	{
		Arrot r = new Arrot();
        		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        		for(int i=0;i<arr.length;i++)
        		{
            			System.out.print(arr[i]+" ");
        		}
        		System.out.print("\nAFTER ROTATION\n\n");
        		r.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++)
        		{
            			System.out.print(arr[i]+" ");
        		}
	}
}