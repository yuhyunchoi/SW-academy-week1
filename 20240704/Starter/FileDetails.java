import java.io.*;

public class FileDetails {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileDetails FileName");
            return;
        }
        
        else{
            String fileName = args[0];
            File file= new File(fileName);
            try (FileInputStream stream = new FileInputStream(file)) {
                char[] contents = new char[(int)file.length()];
                for(int i = 0; i< contents.length; i++){
                    contents[i] = (char)stream.read();
                }
                
                summerize(contents);
            

            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    static void summerize(char[] contents){
        int vowel = 0, consonats = 0, line = 0;

        for(char c : contents){
            if(Character.isLetter(c)){
                if("AEIOUaeiou".indexOf(c) != -1){
                    vowel++;
                }
                else{
                    consonats++;
                }
            }
            else if(c == '\n'){
                line++;
            }

            System.out.println("Character count : " + contents.length);
            System.out.println("Vowel count : " + vowel);
            System.out.println("Conasonats count : " + consonats);
            System.out.println("Line count : " + line);
        }
    }
}