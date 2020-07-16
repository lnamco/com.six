package testqqq;



class SaleThread implements Runnable {
	private int tickets = 100; 
	public void run() {
		while (true) {
			saleTicket(); 
		}
	}//****************************8
	private void saleTicket()
	{
		if (tickets > 0) {
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() 
					             + " 正在发售第 " + tickets-- + " 张票 ");
			
		}
	}
}
 class TicketOne {

	public static void main(String[] args) {
		SaleThread saleThread = new SaleThread();
		new Thread(saleThread, "窗口1").start();
		new Thread(saleThread, "窗口2").start();
		new Thread(saleThread, "窗口3").start();
		new Thread(saleThread, "窗口4").start();

	}
}
class TicketWindow2 implements Runnable{
    private int tickets = 100;
    public void run(){
        while (true){
            if (tickets>0){
                Thread th = Thread.currentThread();//获取当前线程
                String th_name = th.getName();//获取线程的名字
                System.out.println(th_name+"正在发售第"+ tickets-- +"张票！");
            }
        }
    }
}
class TicketWindow extends Thread{
    private int tickets = 100;
    public void run(){
        while (true){
            if (tickets>0){
                Thread th = Thread.currentThread();
                String th_name = th.getName();
                System.out.println(th_name+"正在发售第"+ tickets-- +"张票！");
            }
        }
    }
}
// class TicketThread {
//    public static void main(String[] args) {
//        new TicketWindow().start();
//        new TicketWindow().start();
//        new TicketWindow().start();
//        new TicketWindow().start();
//    }
//}
public class run {

	public static void main(String[] args) {
        TicketWindow2 ticketWindow = new TicketWindow2();
        new Thread(ticketWindow).start();
        new Thread(ticketWindow).start();
        new Thread(ticketWindow).start();
        new Thread(ticketWindow).start();
	}}
