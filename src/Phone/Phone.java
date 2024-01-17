package Phone;

import java.util.Arrays;

public class Phone {
    public int number;

    public int weight;

    public String model;

    public Phone(String model, int number, int weight) {
      this(model, number);
        this.weight = weight;
    }

    public Phone(String model, int number) {
        this.number = number;
        this.model = model;

    }

    public Phone() {

    }

    @Override
    public String toString() {
        return this.model+" "+this.number+" "+this.weight;
    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит"+ " "+ name);
    }

    public void receiveCall(String name, int number)
    {
        System.out.println("Звонит" + " "+ name + " " + number);
    }

    public int getNumber() {
    return  number;
}
public void sendMessage(int...numbers){
        System.out.println(Arrays.toString(numbers));
}



}
