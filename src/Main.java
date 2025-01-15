import com.observer.DashboardObserver;
import com.observer.EmailObserver;
import com.observer.LogObserver;
import com.subject.StockSubject;

public class Main {
    public static void main(String[] args) {
        // Sujeito
        StockSubject stock = new StockSubject("Notebook Dell", 10);

        // Observadores
        EmailObserver emailObserver = new EmailObserver();
        LogObserver logObserver = new LogObserver();
        DashboardObserver dashboardObserver = new DashboardObserver();

        // Registrando observadores
        stock.addObserver(emailObserver);
        stock.addObserver(logObserver);
        stock.addObserver(dashboardObserver);

        // Simulando movimenta��o de estoque
        stock.decreaseStock(3);  // N�o dispara alerta
        stock.decreaseStock(2);  // Alerta � disparado
        stock.decreaseStock(1);  // Alerta continua sendo disparado
    }
}
