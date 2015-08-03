class Weapons{
    //String name;// = "firearm";
    //int rounds;// = 500;
    
    void shoot(){
        System.out.println("kapoww!");
    }
}

 class App{
    public static void main(String[] args){
        Weapons mark5 = new Weapons();
        mark5.shoot();
        System.out.println(mark5.shoot);
    }
}