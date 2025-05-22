package Java_Oops.abstraction;//package Java_Oops.abstraction;
//
//! toh kya ham car ka object banayenge , nhi , kyunki car ka object bna ke ham kuch nhi kr skte , car class ek concept isiliy hm usko abstarct class bana dete hai jisse uska koi object nah ban paaye

//? ab hm bs iske chidren ka object bna sakte hai but abstract class ka nhi
//
//
// abstract class Car{
//    int price;
//
//
//? toh ham fucntion ko bhi abstract bna denge , aur phir hm is function ko implement nhi kar sakte yha
//! ise ham children class me implement krenge(defination)
//    abstract void start();
//
//}
//
//class Audi extends Car
//{
//
    //! hme yha se abstract fucntion ko implement krna hi padega wrna compile time error ayega
//@Override
//? iske liy @override keyword use krte hai
//void start()
//{
//    System.out.println("audi is starting...");
//}
//
//}
//
//class Bmw extends Car{
//
//    @Override
//? iske liy @override keyword use krte hai
//void start()
//{
//    System.out.println("Bmw is starting...");
//}
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//    }
//
//}
//
//! note : abstract fucntion ke sath class ko abstract banana jaruri hai
