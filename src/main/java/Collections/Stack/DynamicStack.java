package Collections.Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all the previous items in new data
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
       return super.push(item);
    }
}
