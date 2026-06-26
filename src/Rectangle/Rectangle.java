package Rectangle;

public class Rectangle {

    int width;
    int height;
    int area;

    void calculateArea(){

        if(width!=0&& height!=0)
            System.out.println("넓이는: "+width*height);
        else
            System.out.println("아직 넓이와 놆이가 입력이 안돼었습니다.");
    }
    void calculatePerimeter(){

        if(width!=0&& height!=0)
            System.out.println("둘레는: "+(width+height)*2);
        else
            System.out.println("아직 넓이와 놆이가 입력이 안돼었습니다.");
    }
    void isSquare(){

        if(width!=0&& height!=0){
            if(width== height)
                System.out.println("정사각형입니다.");
            else
                System.out.println("정사각형이 아닙니다.");

        }

        else
            System.out.println("아직 넓이와 놆이가 입력이 안돼었습니다.");
    }




}
