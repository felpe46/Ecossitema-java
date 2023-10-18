package setings;

import java.util.Random;

public class Spawn extends Mapa {
    Random gerador = new Random();
    public void gen() {
        this.map[0][0] = 'L';
    }

}
