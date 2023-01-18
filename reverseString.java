public class ReverseString {

    public static void main(String[] args) {
        String reversed = reverseString( "Reverse this string." );
        
        System.out.println( reversed );
    }
    
    public static String reverseString( String newString ) {
        // cleans up string if there are any extra spaces
        String myStringAfter = newString.trim().replaceAll(" +", " ");
        // breaks string into an array that we can iterate through
        String[] myStringArray = myStringAfter.split("");
        
        String reversed = "";
        int i;
        
        for( i = myStringArray.length -1; i >= 0; i-- ) {
            reversed += myStringArray[i];
        }
        
        return reversed;
    }
}