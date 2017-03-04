package WeekHashMapListeners;

class Listener {
    String name;

    Listener(String name){
        this.name = name;
    }

    void handleEvent(){

        System.out.println("Observer: my name is " + name);
    }
}














