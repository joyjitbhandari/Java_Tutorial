public class Strings {
    public static void main(String[] args){
        // Strings : this strings are immutable
        // Concatenate: It means joning two strings.
        String name = "Joy";
        String name2 = "jit";
        String name3 = name+name2+" Bhandari \n";
        System.out.println(name3);

        //charAt: Checking the index of character in string.
        System.out.println(name.charAt(0)+"\n");

        //length: its shows string total length.
        System.out.println(name3.length()+"\n");

        //replace: Its replaces the character in string.
        String name4 = name.replace('J','B');
        System.out.println(name4);

        // subsrting : its shows particular word from a sentence in string.
        String sentence = "My name is joyjit";
        System.out.println(sentence.substring(11,17));
    }
}
