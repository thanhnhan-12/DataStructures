package DataStructures.Test;

public class Count {
    public static int count(int str[]) {
        int count = 0;

        for(int i = 0; str[i] != '\0'; i++) {
            // if(str[i] == ch) 
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        
    }
}
