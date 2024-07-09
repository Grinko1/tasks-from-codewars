package codewars.tasks;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(4,4));
    }
    public static int areaOrPerimeter (int l, int w) {
//        if (l == w){
//            return l *w;
//        }else{
//            return( l+w) *2;
//        }
        return  l == w ? l *w : ( l+w) *2;

    }
}
