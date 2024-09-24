import classes.Box;

public class Main {
    public static void main(String[] args)
    {
        Box myBox = new Box(10);
        System.out.println(myBox.getHeight()+"/"+myBox.getLength()+"/"+ myBox.getWidth());
        Box x2Box = myBox.Increase();
        System.out.println(x2Box.getHeight()+"/"+x2Box.getLength()+"/"+ x2Box.getWidth());
    }
}