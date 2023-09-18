public class RelogioDigital {
    private int hora;
    private int minuto;

    public RelogioDigital() {
        this.hora = 12;
        this.minuto = 20;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida. A hora deve estar entre 0 e 23.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido. O minuto deve estar entre 0 e 59.");
        }
    }

    public void tick() {
        if (minuto < 59) {
            minuto++;
        } else {
            minuto = 0;
            if (hora < 23) {
                hora++;
            } else {
                hora = 0;
            }
        }
    }
}