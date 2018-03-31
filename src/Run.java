import java.util.Arrays;

public class Run {
    private String result = "";
    private FileSetting fileSetting;
    private String[] month = null;
    private String[] num1;
    private String[] num2;
    private final int nothing = -1;

    public Run() {
        fileSetting = new FileSetting();
        fileSetting.doSetting();

        init();
        analysis();
        //test();
    }

    public void analysis() {
        String table[][] = {
                //month  / num / num1 / num2 / ,
                {"_DT_MONTH", "x", "_DT_NUM2", "x", "x", "NOT"},  //_DT_START
                {"x", "_DT_NUM1", "_DT_NUM1", "_DT_NUM1", "_DT_COM1", "NOT"},   //_DT_MONTH
                {"x", "_DT_NUM1", "_DT_NUM1", "_DT_NUM1", "x", "NOT"},   //_DT_COM1
                {"x", "x", "x", "x", "_DT_COM2", "A_5"},   //_DT_NUM1
                {"x", "x", "x", "x", "x", "NOT"},   //_DT_COM2
                {"x", "x", "x", "x", "_DT_COM3", "NOT"},   //_DT_NUM2
                {"A_3", "x", "x", "x", "x", "NOT"}    //_DT_COM3
        };
        int index = 0;
        int line = 0;

        while (index != Contact.word.size()) {
            //String now  =  Contact.word.get(index);

            int row = stringCheck(Contact.word.get(index));

            //System.out.println(Contact.word.get(index));
            //System.out.println(row+"");
            String state = table[line][row];
            line = getline(state, Contact.word.get(index));
            index++;
        }
    }

    private int stringCheck(String msg) {
        if (Arrays.asList(month).contains(msg)) {
            return 0;
        }/* else if (Arrays.asList(num1).contains(msg) || Arrays.asList(num2).contains(msg)) {
            return 1;
        } */ else if (Arrays.asList(num1).contains(msg)) {
            return 2;
        } else if (Arrays.asList(num2).contains(msg)) {
            return 3;
        } else if (msg.equals(",")) {
            return 4;
        } else {
            return 5;
        }
    }

    private int getline(String msg, String nowString) {
        if (msg.equals("x")) {
            System.out.println("\n"+"_DT_START");
            result = "";
            return 0;
        }if (msg.equals("NOT")) {
            result = "";
            return 0;
        }  else if (msg.equals("_DT_MONTH")) {
            result += nowString + " ";
            System.out.println(result);
            System.out.println("_DT_MONTH");
            return 1;
        } else if (msg.equals("_DT_COM1")) {
            result += nowString+ " ";
            System.out.println(result);
            System.out.println("_DT_COM1");
            return 2;
        } else if (msg.equals("_DT_NUM1")) {
            result += nowString+ " ";
            System.out.println(result);
            System.out.println("_DT_NUM1");
            return 3;
        } else if (msg.equals("_DT_COM2")) {
            result += nowString+ " ";
            System.out.println(result);
            System.out.println("_DT_COM2");
            return 4;
        } else if (msg.equals("_DT_NUM2")) {
            result += nowString+ " ";
            System.out.println(result);
            System.out.println("_DT_NUM2");
            return 5;
        } else if (msg.equals("_DT_COM3")) {
            result += nowString+ " ";
            System.out.println(result);
            System.out.println("_DT_COM3");
            return 6;
        } else if (msg.equals("A_1_2")) {
            System.out.println("A_1_2");
            result += nowString;
            System.out.println(result+"\n");
            return 0;
        } else if (msg.equals("A_3")) {
            System.out.println("A_3");
            System.out.println(result+"\n");
            return 0;
        } else if (msg.equals("A_4")) {
            System.out.println("A_4");
            System.out.println(result+"\n");
            return 0;
        } else if (msg.equals("A_5")) {
            System.out.println("A_5");
            System.out.println(result+"\n");
            return 0;
        } else {
            return nothing;
        }
    }

    public void test() {

    }

    private void init() {
        month = new String[]{"Jan.", "January", "Feb.", "February", "Mar.", "March", "Apr.", "April", "May.", "May",
                "June.", "June", "July.", "July", "Aug.", "August", "Sept.", "September", "Oct.", "October",
                "Nov.", "November", "Dec.", "December"
        };
        num1 = new String[31];
        num2 = new String[2999];
        for (int i = 0; i < 31; i++) {
            num1[i] = String.valueOf(i + 1);
        }
        for (int i = 0; i < 2999; i++) {
            num2[i] = String.valueOf(i + 1);
        }

    }
}
