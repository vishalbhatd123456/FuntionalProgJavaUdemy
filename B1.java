// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
    }
    public static <T> List<T> cloneWithoutNulls(final List<T> list){
        List<T> out = new ArrayList<T>(list);
        while(out.remove(null)){
            //removes all the occurrences of the null
        }
        return out;
    }
    public static<T> List<T> cloneWithoutNullsNewImplementation(final List<T> list){
        List<T> out = new ArrayList<T>(list.size());
        for(T elt : list){
            if(elt!=null)out.add(e);
        }
    }
    return out;
    
}
