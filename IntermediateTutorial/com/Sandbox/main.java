package com.Sandbox;

//class A {
//    A(){
//        System.out.println("a");
//    }
//}
//class B extends A{
//    B(){
//        System.out.println("b");
//    }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//        //Mapet m = new Mapet();
//
//        B b = new B();
class Porownanie{

    public static void main(String[]args) {

        int[][] tablica = {{1,2,3,4,5},{1,3,4}};
        int suma = 0;
        for (int i = 0; i <tablica.length ; i++){
            for(int j=0; j<tablica[i].length ; j++){
                suma = suma + tablica[i][j];

            }
        }
        System.out.println(suma);
    }
}
