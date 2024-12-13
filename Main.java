//package brm;

//public class Main {
    //public static void main(String []args){
        //BookFrame b=new BookFrame();
    //}
//}

package brm;

public class Main {
    public static void main(String[] args) {
        // Ensuring the UI is created on the Event Dispatch Thread (EDT)
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookFrame();
            }
        });
    }
}
