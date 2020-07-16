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
					             + " ���ڷ��۵� " + tickets-- + " ��Ʊ ");
			
		}
	}
}
 class TicketOne {

	public static void main(String[] args) {
		SaleThread saleThread = new SaleThread();
		new Thread(saleThread, "����1").start();
		new Thread(saleThread, "����2").start();
		new Thread(saleThread, "����3").start();
		new Thread(saleThread, "����4").start();

	}
}
class TicketWindow2 implements Runnable{
    private int tickets = 100;
    public void run(){
        while (true){
            if (tickets>0){
                Thread th = Thread.currentThread();//��ȡ��ǰ�߳�
                String th_name = th.getName();//��ȡ�̵߳�����
                System.out.println(th_name+"���ڷ��۵�"+ tickets-- +"��Ʊ��");
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
                System.out.println(th_name+"���ڷ��۵�"+ tickets-- +"��Ʊ��");
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
