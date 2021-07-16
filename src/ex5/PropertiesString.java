package ex5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PropertiesString {
    private int[] countsVowel;
    private String[] arrStr;

    public PropertiesString(String str) {
        arrStr = str.split(" ");
        countsVowel = new int[arrStr.length];
    }

    public String sortByVowel() {
        getCountVowel();
        sortWordByVowel();
        upperCaseFirstVowelChar();

        return Arrays.toString(arrStr);
    }

    //количество гласных
    private void getCountVowel(){
        Pattern pattern = Pattern.compile("[aeiouyаеёиоуыэюя]");
        for (int i = 0; i < arrStr.length; i++) {
            Matcher matcher = pattern.matcher(arrStr[i].toLowerCase());
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            countsVowel[i] = count;
        }
    }

    //сортировка по количеству гласных
    private void sortWordByVowel(){
        for(int i = 0; i < countsVowel.length; i++){
            for(int j = 0; j < countsVowel.length; j++){
                if(countsVowel[i] > countsVowel[j]){
                    int tmp = countsVowel[i];
                    countsVowel[i] = countsVowel[j];
                    countsVowel[j] = tmp;
                    String tmpStr = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = tmpStr;
                }
            }
        }
    }

    //сделать заглавной гласную букву
    private void upperCaseFirstVowelChar(){
        for(int i = 0; i < arrStr.length; i++){
            if (arrStr[i].substring(0,1).matches("[aeiouyаеёиоуыэюя]")) {
                arrStr[i] = arrStr[i].substring(0,1).toUpperCase() + arrStr[i].substring(1);
            }
        }
    }
}
