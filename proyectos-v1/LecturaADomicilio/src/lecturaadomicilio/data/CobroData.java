/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaadomicilio.data;

/**
 *
 * @author Pablo
 */
public class CobroData {
    int id;
    int cobro;
    double total;
    String token_paypal;
    boolean completado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public int getCobro() {
        return cobro;
    }

    public void setCobro(int cobro) {
        this.cobro = cobro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getToken_paypal() {
        return token_paypal;
    }

    public void setToken_paypal(String token_paypal) {
        this.token_paypal = token_paypal;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    
    
    
}
