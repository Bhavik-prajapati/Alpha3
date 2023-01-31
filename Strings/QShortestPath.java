package Strings;
//      N
//      |
//W<----|---->E
//      |
//      S
//n=y+1
//s=y-1
//w=x-1
//e=x+1
//formula to find shortest path=sqrt((x2-x1)^2+(y2-y1)^2))


public class QShortestPath {

    public static float getShortestPath(String path)
    {
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }else if(dir=='N'){
                y++;
            }else if(dir=='W'){
                x--;
            }else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);

    }

    public static void main(String[] args) {

//        String path="WNEENESENNN";
        String path="NS";
        System.out.println(getShortestPath(path));



    }
}
