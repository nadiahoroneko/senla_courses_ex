package ex3;

/*На вход приходят 2 вектора, описанные координатами точек начала (x1,y1) и конца (x2,y2) вектора.
  Найти длины векторов, а так же вектор произведения первого вектора на второй и
  второго на первый (получим 2 новых вектора). Векторы выводить в формате “начало (x1,y1), конец (x2,y2).
*/

public class Main {
    public static void main(String[] args){
        //2 вектора заданы координатами точек
        VectorXY v1 = new VectorXY(1,1,2,3);
        VectorXY v2 = new VectorXY(1,1,2,2);

        System.out.println("Длины "+v1.lengthVector()+" "+v2.lengthVector());
        System.out.println("Умножение первого на второй: "+multVectors1(v1,v2));
        System.out.println("Умножение второго на первый: "+multVectors1(v2,v1));
    }

    //умножение двух векторов v1'*v2
    public static VectorXY multVectors1(VectorXY v1, VectorXY v2) {
        int x1 = v1.getCor_X()*v2.getCor_X();
        int y1 = v1.getCor_X()*v2.getCor_Y();
        int x2 = v1.getCor_Y()*v2.getCor_X();
        int y2 = v1.getCor_Y()*v2.getCor_Y();
        return new VectorXY(x1,y1,x2,y2);
    }

    //скалярное умножение векторов
    public static int multVectors2(VectorXY v1, VectorXY v2) {
        return v1.getCor_X()*v2.getCor_X()+v1.getCor_Y()*v2.getCor_Y();
    }
}
