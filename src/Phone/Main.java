package Phone;

public class Main {
    public static void main(String[] args){

    Phone phone1 = new Phone("Iphone",8842075,200);
    Phone phone2 = new Phone("Google",3536262,210);
    Phone phone3 = new Phone("Samsung",6568899);
    Phone phone4 = new Phone();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4.toString());
      phone1.receiveCall("Artem" + phone1.getNumber());
      phone2.receiveCall("Bomj" +  phone2.getNumber());
      phone3.receiveCall("Irina",6568899);
      phone4.receiveCall("yra", 3232244);


        phone1.sendMessage(8842075,3536262,6568899,3232244);
    }
}