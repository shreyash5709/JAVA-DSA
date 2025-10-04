public class _8_append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append("***");
        System.out.println(sb);
        char[] ch = {'a', 'b', 'c', 'd'};
        sb.append(ch);
        System.out.println(sb);
        // int[] arr = {1,2,3,4,5}; // does not work address is appended.
        // sb.append(arr);
        // System.out.println(sb);
        StringBuilder s = new StringBuilder("tqr");
        sb.append(s);
        System.out.println(sb);
    }
}
