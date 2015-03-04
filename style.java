// Type names are camel case.
class NamingExample {
    /** 
	* Multiple lines of Javadoc text, wrapped normally.
    * Methods and variables inside a class is named using 
    * camel case with first character being lower case. 
    * There needs to be a open line before methods. 
    * Use tabs instead of spaces.
    */

    // Static finals are to be upper case letters and underscrores
    public static final int A_CONSTANT_VALUE = 5;

    private int[] myArray = {1, 2, 3, 4, 5, 6};// this is fine
    private final int x = 10; // this is fine
    private Color color; // this also fine
    
    // The first word should be a verb.
    public void doSomething(int a, int b, int c, int d) {
        if(a >  b)
            return c;
        return d + 10;
    }
    
    //This is allowed
    void doNothing() {}
    
    /**
    * This is a comment
    * @param p1 bla bla bla 
    */
    public int method(String p1) { ... }
}