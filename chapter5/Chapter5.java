class Chapter5 {
    public static void main(String[] args) {
        Chapter5 note = new Chapter5(); 
        note.init(); 
    }

    public void init() {
        double max = maximum();
        System.out.println("Maximum value is: " + max); 
    }

    public double maximum() {
        double x = 2.0, y = 3.0, z = 7.0; 
        
        return Math.max(x, Math.max(y, z));
    }
}











































