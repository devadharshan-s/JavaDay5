import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

class ProductNotFoundExceptionMain{

    static Map<Integer,String> m = new HashMap<Integer,String>(){{
        put(1,"Laptop");
        put(2,"Monitor");
        put(3,"GPU");
        put(4,"CPU");
        put(5,"Mouse");
        put(6,"Keyboard");
    }};

    static void findProductById(int id) throws ProductNotFoundException{
        if(!m.containsKey(id))
            throw new ProductNotFoundException("Product not found");
        else System.out.println(m.get(id));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id: ");
        try {
            int id = sc.nextInt();
            findProductById(id);
        }catch (ProductNotFoundException e) {
            System.out.println(e);
        }
    }
}
