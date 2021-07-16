package ex7;

import java.util.List;

public class Safe {
    int volume;
    SafeCell[][] arrSafe;

    public Safe(int volume) {
        this.volume = volume;
    }

    public SafeCell addToSafe(List<Thing> things){
        arrSafe = new SafeCell[things.size()+1][volume+1];

        for(int i = 0; i < arrSafe.length; i++){
            for(int j = 0; j < arrSafe[i].length; j++){
                if(i == 0 || j == 0){
                    arrSafe[i][j] = new SafeCell();
                }
                else{
                    if (things.get(i - 1).getVolume() > j) {
                        arrSafe[i][j] = getSafeCell(i-1,j);
                    }
                    else {
                        int newPrice = things.get(i - 1).getPrice() + arrSafe[i - 1][j - things.get(i - 1).getVolume()].getSumPrice();
                        if(arrSafe[i - 1][j].getSumPrice() > newPrice){
                            arrSafe[i][j] = getSafeCell(i-1,j);
                        }else{
                            arrSafe[i][j] = getSafeCell(i - 1,j - things.get(i - 1).getVolume());
                            arrSafe[i][j].addThing(things.get(i - 1));
                        }
                    }
                }
            }
        }
        return arrSafe[arrSafe.length-1][arrSafe[0].length-1];
    }

    private SafeCell getSafeCell(int i, int j){
       return new SafeCell(arrSafe[i][j].getThings());
    }

}
