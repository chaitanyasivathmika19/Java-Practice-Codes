class A{
    public void checkOut(){
        System.out.println("checking from A parent");
    }
    A(){
                System.out.println("checking from A parent const");
    }
}

class B extends A{
    public void check(){
        
        System.out.println("checking from B Child");
        // super.check();
    }

    B(){
         System.out.println("checking from B Child const");
    }
}

class SuperKey{
    public static void main(String[] args){
        B obj = new B();
        // obj.check();


    }
}