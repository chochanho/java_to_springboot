package access.a;

public class PublicAccess {

    static void main() {
        PublicAccess n = new PublicAccess();
        defaultAccess n2 = new defaultAccess();
        defaultAccess2 n3 = new defaultAccess2();
    }
}

class defaultAccess{
     public defaultAccess(){
        System.out.println("실행됨");
    }
}
class defaultAccess2{


}

