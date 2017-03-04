package WeekHashMapListeners;

import java.util.WeakHashMap;

class WeakHashMapListeners {
    WeakHashMap<String, Listener> weakHashMap = new java.util.WeakHashMap<>();

    void addListener(Listener l){
        weakHashMap.put(l.name, l);
    }

    void removeListener(String name){
        weakHashMap.remove(name);
    }

    void notifyListeners(){
        for(Listener listener : weakHashMap.values()){
            System.out.print("Observed: say your name");
            listener.handleEvent();
        }
    }
}
