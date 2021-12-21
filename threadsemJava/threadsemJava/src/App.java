public class App {

    class MinhaThread implements Runnable {
        private String nome;

        public MinhaThread(String nome) {
            this.nome = nome;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            for(int i = 1; i <= 20; i++) {

                System.out.println(nome + ": " + i);
            }
        }
    }
    public static void main(String[] args) {

        // criar duas threads 
        MinhaThread mt1 = new MinhaThread("Thread 1");
        // chamamos o método start() e não o run()
        Thread t1 = new Thread(mt1);
        t1.start();

        MinhaThread mt2 = new MinhaThread("Thread 2");
        // chamamos o método start()
        Thread t2 = new Thread(mt2);
        t2.start();

        System.exit(0);
    }
}
