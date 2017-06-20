package TareaPeriodica;
import java.util.*;

public class Reloj extends TareaPeriodica {
	
    public Reloj(){
	super(60);
    }
	
    public String leerHora() {
	Calendar cal = new GregorianCalendar();
	return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
    }
	
    @Override
    public boolean necesitaEjecucion() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(ultimaEjecucion);
        cal.add(Calendar.SECOND, periodo);

        Calendar ahora = new GregorianCalendar();
        return ahora.before(cal);
    }

    @Override
    public int ejecutarTarea() {
        Calendar c = new GregorianCalendar();
        System.out.println(String.format("%d%d%d", c.get(Calendar.HOUR), c.get(Calendar.MINUTE), c.get(Calendar.SECOND)));
        return 0;
    }
    
    @Override
    public void run() {
        if(this.necesitaEjecucion()) {
            this.ejecutarTarea();
        }
    }
}