package ex3;

public class VectorXY {
    private int x1; //координаты точек на плоскости
    private int y1;
    private int x2;
    private int y2;

    public VectorXY(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    //Находим координаты вектора по двум точкам на плоскости
    public int getCor_X(){
        return x2 - x1;
    }

    public int getCor_Y(){
        return y2 - y1;
    }

    public double lengthVector(){
        //Находим координаты вектора по двум точкам на плоскости
        int cor_X = getCor_X();
        int cor_Y = getCor_Y();
        //находим длину
        double result = Math.sqrt(Math.pow(cor_X,2)+ Math.pow(cor_Y,2));
        return result;
    }


    @Override
    public String toString() {
        return "начало ("+x1+", "+y1+"), конец ("+x2+", "+y2+")";
    }
}
