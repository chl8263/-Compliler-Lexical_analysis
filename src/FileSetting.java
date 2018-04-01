import java.io.*;
import java.util.StringTokenizer;

public class FileSetting {
    public FileSetting() {

    }
    public void deWrite(){
        for(int i=0;i<Contact.findword.size();i++){
            System.out.println(Contact.findword.get(i));
        }
        System.out.println("총 갯수 --------->" + Contact.findword.size());
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\gyun_home\\Desktop\\hw2-out.txt");
            for(int i=0;i<Contact.findword.size();i++){
                writer.println(Contact.findword.get(i));
            }
            writer.println("Total Data Pattern----------> " + Contact.findword.size());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void doSetting() {
        String[] splite = null;
        StringTokenizer stringTokenizer;
        try {
            File file = new File("C:\\Users\\gyun_home\\Desktop\\hw2-sample.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {

                stringTokenizer = new StringTokenizer(line," ");
                int check = stringTokenizer.countTokens();
                int i=0;
                while (stringTokenizer.hasMoreElements()){
                    Contact.word.add(stringTokenizer.nextToken());
                    if(Contact.word.get(Contact.word.size()-1).contains(",")){
                        String aa = Contact.word.get(Contact.word.size()-1).substring(0,Contact.word.get(Contact.word.size()-1).length()-1);
                        Contact.word.remove(Contact.word.size()-1);
                        Contact.word.add(aa);
                        Contact.word.add(",");
                    }
                }
                if(Contact.word.get(Contact.word.size()-1).contains(".")){
                    //System.out.println(Contact.word.get(Contact.word.size()-1));
                    String aa = Contact.word.get(Contact.word.size()-1).substring(0,Contact.word.get(Contact.word.size()-1).length()-1);
                    Contact.word.remove(Contact.word.size()-1);
                    Contact.word.add(aa);
                }


                /*for(int i=0;stringTokenizer.hasMoreElements();i++) {
                    if(stringTokenizer.)
                    Contact.word.add(stringTokenizer.nextToken());

                }*/

                /*splite = line.split(" ");
                for (int i = 0; i < splite.length; i++) {

                    if (i != 0) {
                        Contact.word.add(splite[i]);
                    }
                }*/
            }
            bufferedReader.close();

           /* for (int i = 0; i < Contact.word.size(); i++) {

                System.out.println(Contact.word.get(i));

            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
