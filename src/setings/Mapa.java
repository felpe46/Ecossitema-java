package setings;

import java.util.Scanner;

public class Mapa {
    Scanner sc = new Scanner(System.in);

    char ponto = '.';

    int mapSize;
    char [][] map;

    public void map(int mapSize){
        this.mapSize = mapSize;
        map = new char[mapSize][mapSize];
        for (int j = 0;j < mapSize; j++){
            for(int h = 0; h < mapSize; h++){
                map[j][h] = ponto;
            }
        }
        for (int j = 0;j < mapSize; j++){
            for(int h = 0; h < mapSize; h++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(map[j][h]);
            }
            System.out.println();
        }
    }
}
