public class Table extends Furniture {
        private String shape;
    
        public Table(String s1, int h1, String n, int p, int q, int t, String m, int w, int l) {
            super(n, p, q, t, m, w, l);
            this.shape = s1;
        }
    
        public void setShape(String s1) {
            this.shape = s1;
        }
    
        public String getShape(){
            return shape;
        }

        @Override
        public String toString(){
            return String.format(super.toString() + "Shape: %d KG", shape);
        }
    
    
}
