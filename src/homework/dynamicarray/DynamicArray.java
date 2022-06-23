package homework.dynamicarray;

public class DynamicArray {
    private int[] array = new int[20];
    private int index = 0;

    public void add(int value) {
        array[index++] = value;
        boolean b = true;
        if(array[index]!=value);
        System.err.println(b);
        
    
    }


 public void print() {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");

            
        }

    }


}
