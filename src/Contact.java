import java.util.ArrayList;

public class Contact {
    public static ArrayList<String>  word = new ArrayList<String>();
    public static ArrayList<String>  findword = new ArrayList<String>();

    public void aa (){
       /* public void Tabledriven() {
            Scanner scanner = new Scanner(System.in);

            boolean check = true;
            String input = scanner.next();
            char[] inputarray = input.toCharArray();

            String table[][] = {
                    {"q", "p"},
                    {"r", "p"},
                    {"r", "r"}
            };
            int now = 0;
            int index = 0;
            while (check) {
                char ch = inputarray[index];
                String nowchar = table[now][Integer.parseInt(String.valueOf(ch))];
                int a = getInt(nowchar);
                now = a;
                if (index == inputarray.length - 1) {
                    if (a != 2) {
                        System.out.println("비정상 종료!");
                        return;
                    } else {
                        System.out.println("정상 종료!");
                        return;
                    }
                }
                index++;
            }


        }
        static int getInt(String msg){
            if(msg.equals("p")){
                System.out.println("p");
                return 0;
            }else if(msg.equals("q")){
                System.out.println("q");
                return 1;
            }else {
                System.out.println("r");
                return 2;
            }
        }*/
    }
}


