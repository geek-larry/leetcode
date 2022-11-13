class Solution {
    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
    
    public static void main(String[] args) {
        String a ="00101";
        String b = "10001110";
        String res = addBinary(a,b);
        System.out.println(res);
    }
}
